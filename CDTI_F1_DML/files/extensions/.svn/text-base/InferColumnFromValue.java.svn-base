import gts.modernization.model.CST.*;
import gts.modernization.extension.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InferColumnFromValue extends MappingExtensionPoint {

	public ExtensionValueReturn execute() {		
		Element result = null;

		// Extraemos el primer parametro, que es el elemento "value"
		List<Element> paramList1 = (List<Element>) getParam(0);
		Object value = null;
		if(paramList1.size() > 0) value = paramList1.get(0); 		

		// Extraemos el segundo parametro, que es el elemento "insertInto"
		List<Element> paramList2 = (List<Element>) getParam(1);
		Object insertParam = null;
		if(paramList2.size() > 0) insertParam = paramList2.get(0); 

		// Comprobamos que ambos elementos de parametro son nodos
		if (insertParam instanceof Node && value instanceof Node) {
			Node insertNode = (Node) insertParam;
			Node valueNode = (Node) value;
			
			// Extraemos el nodo "registry" del nodo "insertInto"
			Node registry = insertNode.getNode("registry", 0);

			if(registry != null) {
				List<Node> children = registry.getNodes();
				int position = 0;
				// Recorremos sus nodos hijos, que son siempre del tipo "value"
				for(Node child : children) {	
					// Comparamos el value con el que recibimos como parametro
					if(child == valueNode) {
						// Si coincide, usamos "position" para extraer el elemento "column" 
						// de "insertNode" de dicha posicion
						result = insertNode.getNode("column", position);
					} else {
						// Si no coincide, aumentamos el puntero "position"
						position++;
					}
				}
			} 
		} 
		// Devolvemos el nodo encontrado 
		// (null si no encontramos nada)
		return returnNode(result);
	}
}

