package gda.um.es;

import gda.um.es.jdbc.SchemaConnectionJDBC; 

public abstract class SchemaConnection {

	static protected SchemaConnection schemaconn=null;

	protected String user,password, schema, catalog;
	public static final int JDBC = 1;
	
	
	protected SchemaConnection(String user, String password){
		this.user = user;
		this.password = password;
	}
	
	public abstract Schema getSchema(String catalog, String schema, int numRows);
	
	static public SchemaConnection getSchemaConnection(int tipo, String driverClass, String strConnection, String user, String password) throws Exception {
		if (schemaconn == null) {		
			if (tipo == JDBC) schemaconn = new SchemaConnectionJDBC(driverClass, strConnection, user, password);
			else throw new Exception("Error in connection type.");
		}
		return schemaconn;
	}
	

}
