package gda.um.es.jdbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AccessorHelperMySQL implements AccessorHelper {
	
	private String orderByPK;
	
	public AccessorHelperMySQL (HashMap primaryKey) {
		orderByPK = "";
		List<String> listPK = new ArrayList<String>(primaryKey.size()); 
		Iterator it = primaryKey.keySet().iterator();
		while (it.hasNext()) {
			listPK.add((String)it.next());
		}
		Collections.sort(listPK);
		for (String item:listPK) {
			orderByPK += " " + item + ","; 
		}
		if (!orderByPK.equals("")) orderByPK = orderByPK.substring(0,orderByPK.length()-1);
	}

	@Override
	public String accessValue(String column, String table, int row) {		
		return "SELECT "+column+ " FROM "+ table + " ORDER BY "+ orderByPK + " LIMIT " + (row-1) + ",1";
		
	}

	@Override
	public String accessValues(String table, int row) {
		return "SELECT * FROM "+ table + " ORDER BY "+ orderByPK + " LIMIT " + (row-1) + ",1";
	}
	
	@Override
	public String accessAllValues(String table, int numRows) {
		return "SELECT * FROM " + table + " ORDER BY "+ orderByPK ;
	}


}
