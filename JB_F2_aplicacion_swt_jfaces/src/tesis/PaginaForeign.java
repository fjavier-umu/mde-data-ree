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

import errors.ColumnFk;
import errors.impl.ForeignErrorImpl;




public class PaginaForeign extends WizardPage implements Listener {

	public static final String copyright = "(c) Copyright IBM Corporation 2002.";	
	
	//IWorkbench workbench;
	//IStructuredSelection selection;
	private ISelection selection;

    final static int n_width = 1024;
    final static int n_height = 768;
    
    private int cont = 0;

    
	 
	// widgets on this page 
	Text NombreForeign;
	Text Porcentaje;
	Text TablaContenedora;
	Text TablaReferenciada;
	Table ColumnasContenido;
	Table ColumnasReferenciada;
	
	Text NumClave;
	

	Button mantenerBoton;
	Button descartarBoton;
	
	// status variable for the possible errors on this page
	// timeStatus holds an error if the return date is before the departure date
	IStatus timeStatus;
	
	// holds an error is the destination and departure fields are the same
	IStatus	 destinationStatus;
		

	
	
	public PaginaForeign(ISelection selection) {
		super("wizardPage");
		setTitle("Foreign Key Constraint");
		setDescription("Check or uncheck the constraint");
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
    l1.setText("Constraint name:");
    FormData fd = new FormData();
    fd.left = new FormAttachment(0, 0);
    fd.width = 150;
    l1.setLayoutData(fd);

    NombreForeign = new Text(composite, SWT.BORDER | SWT.SINGLE);
    NombreForeign.setEditable(false);
    fd = new FormData();
    fd.left = new FormAttachment(l1, 10);
    fd.width = 350;
    NombreForeign.setLayoutData(fd);
    
    
    final Label l2 = new Label(composite, SWT.LEFT);
    l2.setText("Percentage ok:");
    fd = new FormData();
    fd.width = 150;
    fd.left = new FormAttachment(NombreForeign, 10);
    l2.setLayoutData(fd);	

    Porcentaje = new Text(composite, SWT.BORDER | SWT.SINGLE);
    Porcentaje.setEditable(false);
    fd = new FormData();
    fd.left = new FormAttachment(l2, 10);
    fd.width = 50;
    Porcentaje.setLayoutData(fd);    
    
    createLine(composite,l1, 10, 0, 0);
    
    final Label l3 = new Label(composite, SWT.LEFT);
    l3.setText("Container Table:");
    fd = new FormData();
    fd.width = 150;
    fd.top = new FormAttachment(l1, 15);
    fd.left = new FormAttachment(0,0);
    l3.setLayoutData(fd);    


    TablaContenedora = new Text(composite, SWT.BORDER | SWT.SINGLE);
    TablaContenedora.setEditable(false);
    fd = new FormData();
    fd.width = 350;
    fd.top = new FormAttachment(NombreForeign, 10);
    fd.left = new FormAttachment(l3, 10);
    TablaContenedora.setLayoutData(fd);    

    
    final Label l4 = new Label(composite, SWT.LEFT);
    l4.setText("Referenced Table:");
    fd = new FormData();
    fd.top = new FormAttachment(l2, 15);
    fd.width = 150;
    fd.left = new FormAttachment(TablaContenedora, 10);
    l4.setLayoutData(fd); 
    
    
    TablaReferenciada = new Text(composite, SWT.BORDER | SWT.SINGLE);
    TablaReferenciada.setEditable(false);
    fd = new FormData();
    fd.width = 350;
    fd.top = new FormAttachment(Porcentaje, 10);
    fd.left = new FormAttachment(l4, 10);
    TablaReferenciada.setLayoutData(fd);    

    final Label EtiColContenido = new Label(composite, SWT.LEFT);
    EtiColContenido.setText("Container Column:");
    fd = new FormData();
    fd.top = new FormAttachment(l3, 15);
    fd.left = new FormAttachment(0,0);
    fd.width = 150;
    EtiColContenido.setLayoutData(fd); 
    
    
    ColumnasContenido = new Table(composite, SWT.BORDER | SWT.SINGLE);
	TableColumn column1 = new TableColumn(ColumnasContenido, SWT.NONE );

	column1.setText("Contained Column:");
	column1.setWidth(340);
	ColumnasContenido.setHeaderVisible(true);	
	column1.pack();
    fd = new FormData();
    fd.width = 340;
    fd.height = 200;
    fd.left = new FormAttachment(EtiColContenido, 10);
    fd.top = new FormAttachment(TablaContenedora, 10);
    ColumnasContenido.setLayoutData(fd);
    
    
    final Label EtiColReferenciada = new Label(composite, SWT.LEFT);
    EtiColReferenciada.setText("Referenced Column:");
    fd = new FormData();
    fd.width = 150;
    fd.top = new FormAttachment(l4, 15);
    fd.left = new FormAttachment(ColumnasContenido, 10);    
    EtiColReferenciada.setLayoutData(fd);
    
    ColumnasReferenciada = new Table(composite, SWT.BORDER | SWT.SINGLE);
	column1 = new TableColumn(ColumnasReferenciada, SWT.NONE);
	column1.setText("Refered Columns");
	column1.setWidth(340);
	ColumnasReferenciada.setHeaderVisible(true);	
	column1.pack();
    fd = new FormData();
    fd.width = 340;
    fd.height = 200;
    fd.left = new FormAttachment(EtiColReferenciada, 10);
    fd.top = new FormAttachment(TablaReferenciada, 10);
    ColumnasReferenciada.setLayoutData(fd);

	// Decidimos si cambiar o no	
    mantenerBoton = new Button(composite, SWT.RADIO);
    mantenerBoton.setText("Keep this constraint");
    fd = new FormData();
    fd.top = new FormAttachment(ColumnasContenido, 10);
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
		if	(CargarFicheroWizard.primera_foreign){
			CargarFicheroWizard.primera_foreign = false;
			 return  ((CargarFicheroWizard)getWizard()).foreignPage;
		}	else {
			CargarFicheroWizard.PaginaActual++;
			if (CargarFicheroWizard.PaginaActual >= CargarFicheroWizard.lista.size()) {
				PaginaResumen page = ((CargarFicheroWizard)getWizard()).resumePage;
				page.visualizaTabla();
			    return page;			
			}
			if (((ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual)).getTipo().equals("F")) {
			   PaginaForeign page = ((CargarFicheroWizard)getWizard()).foreignPage;
			   page.onNextPage();
		       return page;
			}	else {
			   PaginaCheck page = ((CargarFicheroWizard)getWizard()).checkPage;
			   CargarFicheroWizard.primera_check = true;
			   CargarFicheroWizard.primera_check_p = true;
			   page.onNextPage();
		       return page;
			}			
		}

	}   
	

	
	public IWizardPage getPreviousPage(){
		

		// Controlamos la navegaci�n. Si es carga inicial de la clase o es navegaci�n
		if	(CargarFicheroWizard.primera_foreign_p){
			CargarFicheroWizard.primera_foreign_p = false;
			 return  ((CargarFicheroWizard)getWizard()).foreignPage;
			
		}	else {
			CargarFicheroWizard.PaginaActual--;

			if (CargarFicheroWizard.PaginaActual < 0) {
				return ((CargarFicheroWizard)getWizard()).fileDataPage;
			}			
			if (((ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual)).getTipo().equals("F")) {

				
			   PaginaForeign page = ((CargarFicheroWizard)getWizard()).foreignPage;
			   page.onPreviousPage();
		       return page;

			}	else {
			   PaginaCheck page = ((CargarFicheroWizard)getWizard()).checkPage;
			   CargarFicheroWizard.primera_check_p = true;
			   CargarFicheroWizard.primera_check = true;
			   page.onPreviousPage();
		       return page;

			}			
		}
	}
	
	
	void onNextPage()
	{
		
		// Movemos a la siguiente p�gina, guardando en p�gina actual la que estamos ahora
		CargarFicheroWizard.err = (ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual );
		
		NumClave.setText((CargarFicheroWizard.PaginaActual+1)  + " de " + CargarFicheroWizard.NumeroPaginas);
		NombreForeign.setText(CargarFicheroWizard.err.getNombreConstraint());
		ForeignErrorImpl miError = (ForeignErrorImpl) CargarFicheroWizard.err.getError();
		Porcentaje.setText(miError.getPorcent().toString());
		TablaContenedora.setText(miError.getTableCont().getNameTable());	    
		TablaReferenciada.setText(miError.getTableRef().getNameTable());

	
    	if (CargarFicheroWizard.err.getEstado() ){
    	    mantenerBoton.setSelection(true);
    	    descartarBoton.setSelection(false);
        } else {
            descartarBoton.setSelection(true);
            mantenerBoton.setSelection(false);
        }		
		ColumnasContenido.removeAll();
		ColumnasReferenciada.removeAll();
		
		Iterator iterator = miError.getTableCont().getColumnCont().iterator();
		while( iterator. hasNext() ){
			ColumnFk columnaFk = (ColumnFk)iterator.next();
			TableItem item = new TableItem(ColumnasContenido, SWT.NONE);
			item.setText(columnaFk.getNameColumn());
		}			

		iterator = miError.getTableRef().getColumnCont().iterator();
		while( iterator. hasNext() ){
			ColumnFk columnaFk = (ColumnFk)iterator.next();
			TableItem item = new TableItem(ColumnasReferenciada, SWT.NONE);
			item.setText(columnaFk.getNameColumn());
		}					
	}	
	
