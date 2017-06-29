package tesis;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import errors.ColumnCk;
import errors.ColumnFk;
import errors.ValueCk;
import errors.impl.CheckErrorImpl;




public class PaginaCheck extends WizardPage implements Listener {

	public static final String copyright = "(c) Copyright IBM Corporation 2002.";	
	
	//IWorkbench workbench;
	//IStructuredSelection selection;
	private ISelection selection;

    final static int n_width = 1024;
    final static int n_height = 768;

  
	
	// widgets on this page 
	Text NombreCheck;
	Text Porcentaje;
	Text TablaContenedora;
	Text Columna;
	Table Valores;
	
	Text NumClave;
	
 
	Button mantenerBoton;
	Button descartarBoton;
	
	// status variable for the possible errors on this page
	// timeStatus holds an error if the return date is before the departure date
	IStatus timeStatus;
	
	// holds an error is the destination and departure fields are the same
	IStatus destinationStatus;
		

	
	
	public PaginaCheck(ISelection selection) {
		super("wizardPage");
		setTitle("Check Constraint");
		setDescription("Checkor uncheck the constraint");
		this.selection = selection;
	}

	public void createControl(Composite parent) {	


		
	// create the composite to hold the widgets
	Composite composite =  new Composite(parent, SWT.NULL);

	composite.setLayout(new FormLayout());
	
	composite.setSize(n_width, n_height);
	
    // create the desired layout for this wizard page
	int ncol = 4;

	
    final Label l1 = new Label(composite, SWT.LEFT);
    l1.setText("Constraint Name:");
    FormData fd = new FormData();
    fd.left = new FormAttachment(0, 0);
    fd.width = 150;
    l1.setLayoutData(fd);

    NombreCheck = new Text(composite, SWT.BORDER | SWT.SINGLE);
    NombreCheck.setEditable(false);
    fd = new FormData();
    fd.left = new FormAttachment(l1, 10);
    fd.width = 350;
    NombreCheck.setLayoutData(fd);
    
    
    final Label l2 = new Label(composite, SWT.LEFT);
    l2.setText("Percentage ok:");
    fd = new FormData();
    fd.width = 150;
    fd.left = new FormAttachment(NombreCheck, 10);
    l2.setLayoutData(fd);	

    Porcentaje = new Text(composite, SWT.BORDER | SWT.SINGLE);
    Porcentaje.setEditable(false);
    fd = new FormData();
    fd.left = new FormAttachment(l2, 10);
    fd.width = 50;
    Porcentaje.setLayoutData(fd);    
    
    createLine(composite,l1, 10, 0, 0);
    
    final Label l3 = new Label(composite, SWT.LEFT);
    l3.setText("Table:");
    fd = new FormData();
    fd.width = 150;
    fd.top = new FormAttachment(l1, 15);
    fd.left = new FormAttachment(0,0);
    l3.setLayoutData(fd);    


    TablaContenedora = new Text(composite, SWT.BORDER | SWT.SINGLE);
    TablaContenedora.setEditable(false);
    fd = new FormData();
    fd.width = 350;
    fd.top = new FormAttachment(NombreCheck, 10);
    fd.left = new FormAttachment(l3, 10);
    TablaContenedora.setLayoutData(fd);    

    
    final Label l4 = new Label(composite, SWT.LEFT);
    l4.setText("Column:");
    fd = new FormData();
    fd.top = new FormAttachment(l2, 15);
    fd.width = 150;
    fd.left = new FormAttachment(TablaContenedora, 10);
    l4.setLayoutData(fd); 
    
    
    Columna = new Text(composite, SWT.BORDER | SWT.SINGLE);
    Columna.setEditable(false);
    fd = new FormData();
    fd.width = 350;
    fd.top = new FormAttachment(Porcentaje, 10);
    fd.left = new FormAttachment(l4, 10);
    Columna.setLayoutData(fd);    

    final Label EtiValores = new Label(composite, SWT.LEFT);
    EtiValores.setText("Values:");
    fd = new FormData();
    fd.top = new FormAttachment(l3, 15);
    fd.left = new FormAttachment(0,0);
    fd.width = 150;
    EtiValores.setLayoutData(fd); 
    
    
    Valores = new Table(composite, SWT.BORDER | SWT.SINGLE);
	TableColumn column1 = new TableColumn(Valores, SWT.NONE );

	column1.setText("Values");
	column1.setWidth(340);
	Valores.setHeaderVisible(true);	
	column1.pack();
    fd = new FormData();
    fd.width = 340;
    fd.height = 200;
    fd.left = new FormAttachment(EtiValores, 10);
    fd.top = new FormAttachment(TablaContenedora, 10);
    Valores.setLayoutData(fd);
    
    
	// Decidimos si cambiar o no	
    mantenerBoton = new Button(composite, SWT.RADIO);
    mantenerBoton.setText("Keep this constraint");
    fd = new FormData();
    fd.top = new FormAttachment(Valores, 10);
    fd.left = new FormAttachment(0,0);
    mantenerBoton.setLayoutData(fd); 
    mantenerBoton.setSelection(true);
	
    descartarBoton = new Button(composite, SWT.RADIO);
    descartarBoton.setText("Ignore this constraint");
    fd = new FormData();
    fd.top = new FormAttachment(mantenerBoton, 10);
    fd.left = new FormAttachment(0,0);
    descartarBoton.setLayoutData(fd);

    final Label l5 = new Label(composite, SWT.RIGHT);
    l5.setText("Clave:");
    fd = new FormData();
    fd.width = 150;
    fd.top = new FormAttachment(mantenerBoton, 13);
    fd.left = new FormAttachment(descartarBoton, 600);    
    l5.setLayoutData(fd); 
    
    NumClave = new Text(composite, SWT.BORDER | SWT.SINGLE);
    NumClave.setEditable(false);
    fd = new FormData();
    fd.width = 100;
    fd.top = new FormAttachment(mantenerBoton, 10);
    fd.left = new FormAttachment(l5, 10);
    NumClave.setLayoutData(fd);    
    

    
    // set the composite as the control for this page
	setControl(composite);		
	addListeners();
}

	
	private void addListeners()
	{
		mantenerBoton.addListener(SWT.Selection, this);
		descartarBoton.addListener(SWT.Selection, this);
	}

