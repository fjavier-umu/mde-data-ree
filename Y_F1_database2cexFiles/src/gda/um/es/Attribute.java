package gda.um.es;
import java.util.ArrayList;

public interface Attribute {
	public String getName();
	public ArrayList<Object> getValues();
	public Object getValue( int position); 
}
