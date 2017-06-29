package tesis;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;

import errors.Errores;
import errors.ErrorsFactory;
import errors.ErrorsPackage;
import errors.impl.CheckErrorImpl;
import errors.impl.ForeignErrorImpl;

public class CargarFicheroWizard extends Wizard  {

	PaginaLecturaFichero 		fileDataPage;
	PaginaForeign				foreignPage;
	PaginaCheck					checkPage;
	PaginaResumen				resumePage;
				
	private ISelection			selection;
	
	//public static HashMap hashMap = new HashMap();
	
	public static ArrayList lista = new ArrayList();
	
	public static boolean primera_foreign = true;
	public static boolean primera_check = true;
	public static boolean primera_foreign_p = true;
	public static boolean primera_check_p = true;
	 
	
	//public static int n_lista = -1; 
	
	//public static Iterator iterator;

	public static ErroresTipo err;
	
	public static int NumeroPaginas;
	public static int PaginaActual;
	
	public static boolean primera_entrada_pag_foreign = true;
	public static boolean primera_entrada_pag_check = true;
	
	public CargarFicheroWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	public void addPages(){
		if (fileDataPage == null) {
			fileDataPage = new PaginaLecturaFichero(selection);
			addPage(fileDataPage);
		}
		if (foreignPage == null) {
			foreignPage = new PaginaForeign(selection);
			addPage(foreignPage);
		}
		if (checkPage == null) {
			checkPage = new PaginaCheck(selection);
			addPage(checkPage);
		}
		if (resumePage == null) {
			resumePage = new PaginaResumen(selection);
			addPage(resumePage);
		}
	}
	@Override
	public boolean canFinish()
	{
		// cannot completr the wizard from the first page
		if (this.lista.size()> 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean performFinish() {
			  
		  try {
				// Initialize the model
				ErrorsPackage.eINSTANCE.eClass();
				// Retrieve the default factory singleton
				ErrorsFactory factory = ErrorsFactory.eINSTANCE;
				Errores  misErrores = factory.createErrores();
				
				for (int i=0; i<CargarFicheroWizard.lista.size(); i++ ){
					ErroresTipo err = (ErroresTipo) CargarFicheroWizard.lista.get(i);
					if (err.getEstado()) {
						if (err.getTipo().equals("F") ) {
								ForeignErrorImpl miError = (ForeignErrorImpl) err.getError();	
								misErrores.getErrores().add(miError);	
						} else {
								CheckErrorImpl miError = (CheckErrorImpl) err.getError();	
								misErrores.getErrores().add(miError);	
						}
					}
				}					
				Resource resource =  new XMIResourceImpl(URI.createURI("./src/tesis/salida.xmi"));
				resource.getContents().add(misErrores);				
				resource.save(null);
				MessageDialog.openInformation(Display.getCurrent().getActiveShell(),"Load Model", "Constraints selected have been saved in salida.xmi");
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		lista = null;
		
		
		
		return true;
	}
}
