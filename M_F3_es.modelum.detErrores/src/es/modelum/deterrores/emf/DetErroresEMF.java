package es.modelum.deterrores.emf;

import errors.Error;
import errors.CheckError;
import errors.Errores;
import errors.ErrorsPackage;
import errors.ForeignError;

import es.modelum.deterrores.viewer.ErrorsViewer;
import es.modelum.deterrores.viewer.ErrorViewer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;


import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import DML_DDL.Ck;
import DML_DDL.Column;
import DML_DDL.DML_DDLPackage;
import DML_DDL.Registry;
import DML_DDL.Table;
import DML_DDL.Value;
import DML_DDL.ValuesCk;

public class DetErroresEMF {
	
	ResourceSet resourceSet;
	Resource resource;
	URI fileURI;
	String type = "";
	String syntax = "";
	String datas = "";
	
	public DetErroresEMF(String source) {
		DML_DDLPackage dml_ddlPackage = DML_DDLPackage.eINSTANCE;
		ErrorsPackage errorsPackage = ErrorsPackage.eINSTANCE;
		
		resourceSet = new ResourceSetImpl();
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put
		(ErrorsPackage.eNS_URI, errorsPackage);
		
		resourceSet.getPackageRegistry().put
		(DML_DDLPackage.eNS_URI, dml_ddlPackage);
	
		fileURI = URI.createFileURI(source);
		resource = resourceSet.getResource(fileURI, true);
		
		ErrorsViewer.getInstance().remove();
	}
	
	public void init(int clicks_LoadError) {		
		Errores errores = (Errores)resource.getContents().get(0);
		
		Iterator<Error> it = errores.getErrores().iterator();
		
		while(it.hasNext()) {
			Error error = (Error)it.next();		
			
			ErrorViewer eViewer = new ErrorViewer(error.getId(), error.getApply());
			
			if (CheckError.class.isInstance(error)) {
				initCk((CheckError)error, clicks_LoadError);				
			}
			else if (ForeignError.class.isInstance(error)) {
				ForeignError foreign = (ForeignError)error;
				if ((foreign.getFk() == null) && (foreign.getFkColumns().size() > 0))
					initPk((ForeignError)error, clicks_LoadError);
				else
					initFk((ForeignError)error, clicks_LoadError);
			}
			
			eViewer.setType(type);
			eViewer.setSyntax(syntax);
			eViewer.setData(datas);
			ErrorsViewer.getInstance().addError(eViewer);
		}
	}
	
