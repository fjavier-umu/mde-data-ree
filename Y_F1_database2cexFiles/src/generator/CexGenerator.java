package generator;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import gda.um.es.*;

public class CexGenerator {
	public static void main(String[] args) {
		try {
			// SchemaConnection
			// schemaConnection=SchemaConnection.getSchemaConnection(SchemaConnection.JDBC,
			// "com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/TORNEOS",
			// "root", "yoshiki");
			// Schema schema=schemaConnection.getSchema("TORNEOS", "TORNEOS");

			if (args.length<1) {
				System.out.println("ERROR: Debe indicar un paramtero con el numero de filas a considerar");
				return;
			}
			else {
				
			int numRows = Integer.parseInt(args[0]);
			
			SchemaConnection schemaConnection = SchemaConnection
					.getSchemaConnection(SchemaConnection.JDBC,
							"oracle.jdbc.OracleDriver",
							"jdbc:oracle:thin:@//www.modelum.es:1521/XE",
							"OSCARMASTER", "OSCARMASTER");
			Schema schema = schemaConnection.getSchema("OSCARMASTER",
					"OSCARMASTER", numRows);

			HashMap<String, Table> tables = schema.getTables();
			TreeSet<String> tablesNames = new TreeSet<String>(tables.keySet());
			for (String tableName : tablesNames) {
				FileWriter cexFile = null;
				PrintWriter pw = null;
				String cexFileName = "/root/generatedCexFiles/" + tableName
						+ ".cex";
				try {
					Table table = schema.getTable(tableName);
					ArrayList<Row> rows = table.getRows();

					if (rows.size() > 0) {
						System.out.println("CEX: " + tableName + ".cex : "
								+ rows.size());
						long iniTime = System.currentTimeMillis();
						cexFile = new FileWriter(cexFileName);
						pw = new PrintWriter(cexFile);
						pw.write("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n");
						pw.write("<ConceptualSystem>\n");
						pw.write("\t<Version MajorNumber=\"1\" MinorNumber=\"0\"/>\n");
						pw.write("\t<Contexts>\n");
						pw.write("\t\t<Context Identifier=\"0\" Type=\"Binary\">\n");
						pw.write("\t\t\t<Attributes>\n");
						HashMap<String, Attribute> attributes = table
								.getAttributes();
						Set<String> attributesNames = attributes.keySet();
						HashMap<String, Integer> attributesIds = new HashMap<String, Integer>();
						int attributeId = 0;
						HashMap<String, HashMap<Object, ArrayList<Integer>>> invertedIndexFiles = new HashMap<String, HashMap<Object, ArrayList<Integer>>>();
						for (String attributeName : attributesNames) {
							invertedIndexFiles.put(attributeName,
									new HashMap<Object, ArrayList<Integer>>());
							attributesIds.put(attributeName, attributeId);
							pw.write("\t\t\t\t<Attribute Identifier=\""
									+ attributeId + "\">\n");
							pw.write("\t\t\t\t\t<Name>" + attributeName
									+ "</Name>\n");
							pw.write("\t\t\t\t</Attribute>\n");
							attributeId++;
						}
						pw.write("\t\t\t</Attributes>\n");
						pw.write("\t\t\t<Objects>\n");
						for (int k = 0; k < rows.size(); k++) {
							Row row = rows.get(k);
							HashMap<Integer, ArrayList<Attribute>> commonRowsAndAttributes = new HashMap<Integer, ArrayList<Attribute>>();
							for (String attributeName : attributesNames) {
								Attribute attribute = attributes
										.get(attributeName);
								Object value = row.getValue(attribute);
								// Si el valor es nulo no lo consideramos a la
								// hora de obtener las filas
								// comunes
								if (value != null
										&& !value.toString().equals("")) {
									HashMap<Object, ArrayList<Integer>> invertedIndex = invertedIndexFiles
											.get(attribute.getName());
									ArrayList<Integer> rowsNumbers = invertedIndex
											.get(value);
									if (rowsNumbers != null) {
										rowsNumbers.add(k);
										for (int rowNumber : rowsNumbers) {
											if (commonRowsAndAttributes
													.get(rowNumber) == null) {
												ArrayList<Attribute> commonAttributes = new ArrayList<Attribute>();
												commonAttributes.add(attribute);
												commonRowsAndAttributes.put(
														rowNumber,
														commonAttributes);
											} else {
												commonRowsAndAttributes.get(
														rowNumber).add(
														attribute);
											}
										}
									} else {
										ArrayList<Integer> newRowsNumbers = new ArrayList<Integer>();
										newRowsNumbers.add(k);
										invertedIndex
												.put(value, newRowsNumbers);
									}
								}
							}
							Set<Integer> commonRows = commonRowsAndAttributes
									.keySet();

							for (Integer rowNumber : commonRows) {
								if (k != rowNumber) {
									Row row2 = rows.get(rowNumber);
									pw.write("\t\t\t\t<Object>\n");
									pw.write("\t\t\t\t\t<Name>");
									pw.write("(");

									for (Object value : row.getListValues()) {
										if (value != null) {
											pw.write("'");
											pw.write(value.toString());
											pw.write("'");
										} else
											pw.write("\'\'");
										if (row.getListValues().indexOf(value) != row
												.getListValues().size() - 1)
											pw.write(",");
									}
									pw.write(")");
									pw.write("(");
									for (Object value : row2.getListValues()) {
										if (value != null) {
											pw.write("'");
											pw.write(value.toString());
											pw.write("'");
										} else
											pw.write("\'\'");
										if (row2.getListValues().indexOf(value) != row2
												.getListValues().size() - 1)
											pw.write(",");
									}
									pw.write(")");
									pw.write("</Name>\n");
									pw.write("\t\t\t\t\t<Intent>\n");
									ArrayList<Attribute> commonAttributes = commonRowsAndAttributes
											.get(rowNumber);
									for (Attribute attribute : commonAttributes) {
										pw.write("\t\t\t\t\t\t<HasAttribute AttributeIdentifier=\""
												+ attributesIds.get(attribute
														.getName()) + "\"/>\n");
									}
									pw.write("\t\t\t\t\t</Intent>\n");
									pw.write("\t\t\t\t</Object>\n");
								}
							}
						}
						pw.write("\t\t\t</Objects>\n");
						pw.write("\t\t</Context>\n");
						pw.write("\t</Contexts>\n");
						pw.write("\t<RecalculationPolicy Value=\"Clear\"/>\n");
						pw.write("\t<Lattices/>\n");
						pw.write("</ConceptualSystem>\n");
						
						System.out.println("File created in " + (Math.rint(((System.currentTimeMillis() - iniTime)/(1000.0*60.0))*100)/100) + " minutes." );
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (cexFile != null)
							cexFile.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}