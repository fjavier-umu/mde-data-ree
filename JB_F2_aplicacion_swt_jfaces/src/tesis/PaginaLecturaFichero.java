package tesis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import errors.CheckError;
import errors.Error;
import errors.Errores;
import errors.ErrorsFactory;
import errors.ErrorsPackage;
import errors.ForeignError;
import errors.impl.CheckErrorImpl;
import errors.impl.ForeignErrorImpl;

public class PaginaLecturaFichero extends WizardPage implements IWizardPage {
	private Text urlText;
	private ISelection selection;
	private static Table table;

    
	public PaginaLecturaFichero(ISelection selection) {
		super("wizardPage");
		setTitle("Select input file");
		setDescription("Select file");
		this.selection = selection;
	}

	public void createControl(Composite parent){
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 10;

		 
		Label label = new Label (container, SWT.LEFT);
		label.setText("&URL file");
		
		urlText = new Text(container, SWT.BORDER | SWT.SINGLE);
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 7;
		urlText.setLayoutData(gd);
		
		urlText.addModifyListener(new ModifyListener() {
			public void modifyText (ModifyEvent e) {
				dialogChanged();
			}
		});
	
		Button buscar = new Button(container, SWT.NULL);
		buscar.setText("&File");
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 1;
		buscar.setLayoutData(gd);
		
		Button cargar = new Button(container, SWT.NULL);
		cargar.setText("&Load");
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 1;
		cargar.setLayoutData(gd);
		
	
		createLine(container, 9);
	
		
		SashForm form = new SashForm(container, SWT.HORIZONTAL | SWT.NULL);
		
		
		
		table = new Table(form, SWT.FULL_SELECTION | SWT.BORDER);
		
		TableColumn column = new TableColumn(table, SWT.LEFT);
		column.setText("Constraint Type");
		column.setWidth(100);
		table.setHeaderVisible(true);

		column = new TableColumn(table, SWT.LEFT);
		column.setText("Name");
		column.setWidth(300);
		table.setHeaderVisible(true);

		column = new TableColumn(table, SWT.LEFT);
		column.setText("Main Table");
		column.setWidth(100);
		table.setHeaderVisible(true);

		column = new TableColumn(table, SWT.LEFT);
		column.setText("Referenced Table");
		column.setWidth(100);
		table.setHeaderVisible(true);

		column = new TableColumn(table, SWT.LEFT);
		column.setText("Percentage");
		column.setWidth(100);
		table.setHeaderVisible(true);
		

	
		gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 8;
		
		form.setLayoutData(gd);
		
		
		/* A�adimos los listener */
		buscar.addSelectionListener(new SelectFileAction());
		dialogChanged();
		
		cargar.addSelectionListener( new LeerFichero());
		
		
		setControl(container);
	
		

	}

	private void dialogChanged() {
	    Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		if (this.getUrlText().getText().length() == 0){
			updateStatus("URL file must be especified");
	        status = new Status(IStatus.ERROR, "not_used", 0, 
	                "Return date is wrong", null);	                
	        //timeStatus = status;			
		}

		updateStatus(null);
	}
	
	public Text getUrlText() {
		return urlText;
	}

	public void setUrlText(Text urlText) {
		this.urlText = urlText;
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		//setPageComplete(message==null);
	}

    class SelectFileAction implements  SelectionListener {
        //private String filePath;
    	public void widgetSelected(SelectionEvent event) {
          FileDialog fd = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
          fd.setText("Open");
          fd.setFilterPath("C:/");
          String[] filterExt = { "*.xmi" };
          fd.setFilterExtensions(filterExt);
          String selected = fd.open();
          //this.filePath = selected;
          urlText.setText(selected);
        }

        public void widgetDefaultSelected(SelectionEvent event) {
        }


      }
	
