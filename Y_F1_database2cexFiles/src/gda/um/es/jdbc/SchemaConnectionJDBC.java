package gda.um.es.jdbc;

import gda.um.es.Schema;
import gda.um.es.SchemaConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SchemaConnectionJDBC extends SchemaConnection {
	private Connection connection = null;
	private String driverClass,url;
	
	public SchemaConnectionJDBC(String driverClass, String url, String user, String password){
		super(user, password);
		this.driverClass = driverClass;
		this.url = url;
		
		try {
			Class.forName(this.driverClass);
			connection = DriverManager.getConnection(this.url, user, password);			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Schema getSchema(String catalog, String schema, int numRows) {
		this.catalog = catalog;
		this.schema = schema;
		SchemaJDBC schemaJDBC = new SchemaJDBC(this.catalog, this.schema, this.connection, numRows);			
		return schemaJDBC;
		
	}


}
