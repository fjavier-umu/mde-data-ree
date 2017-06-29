package gda.um.es;

import java.sql.Connection;
import java.util.HashMap;


public interface Schema {
	
	public HashMap<String, Table> getTables();
	public Table getTable (String name);
	public Connection getConnection();

	public Schema getSchema();
	public String getSchemaName();
	public String getCatalogName();
}