    private void createLine(Composite parent, int ncol) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}		    
    
    class LeerFichero implements SelectionListener  {
    		
    	public void widgetSelected(SelectionEvent event) {
    		
    	    Status status = new Status(IStatus.OK, "not_used", 0, "", null);
    		if (getUrlText().getText().length() == 0){
    			updateStatus("File location must be especified");
    	        return;
    		}	
    	
    		CargarFicheroWizard.lista = new ArrayList();
    		Resource resource = 
    		new XMIResourceImpl(URI.createURI("file:///"+getUrlText().getText()));
    		//new XMIResourceImpl(URI.createURI("./src/tesis/errorespcj.xmi"));
			XMIResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(ErrorsPackage.eINSTANCE);
			Map options = new HashMap();
			options.put(XMIResource.OPTION_XML_MAP, xmlMap);
			try {
				resource.load(options);
    			updateStatus(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//updateStatus("La ruta del fichero no es correcta. Compru�bela e int�ntelo de nuevo");
				MessageDialog.openInformation(Display.getCurrent().getActiveShell(),"Load Model", "The path is wrong, please check it.");
				return;
			}

			Errores errores = (Errores)resource.getContents().get(0);
			/* Cargamos los errores en variable global hashmap */
			cargaArray(errores);		
			/* Los visualizamos en una tabla */
			visualizaTabla();
			
			
			/* Actualizamos las variables actuales */	
			CargarFicheroWizard.NumeroPaginas = CargarFicheroWizard.lista.size();
			
    	}	


		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
		}

    }

    public boolean canFlipToNextPage(){
    	   if (CargarFicheroWizard.lista.size()>0)
    	        return true;
    	    return false;
    	}
    
    public IWizardPage getNextPage(){

			if (CargarFicheroWizard.lista.size() > 0) {
				if (((ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual)).getTipo().equals("F")) {
					 PaginaForeign page = ((CargarFicheroWizard)getWizard()).foreignPage;
				     page.onNextPage();
			       return page;

				}	else {
					 PaginaCheck page = ((CargarFicheroWizard)getWizard()).checkPage;
				     page.onNextPage();
			       return page;
				}   
    		}
    		
    		return ((CargarFicheroWizard)getWizard()).foreignPage;
			
    	}    


    

	public void cargaArray(Errores errores) {
		ErroresTipo erroresTipo ;

		// Inicializo el modelo
		ErrorsPackage.eINSTANCE.eClass();
		// Recupero la factor�a singleton por defecto
		ErrorsFactory factory = ErrorsFactory.eINSTANCE;

		ForeignError errForeign = factory.createForeignError();
		CheckError errCheck = factory.createCheckError();;

		for (Iterator<Error> iter = EcoreUtil.getAllContents(Collections.singleton(errores));iter.hasNext(); ) {
				EObject eObject = (EObject)iter.next();
				// Recreo el objeto Check o Foreing 
				if (eObject.getClass().getName().equals ("errors.impl.CheckErrorImpl") ){
					errCheck = (CheckError) eObject;
					if (!errCheck.equals(null)){
						erroresTipo = new ErroresTipo(true, errCheck.getNameCk(),"C", errCheck);
						CargarFicheroWizard.lista.add(erroresTipo );
						// inicializo
				    	errCheck = null;
			    	}
				} 
				if (eObject.getClass().getName().equals ("errors.impl.ForeignErrorImpl") ){				  
					errForeign = (ForeignError) eObject;
					if (!errForeign.equals(null)){
					    	erroresTipo = new ErroresTipo(true, errForeign.getNameFk(),"F", errForeign);
					    	CargarFicheroWizard.lista.add(erroresTipo);
							// inicializo
							errForeign = null;
			    	}
				}
		}
		CargarFicheroWizard.PaginaActual = 0;
		getWizard().getContainer().updateButtons();
	}
    
    public static void visualizaTabla() {
		for (int i=0; i<CargarFicheroWizard.lista.size(); i++ ){
			ErroresTipo err = (ErroresTipo) CargarFicheroWizard.lista.get(i);
			TableItem item = new TableItem(table, SWT.NONE);
			if (err.getTipo().equals("F")) {
				ForeignErrorImpl miError = (ForeignErrorImpl) err.getError();	
				item.setText(new String[] { ErroresTipo.desRestriccion(err.getTipo()), err.getNombreConstraint(), miError.getTableCont().getNameTable(), miError.getTableRef().getNameTable(), miError.getPorcent().toString()});	
			} else {
				CheckErrorImpl miError = (CheckErrorImpl) err.getError();	
				item.setText(new String[] { ErroresTipo.desRestriccion(err.getTipo()), err.getNombreConstraint(), miError.getNameTable().toString(), null, miError.getPorcent().toString() });	
				
			}
				
			
		}	
		
    }
}