	public boolean save() {
		Iterator<ErrorViewer> errorsIt = ErrorsViewer.getInstance().getErrors().iterator();
		while(errorsIt.hasNext()) {
			ErrorViewer eViewer = errorsIt.next();
			Errores errores = (Errores)resource.getContents().get(0);
			Iterator<Error> it = errores.getErrores().iterator();
			
			while(it.hasNext()) {
				Error error = (Error)it.next();	
				if (error.getId() == eViewer.getId()) {
					error.setApply(eViewer.isApply());
					break;
				}
			}			
		}
		
		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, true);
		try {
			resource.save(resourceSet.getURIConverter().createOutputStream(fileURI), options);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public void initCk(CheckError error, int clicks_LoadError) {
		type = "Ck Disabled";
		datas = "";
		syntax = "";
		
		// load Syntax
		syntax = "Table : " + error.getTable().getTableName() + "\n\n";
		Ck ck = error.getCk();
		Iterator<ValuesCk> valuesIt = ck.getValuesCk().iterator();
		while (valuesIt.hasNext()) {
			ValuesCk value = valuesIt.next();
			String column = value.getColumnName();
			String comparator = value.getComparator();
			String conjuntion = value.getLogConjuntion();
			syntax += "\t" + column + " ";
			EList<String> listValues = value.getValue();
			if (listValues.size() == 1) {
				syntax +=  comparator + " " + listValues.get(0) + " ";
			} else {
				Iterator<String> valueIt = listValues.iterator();
				syntax +=  "IN (";
				while(valueIt.hasNext()) {
					syntax +=  valueIt.next();
					if (valueIt.hasNext()) syntax += ", ";
					else syntax += ") ";
				}
			}
			syntax += conjuntion + "\n";
		}
		
		// load some registries
		EList<Registry> registries = error.getRegistriesCk();
		
		int init = 0;
		int end = registries.size();
		if (registries.size() > 10) {
			init = clicks_LoadError * 10;
			end = init + 10;
		}
		
		boolean first = true;
		for (int i = init; i < end; i++) {
			Registry registry = registries.get(i);
			Iterator<Value> regValuesIt = registry.getRegistryValues().iterator();
			String aux = "";
			while(regValuesIt.hasNext()) {
				Value val = regValuesIt.next();
				if (first) {
					datas += val.getColumn().getColumnName();
					aux += val.getValue();
					
					if (regValuesIt.hasNext()) {
						datas += "\t--\t";
						aux += "\t-\t";
					}
				}
				else {
					datas += val.getValue();
					if (regValuesIt.hasNext()) datas += "\t-\t";
				}
			}
			datas += "\n";
			if (first) {
				datas += aux + "\n";
				first = false;
			}
		}
	}
	
	public void initFk(ForeignError error, int clicks_LoadError) {
		type = "Fk Disabled";
		datas = "";
		syntax = "";
		
		// load syntax
		Table tableRef = error.getTableRef();
		Table tableCont = error.getTableCont();
		
		EList<String> columnsRef = error.getFk().getColumnReference();
		EList<String> columnsCont = error.getFk().getColumnName();
		
		if (columnsRef.size() != columnsCont.size()) System.out.println("TAMAÑOS DISTINTOS");
		
		syntax = "Container Table : " + tableCont.getTableName() + " -> Reference Table : " + tableRef.getTableName() + "\n\n";
		for (int i = 0; i < columnsCont.size(); i++) {
			syntax += "\t" + columnsCont.get(i) + " -> " + columnsRef.get(i) + "\n";
		}
		
		// load some registries
		EList<Registry> registries = error.getRegistriesFk();
		int init = 0;
		int end = registries.size();
		if (registries.size() > 10) {
			init = clicks_LoadError * 10;
			end = init + 10;
		}
		 
		boolean first = true;
		for (int i = init; i < end; i++) {
			Registry registry = registries.get(i);	
			Iterator<Value> regValuesIt = registry.getRegistryValues().iterator();
			String aux = "";
			while(regValuesIt.hasNext()) {
				Value val = regValuesIt.next();
				if (first) {
					datas += val.getColumn().getColumnName();
					aux += val.getValue();
					
					if (regValuesIt.hasNext()) {
						datas += "\t--\t";
						aux += "\t-\t";
					}
				}
				else {
					datas += val.getValue();
					if (regValuesIt.hasNext()) datas += "\t-\t";
				}
			}
			datas += "\n";
			if (first) {
				datas += aux + "\n";
				first = false;
			}
		}
	}
	
	public void initPk(ForeignError error, int clicks_LoadError) {
		type = "Possible Fk";
		datas = "";
		syntax = "";
		
		// load syntax
		Table tableRef = error.getTableRef();
		Table tableCont = error.getTableCont();
		
		EList<String> columnsRef = tableRef.getColumnsPk().getColumnName();
		LinkedList<String> columnsCont = new LinkedList<String>();
		
		Iterator<Column> fkColumnsIt = error.getFkColumns().iterator();
		while(fkColumnsIt.hasNext()) {
			columnsCont.add(fkColumnsIt.next().getColumnName());
		}
		
		if (columnsRef.size() != columnsCont.size()) System.out.println("TAMAÑOS DISTINTOS");
		
		syntax = "Container Table : " + tableCont.getTableName() + " -> Reference Table : " + tableRef.getTableName() + "\n\n";
		for (int i = 0; i < columnsCont.size(); i++) {
			syntax += "\t" + columnsCont.get(i) + "\t->\t" + columnsRef.get(i) + "\n";
		}
		
		// load some registries
		EList<Registry> registries = error.getRegistriesFk();
		int init = 0;
		int end = registries.size();
		if (registries.size() > 10) {
			init = clicks_LoadError * 10;
			end = init + 10;
		}
		 
		boolean first = true;
		for (int i = init; i < end; i++) {
			Registry registry = registries.get(i);	
			Iterator<Value> regValuesIt = registry.getRegistryValues().iterator();
			String aux = "";
			while(regValuesIt.hasNext()) {
				Value val = regValuesIt.next();
				if (first) {
					datas += val.getColumn().getColumnName();
					aux += val.getValue();
					
					if (regValuesIt.hasNext()) {
						datas += "\t--\t";
						aux += "\t-\t";
					}
				}
				else {
					datas += val.getValue();
					if (regValuesIt.hasNext()) datas += "\t-\t";
				}
			}
			datas += "\n";
			if (first) {
				datas += aux + "\n";
				first = false;
			}
		}
	}
}
