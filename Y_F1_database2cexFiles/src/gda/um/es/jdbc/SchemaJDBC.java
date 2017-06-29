package gda.um.es.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;

import gda.um.es.Schema;
import gda.um.es.Table;

public class SchemaJDBC implements Schema{
	private String schema;
	private String catalog;
	private Connection connection;
	private HashMap<String, Table> tables;
	
	protected SchemaJDBC(String catalog, String schema, Connection connection, int numRows){
		this.tables =  new HashMap<String, Table>();
		this.catalog = catalog;
		this.schema = schema;
		this.connection = connection;
		String[] types = {"TABLE"};
		
		try {
			DatabaseMetaData metaData = this.connection.getMetaData();
			ResultSet rs = metaData.getTables(catalog,schema,"%",types);
			
			while (rs.next()){
				  TableProxyJDBC table = new TableProxyJDBC(this, rs.getString("TABLE_NAME"), metaData, numRows);
				  tables.put(table.getName(), table);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}	
	
	public Schema getSchema(){
		return this;
	}
	public String getSchemaName(){
		return this.schema;
	}
	public String getCatalogName(){
		return this.catalog;
	}
	public Connection getConnection(){
		return this.connection;
	}
	@Override
	public HashMap<String, Table> getTables() {		
		return tables;
	}

	@Override
	public Table getTable(String name) {
		
		return tables.get(name);
	}
	
}
