package gda.um.es.jdbc;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import gda.um.es.Attribute;
import gda.um.es.Row;
import gda.um.es.Table;

public class TableJDBC implements Table {

	/**
	 * Constant value for the product name returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseProductName()} when connected
	 * to Oracle.
	 */
	private static final String PRODUCT_ORACLE = "Oracle";

	/**
	 * Constant value for the product name returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseProductName()} when connected
	 * to DB2.
	 */
	private static final String PRODUCT_DB2 = "db2";

	/**
	 * Constant value for the product name returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseProductName()} when connected
	 * to HSQL Database Engine.
	 */
	private static final String PRODUCT_HYPERSONIC = "HSQL Database Engine";

	/**
	 * Constant value for the product name returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseProductName()} when connected
	 * to Microsoft SQL Server.
	 */
	private static final String PRODUCT_MSSQL = "Microsoft SQL Server";

	/**
	 * Constant value for the product name returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseProductName()} when connected
	 * to PostgreSQL.
	 */
	private static final String PRODUCT_POSTGRES = "PostgreSQL";

	/**
	 * Constant value for the product name returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseProductName()} when connected
	 * to MySQL.
	 */
	private static final String PRODUCT_MYSQL = "MySQL";

	/**
	 * Constant value for the product name returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseProductName()} when connected
	 * to Apache Derby.
	 */
	private static final String PRODUCT_DERBY = "Apache Derby";

	/**
	 * Constant value for the product name returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseProductName()} when connected
	 * to Sybase Adaptive Enterprise Server.
	 */
	private static final String PRODUCT_SYBASE = "Adaptive Server Enterprise";

	private DatabaseMetaData metadata;
	private String name;
	private SchemaJDBC schema;
	private HashMap<String, Attribute> attributes;
	private HashMap<String, Attribute> primaryKey;
	private AccessorHelper accessor = null;

	private LinkedList<Row> rows;

	public TableJDBC(SchemaJDBC schema, String name, DatabaseMetaData metadata, int numRows) {
		attributes = new HashMap<String, Attribute>();
		primaryKey = new HashMap<String, Attribute>();
		this.schema = schema;
		this.name = name;
		this.metadata = metadata;

		ResultSet rs = null;
		try {
			rs = this.metadata.getColumns(this.schema.getCatalogName(),
					this.schema.getSchemaName(), this.name, "%");
			while (rs.next()) {
				AttributeJDBC attribute = new AttributeJDBC(this,
						rs.getString("COLUMN_NAME")/* , metadata */);
				attributes.put(attribute.getName(), attribute);
			}
			rs.close();

			rs = this.metadata.getPrimaryKeys(this.schema.getCatalogName(),
					this.schema.getSchemaName(), this.name);
			while (rs.next()) {
				primaryKey.put(rs.getString("COLUMN_NAME"),
						attributes.get(rs.getString("COLUMN_NAME")));
			}
			rs.close();

			// TODO faltan resto de AccessorHelper segun BBDD: solo
			// implementados Oracle y MySQL
			if (this.metadata.getDatabaseProductName().contains(PRODUCT_MYSQL)) {
				accessor = new AccessorHelperMySQL(primaryKey);
			} else if (this.metadata.getDatabaseProductName().contains(
					PRODUCT_ORACLE)) {
				accessor = new AccessorHelperOracle(primaryKey);
			}
			System.out.println("Table: " + this.name);

			rows = new LinkedList<Row>();
			Row row = null;
			try {
				Statement stm = this.schema.getConnection().createStatement();
				rs = stm.executeQuery(accessor.accessAllValues(this.name, numRows));

				int position = 1;
				while (rs.next()) {
					row = new RowJDBC(this, position);
					Iterator<String> iter = attributes.keySet().iterator();
					while (iter.hasNext()) {
						String key = (String) iter.next();
						row.addValue(key, rs.getObject(key));
					}
					rows.add(row);
					position++;
				}

				rs.close();
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getName() {
		return name;
	}

	@Override
	public ArrayList<Row> getRows() {

		/*ArrayList<Row> rows = new ArrayList<Row>();
		int count = getRowsNumber();

		for (int i = 1; i <= count; i++)
			rows.add(getRow(i));
		*/
		return new ArrayList<Row>(rows);
		
	}

	@Override
	public Row getRow(int position) {
		/*Row row = null;
		try {
			Statement stm = this.schema.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(accessor.accessValues(this.name,
					position));
			row = new RowJDBC(this, position);
			if (rs.next()) {
				Iterator<String> iter = attributes.keySet().iterator();
				while (iter.hasNext()) {
					String key = (String) iter.next();
					row.addValue(key, rs.getObject(key));
				}
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return row;*/
		return rows.get(position);
	}

	@Override
	public int getRowsNumber() {
		Statement stm;
		int count = -1;
		try {
			stm = this.schema.getConnection().createStatement();
			ResultSet rs = stm
					.executeQuery("Select count(*) FROM " + this.name);
			if (rs.next())
				count = rs.getInt(1);
			rs.close();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public HashMap<String, Attribute> getAttributes() {
		return attributes;
	}

	@Override
	public Attribute getAttribute(String name) {
		return attributes.get(name);
	}

	public Object getValue(int row, Attribute col) {
		/*Object value = null;
		try {
			Statement stm = this.schema.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(accessor.accessValue(col.getName(),
					this.name, row));
			if (rs.next())
				value = rs.getObject(col.getName());
			rs.close();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;*/
		Row aRow = getRow(row);
		return aRow.getValue(col);
	}

	public Object getValue(Row row, Attribute col) {
		return getValue(row.getPosition(), col);
	}

}