	void onPreviousPage()
	{
	
		// Movemos a la siguiente p�gina, guardando en p�gina actual la que estamos ahora

		CargarFicheroWizard.err = (ErroresTipo) CargarFicheroWizard.lista.get(CargarFicheroWizard.PaginaActual );
		
		NumClave.setText((CargarFicheroWizard.PaginaActual+1)  + " de " + CargarFicheroWizard.NumeroPaginas);
		NombreForeign.setText(CargarFicheroWizard.err.getNombreConstraint());
		ForeignErrorImpl miError = (ForeignErrorImpl) CargarFicheroWizard.err.getError();
		Porcentaje.setText(miError.getPorcent().toString());
		TablaContenedora.setText(miError.getTableCont().getNameTable());	    
		TablaReferenciada.setText(miError.getTableRef().getNameTable());


		
		
    	if (CargarFicheroWizard.err.getEstado() ){
    	    mantenerBoton.setSelection(true);
    	    descartarBoton.setSelection(false);
        } else {
            descartarBoton.setSelection(true);
            mantenerBoton.setSelection(false);
        }		
		ColumnasContenido.removeAll();
		ColumnasReferenciada.removeAll();
		
		Iterator iterator = miError.getTableCont().getColumnCont().iterator();
		while( iterator. hasNext() ){
			ColumnFk columnaFk = (ColumnFk)iterator.next();
			TableItem item = new TableItem(ColumnasContenido, SWT.NONE);
			item.setText(columnaFk.getNameColumn());
		}			

		iterator = miError.getTableRef().getColumnCont().iterator();
		while( iterator. hasNext() ){
			ColumnFk columnaFk = (ColumnFk)iterator.next();
			TableItem item = new TableItem(ColumnasReferenciada, SWT.NONE);
			item.setText(columnaFk.getNameColumn());
		}					
	}	
	
}
