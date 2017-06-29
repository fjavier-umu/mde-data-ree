package gda.um.es.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import gda.um.es.Attribute;
import gda.um.es.Row;
import gda.um.es.Table;

public class RowJDBC implements Row {

	private int position = -1; 
	private Table table;
	private HashMap<String,Object> values;
	
	
	public RowJDBC(Table table, int position) {
		this.position = position;
		this.table = table;
		values = new HashMap<String,Object>();
	}
	
	public void addValue(String name, Object value) {
		values.put(name, value);
	}
	
	public int getPosition() {
		return position;
	}
	
	public HashMap<String, Attribute> getAttributes() {
		return table.getAttributes();
	}
	public Attribute getAttribute(String name) {
		return table.getAttribute(name);
	}

	
	public Object getValue(Attribute attr) {
		//return table.getValue(position, attr);
		return values.get(attr.getName());
	}

	public ArrayList<Object> getListValues() {
		ArrayList<Object> values = new ArrayList<Object>(); 
		
		Iterator<Map.Entry<String,Object>> iter = this.values.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			values.add(entry.getValue());
		}
		return values;
	}
	
	public HashMap<String,Object> getValues() {
		return this.values;
	}
}
