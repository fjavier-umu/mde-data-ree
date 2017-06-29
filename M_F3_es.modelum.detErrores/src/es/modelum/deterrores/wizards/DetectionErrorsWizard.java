package es.modelum.deterrores.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.*;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "ecore". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class DetectionErrorsWizard extends Wizard implements INewWizard {
	
	public DetectionErrorsMainPage mainPage;
	public DetectionErrorsCorrectionPage correctionPage;
	public DetectionErrorsData errorsData;
	
	private ISelection selection;
	private IWorkbench workbench;

	/**
	 * Constructor for DetectionErrorsWizard.
	 */
	public DetectionErrorsWizard() {
		super();
		setNeedsProgressMonitor(true);
		
		errorsData = new DetectionErrorsData();
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {		
		mainPage = new DetectionErrorsMainPage(workbench, selection);
		addPage(mainPage);
		
		correctionPage = new DetectionErrorsCorrectionPage();
		addPage(correctionPage);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		return correctionPage.doFinish();
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
}