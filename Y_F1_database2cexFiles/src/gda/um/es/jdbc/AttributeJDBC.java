package gda.um.es.jdbc;

import java.util.ArrayList;
import gda.um.es.Attribute;
import gda.um.es.Table;

public class AttributeJDBC implements Attribute {
	private String name;
	private Table table;
	//private DatabaseMetaData metadata;
	
	public AttributeJDBC(Table table, String name/*, DatabaseMetaData metadata*/) {
		this.name = name;
		//this.metadata = metadata;
		this.table = table;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public ArrayList<Object> getValues() {
		
		ArrayList<Object> values = new ArrayList<Object>();
		int count = table.getRowsNumber();
		
		for (int i=1; i<=count; i++) values.add(table.getValue(i, this));
		
		return values;
	}

	@Override
	public Object getValue(int position) {
		return table.getValue(position, this);
	}

}
