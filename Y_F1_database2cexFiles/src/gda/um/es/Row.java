package gda.um.es;
import java.util.ArrayList;
import java.util.HashMap;


public interface Row {
	
	public int getPosition();
	public void addValue(String name, Object value);
	
	public HashMap<String, Attribute> getAttributes();
	public Attribute getAttribute(String name);
	
	public Object getValue(Attribute attr);
	public ArrayList<Object> getListValues();
	public HashMap<String,Object> getValues();	


}
