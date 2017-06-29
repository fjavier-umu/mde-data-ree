package gda.um.es.jdbc;

public interface AccessorHelper {

	public String accessValue(String column, String table, int row);
	public String accessValues(String table, int row);
	public String accessAllValues(String table, int numRows);
}
