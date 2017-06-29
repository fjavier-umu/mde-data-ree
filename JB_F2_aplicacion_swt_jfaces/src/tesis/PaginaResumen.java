package tesis;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import errors.impl.CheckErrorImpl;
import errors.impl.ForeignErrorImpl;

public class PaginaResumen extends WizardPage {
	private ISelection selection;
	private static Table table;
	
	public PaginaResumen(ISelection selection) {
		super("wizardPage");
		setTitle("Visualazing Constraints");
		this.selection = selection;
	}

	public void createControl(Composite parent){
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
	 	layout.numColumns = 10;

		

		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		
		createLine(container, 10);
		
		SashForm form = new SashForm(container, SWT.HORIZONTAL | SWT.NULL);
		
		
		
		table = new Table(form, SWT.FULL_SELECTION | SWT.BORDER);
		
		TableColumn column = new TableColumn(table, SWT.LEFT);
		column.setText("Constraint Type");
		column.setWidth(200);
		table.setHeaderVisible(true);

		column = new TableColumn(table, SWT.LEFT);
		column.setText("Name");
		column.setWidth(200);
		table.setHeaderVisible(true);

		column = new TableColumn(table, SWT.LEFT);
		column.setText("Main Table");
		column.setWidth(200);
		table.setHeaderVisible(true);

		column = new TableColumn(table, SWT.LEFT);
		column.setText("Referenced Table");
		column.setWidth(200);
		table.setHeaderVisible(true);

		column = new TableColumn(table, SWT.LEFT);
		column.setText("Percentage");
		column.setWidth(100);
		table.setHeaderVisible(true);
		

		gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 8;
		
		form.setLayoutData(gd);
		
		
		/* A�adimos los listener */
		
		setControl(container);
		


	}



	private void updateStatus(String message) {
		setErrorMessage(message);
		//setPageComplete(message==null);
	}

	
    private void createLine(Composite parent, int ncol) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}		    
    

    
   
    public static void visualizaTabla() {
		
		for (int i=0; i<CargarFicheroWizard.lista.size(); i++ ){
			ErroresTipo err = (ErroresTipo) CargarFicheroWizard.lista.get(i);
			if (err.getEstado()) {
				TableItem item = new TableItem(table, SWT.NONE);
				if (err.getTipo().equals("F") ) {
					ForeignErrorImpl miError = (ForeignErrorImpl) err.getError();	
					item.setText(new String[] { ErroresTipo.desRestriccion(err.getTipo()), err.getNombreConstraint(), miError.getTableCont().getNameTable(), miError.getTableRef().getNameTable(), miError.getPorcent().toString() });	
				} else {
					CheckErrorImpl miError = (CheckErrorImpl) err.getError();	
					item.setText(new String[] { ErroresTipo.desRestriccion(err.getTipo()), err.getNombreConstraint(), miError.getNameTable().toString(), null, miError.getPorcent().toString() });	
				}
			}
		}	
		
    }
}
