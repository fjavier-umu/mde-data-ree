package gda.um.es;
import java.util.ArrayList;
import java.util.HashMap;


public interface Table {
	public String getName();
	public ArrayList<Row> getRows();
	public Row getRow(int position);
	public int getRowsNumber();
	public HashMap<String,Attribute> getAttributes();
	public Attribute getAttribute (String name);
	public Object getValue(int row, Attribute col);
	public Object getValue(Row row, Attribute col);	
}
