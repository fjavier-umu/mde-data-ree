package gda.um.es.jdbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AccessorHelperOracle implements AccessorHelper {
	
	private String orderByPK;
	
	public AccessorHelperOracle (HashMap primaryKey) {
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
		if (orderByPK.equals("")) return "SELECT r.* FROM( SELECT rownum rn, t.* FROM ( SELECT "+column+ " FROM "+ table + ") t ) r WHERE r.rn = " + row;
		return "SELECT r.* FROM( SELECT rownum rn, t.* FROM ( SELECT "+column+ " FROM "+ table + " ORDER BY "+ orderByPK + ") t ) r WHERE r.rn = " + row;
		
	}

	@Override
	public String accessValues(String table, int row) {
		if (orderByPK.equals("")) return "SELECT r.* FROM( SELECT rownum rn, t.* FROM ( SELECT * FROM "+ table  + ") t ) r WHERE r.rn = " + row;
		return "SELECT r.* FROM( SELECT rownum rn, t.* FROM ( SELECT * FROM "+ table + " ORDER BY "+ orderByPK + ") t ) r WHERE r.rn = " + row;
	}

	@Override
	public String accessAllValues(String table, int numRows) {
		if (orderByPK.equals("")) return "SELECT * FROM " + table + " WHERE ROWNUM < " + numRows;
		return "SELECT * FROM " + table + " WHERE ROWNUM < " + numRows + " ORDER BY "+ orderByPK ;
	}

}