	public void handleEvent(Event event) {

		
		

		// Si cambiamos el estado de la clave cambiamos tambi�n el global 
	    if (event.widget == mantenerBoton || event.widget == descartarBoton ) {
			ErroresTipo err = (ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual );
	    	if (mantenerBoton.getSelection() && !err.getEstado() ){
	    		err.setEstado(true);
	    		CargarFicheroWizard.lista.set(CargarFicheroWizard.PaginaActual, err);
	        } else if (descartarBoton.getSelection() && err.getEstado() ){
	    		err.setEstado(false);	        	
	    		CargarFicheroWizard.lista.set(CargarFicheroWizard.PaginaActual, err);
	        }
	    }


	}	
	


	

	private void createLine(Composite parent, Control top, int des_top, Control left, int des_left) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		FormData formData = new FormData();
		formData.width = n_width;
		formData.top = new FormAttachment(top, des_top);
		formData.left = new FormAttachment(left, des_left);
		line.setLayoutData(formData);		
		
	}		

	private void createLine(Composite parent, Control top, int des_top, int left, int des_left) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		FormData formData = new FormData();
		formData.width = n_width;
		formData.top = new FormAttachment(top, des_top);
		formData.left = new FormAttachment(left, des_left);
		line.setLayoutData(formData);		
		
	}		
	
	public IWizardPage getNextPage(){
		// Controlamos la navegaci�n. Si es carga inicial de la clase o es navegaci�n
		if (CargarFicheroWizard.primera_check){
			CargarFicheroWizard.primera_check = false;
			return ((CargarFicheroWizard)getWizard()).foreignPage;
			
		}	else {
			CargarFicheroWizard.PaginaActual++;
			if (CargarFicheroWizard.PaginaActual >= CargarFicheroWizard.lista.size()) {
				PaginaResumen page = ((CargarFicheroWizard)getWizard()).resumePage;
				page.visualizaTabla();
			    return page;			
			}
			if (((ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual)).getTipo().equals("F")) {
				PaginaForeign page = ((CargarFicheroWizard)getWizard()).foreignPage;
				CargarFicheroWizard.primera_foreign = true;
				CargarFicheroWizard.primera_foreign_p = true;
			    page.onNextPage();
		       return page;

			}	else {
				 PaginaCheck page = ((CargarFicheroWizard)getWizard()).checkPage;
			     page.onNextPage();
		       return page;
			}		
		}		
		
	}    	
	
	
	
	void onNextPage()
	{
		
		CargarFicheroWizard.err = (ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual );
		
		NumClave.setText((CargarFicheroWizard.PaginaActual+1)   + " de " + CargarFicheroWizard.NumeroPaginas);
		NombreCheck.setText(CargarFicheroWizard.err.getNombreConstraint());
		
		CheckErrorImpl miError = (CheckErrorImpl) CargarFicheroWizard.err.getError();
		Porcentaje.setText(miError.getPorcent().toString());
		TablaContenedora.setText(miError.getNameTable());	    
		
		
		
		ErroresTipo err = (ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual );		
		if (err.getEstado() ){
		    mantenerBoton.setSelection(true);
		    descartarBoton.setSelection(false);
		} else {
		    descartarBoton.setSelection(true);
		    mantenerBoton.setSelection(false);
		}		
		Valores.removeAll();
		
		Iterator iterator = miError.getColumns().iterator();
		while( iterator. hasNext() ){
			ColumnCk columnCk = (ColumnCk)iterator.next();
			Columna.setText(columnCk.getColumnName());
			Iterator iteratorVal = columnCk.getValues().iterator();
			while( iteratorVal. hasNext() ){
				ValueCk valueCk = (ValueCk) iteratorVal.next();
				TableItem item = new TableItem(Valores, SWT.NONE);
				item.setText(valueCk.getValue());
			}			
		}			

	}
	
	
	
	public IWizardPage getPreviousPage(){
		
		// Controlamos la navegaci�n. Si es carga inicial de la clase o es navegaci�n
		if	(CargarFicheroWizard.primera_check_p){
			CargarFicheroWizard.primera_check_p = false;
			 return  ((CargarFicheroWizard)getWizard()).checkPage;
			
		}	else {
			CargarFicheroWizard.PaginaActual--;
			if (CargarFicheroWizard.PaginaActual < 0) {
				return ((CargarFicheroWizard)getWizard()).fileDataPage;
			}	
			if (((ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual)).getTipo().equals("F")) {

				
			   PaginaForeign page = ((CargarFicheroWizard)getWizard()).foreignPage;
			   page.onPreviousPage();
			   CargarFicheroWizard.primera_foreign_p = true;
			   CargarFicheroWizard.primera_foreign = true;
			   return page;

			}	else {
			   PaginaCheck page = ((CargarFicheroWizard)getWizard()).checkPage;
			   page.onPreviousPage();
		       return page;

			}			
		}
	}

	

	void onPreviousPage()
	{
		
		CargarFicheroWizard.err = (ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual );
		
		NumClave.setText((CargarFicheroWizard.PaginaActual+1)   + " de " + CargarFicheroWizard.NumeroPaginas);
		NombreCheck.setText(CargarFicheroWizard.err.getNombreConstraint());

		CheckErrorImpl miError = (CheckErrorImpl) CargarFicheroWizard.err.getError();
		Porcentaje.setText(miError.getPorcent().toString());
		TablaContenedora.setText(miError.getNameTable());	    

		ErroresTipo err = (ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual );		
    	if (err.getEstado() ){
    	    mantenerBoton.setSelection(true);
    	    descartarBoton.setSelection(false);
        } else {
            descartarBoton.setSelection(true);
            mantenerBoton.setSelection(false);
        }		
		Valores.removeAll();
		
		Iterator iterator = miError.getColumns().iterator();
		while( iterator. hasNext() ){
			ColumnCk columnCk = (ColumnCk)iterator.next();
			Columna.setText(columnCk.getColumnName());
			Iterator iteratorVal = columnCk.getValues().iterator();
			while( iteratorVal. hasNext() ){
				ValueCk valueCk = (ValueCk)iteratorVal.next();
				TableItem item = new TableItem(Valores, SWT.NONE);
				item.setText(valueCk.getValue());
			}			
		}			
		
			

		

	}
	
}
