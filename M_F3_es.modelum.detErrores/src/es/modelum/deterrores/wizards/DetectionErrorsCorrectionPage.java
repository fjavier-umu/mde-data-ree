package es.modelum.deterrores.wizards;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import es.modelum.deterrores.runRubyTL.Correct_ResidualWriter;
import es.modelum.deterrores.runRubyTL.ModelToSql;
import es.modelum.deterrores.runRubyTL.RunRubyTL;
import es.modelum.deterrores.viewer.*;
import es.modelum.deterrores.emf.DetErroresEMF;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (ecore).
 */

public class DetectionErrorsCorrectionPage extends WizardPage {

	private Text dataColumn;

	private Text syntax;

	private DetectionErrorsData data;

	private TableViewer viewer;
	
	private DetErroresEMF errorsEMF;
	
	private Button loadErrors;
	
	private int clicks_LoadError = -1;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public DetectionErrorsCorrectionPage() {
		super("DetErrorsCorrectionPage");
		setTitle("Detection Errors. Correction Page, Selection Errors");
		setDescription("This wizard give the posibility of correct some errors of the DataBase.");

		setPageComplete(true);
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		FillLayout layout = new FillLayout();
		container.setLayout(layout);
		

		Composite izq = new Composite(container, SWT.NULL/* | SWT.V_SCROLL*/);
		izq.setParent(container);
		GridLayout layoutIz = new GridLayout();
		izq.setLayout(layoutIz);
		layoutIz.verticalSpacing = 9;
		
		loadErrors = new Button(izq, SWT.CENTER | SWT.PUSH);
		loadErrors.setText("Load Errors");
		loadErrors.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				loadErrors();
			}
		});
		
		viewer = new TableViewer(izq, SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION | SWT.RESIZE);

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				ErrorViewer error = (ErrorViewer) selection.getFirstElement();
				dataColumn.setText(error.getData());
				syntax.setText(error.getSyntax());
			}
		});
		
		TableViewerColumn column = new TableViewerColumn(viewer, SWT.LEFT);
		column.getColumn().setText("Id");
		column.getColumn().setWidth(40);

		column = new TableViewerColumn(viewer, SWT.LEFT);
		column.getColumn().setText("Type");
		column.getColumn().setWidth(150);
		
		column = new TableViewerColumn(viewer, SWT.LEFT);
		column.getColumn().setText("Apply");
		column.getColumn().setWidth(50);
		column.setEditingSupport(new ErrorEditor(viewer, 2));
		
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);

		viewer.setContentProvider(new ErrorContentProvider());
		viewer.setLabelProvider(new ErrorLabelProvider());
		viewer.setItemCount(10);
				
		Composite derch = new Composite(container, SWT.NULL);
		GridLayout layoutDer = new GridLayout();
		derch.setLayout(layoutDer);
		layoutDer.verticalSpacing = 9;
		
		Label label = new Label(derch, SWT.NULL);
		label.setText("&Syntax");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		label.setLayoutData(gd);
		
		syntax = new Text(derch, SWT.FULL_SELECTION | SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		syntax.setEditable(false);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 200;
		syntax.setLayoutData(gd);
		
		createLine(derch, layoutDer.numColumns, true); 
		
		label = new Label(derch, SWT.NULL);
		label.setText("&Data Column");
		gd = new GridData(GridData.FILL_HORIZONTAL);
		label.setLayoutData(gd);
		
		dataColumn = new Text(derch, SWT.FULL_SELECTION | SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		dataColumn.setEditable(false);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 200;
		dataColumn.setLayoutData(gd);
		
		setControl(container);
	}

	private void loadErrors() {
		// Reseteamos la tabla entera la la lista con los errores
		viewer.getTable().removeAll();
		ErrorsViewer.getInstance().getErrors().clear();
		
		if (loadErrors.getText().equals("Load Errors")) {
			Point point = loadErrors.getSize();
			point.x += 10;
			loadErrors.setText("Reload Errors");
			loadErrors.setSize(point);
			
			DetectionErrorsWizard wizard = (DetectionErrorsWizard) getWizard();
			data = wizard.errorsData;
					
			String source = data.getProjectPath().toOSString() + File.separator + data.getErrorModel().toOSString();
			
			errorsEMF = new DetErroresEMF(source);
			
			clicks_LoadError = 0;
		} else { clicks_LoadError++; }
		
		errorsEMF.init(clicks_LoadError);
		
		viewer.setInput(ErrorsViewer.getInstance().getErrors());
	}
	
	public boolean doFinish() {
		if (clicks_LoadError != -1) {
			if (!errorsEMF.save()) {
				MessageDialog.openError(getShell(), "Error", "Saving the Models has an error.");
				return false;
			}
		}
		
		DetectionErrorsWizard wizard = (DetectionErrorsWizard)getWizard();
		DetectionErrorsData data = wizard.errorsData;
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(data.getProjectName());
		IResource resource = null;
		
		try {
			resource = project.findMember(data.getErrorModel());
			if (resource != null) resource.delete(true, null);
			
			resource = project.findMember(data.getCorrect());
			if (resource != null) resource.delete(true, null);
			
			resource = project.findMember(data.getResidual());
			if (resource != null) resource.delete(true, null);
			
			Correct_ResidualWriter transform = new Correct_ResidualWriter(data);
			transform.write();
		
			RunRubyTL runCorrect_Residual = new RunRubyTL(data, data.getRakefileCorrection().toOSString());
			runCorrect_Residual.execute("correctModels");
		
			runCorrect_Residual.execute("residualModels");			
			
			ModelToSql sql = new ModelToSql(data);
			sql.write();
			
			RunRubyTL runSQL = new RunRubyTL(data, data.getRakefileSQL().toOSString());
			runSQL.execute("model2sql");
			
		} catch (Exception e) {
			MessageDialog.openError(getShell(), "Error", e.getMessage());
			return false;
		}
		return true;
	}

	private void createLine(Composite parent, int ncol, boolean empty)
	{
		Label line;
		if (empty) line = new Label(parent, SWT.NULL);
		else line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}
}