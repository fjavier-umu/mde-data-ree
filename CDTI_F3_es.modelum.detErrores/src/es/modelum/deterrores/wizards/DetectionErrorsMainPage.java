package es.modelum.deterrores.wizards;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

import gts.rubytl.core.RubytlCore;

import es.modelum.deterrores.runRubyTL.*;
import es.modelum.deterrores.Activator;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (ecore).
 */

public class DetectionErrorsMainPage extends WizardPage {
	
	private Text ddlModel;
	
	private Text dmlModel;
	
	private String projectName;

	private ISelection selection;
	
	private IWorkbench workbench;
	
	private ProgressBar progressBar;
	
	private Text outPut;
	
	private Button browseDML;
	
	private Button browseDDL;
	
	private boolean launched = false;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public DetectionErrorsMainPage(IWorkbench workbench, ISelection selection) {
		super("DetErrorsMainPage");
		setTitle("Detection Errors. Main Page, Selections Models");
		setDescription("This wizard start with two models based on two metamodels. Please select the models.");
		this.selection = selection;
		this.workbench = workbench;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		container.setLayout(layout);
		
		createLine(container, layout.numColumns, false);
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&DML Model:");
		dmlModel = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		dmlModel.setLayoutData(gd);
		dmlModel.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		browseDML = new Button(container, SWT.PUSH);
		browseDML.setText("Import...");
		browseDML.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				importFileWizard(0);
			}
		});
		
		createLine(container, layout.numColumns, false);
				
		label = new Label(container, SWT.NULL);
		label.setText("&DDL Model:");
		ddlModel = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		ddlModel.setLayoutData(gd);
		ddlModel.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		browseDDL = new Button(container, SWT.PUSH);
		browseDDL.setText("Import...");
		browseDDL.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				importFileWizard(1);
			}
		});
		
		createLine(container, layout.numColumns, false);
		createLine(container, layout.numColumns, true);
		createLine(container, layout.numColumns, true);
		
		label = new Label(container, SWT.NULL);
		label.setText("&Transformation");
		
		Button launcher = new Button(container, SWT.PUSH);
		launcher.setText("&Launch&");
		launcher.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				launch();
			}
		});
		
		createLine(container, layout.numColumns, true);
		
		progressBar = new ProgressBar(container, SWT.NULL);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = layout.numColumns;
		progressBar.setLayoutData(gridData);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);

		createLine(container, layout.numColumns, true);
		
		outPut = new Text(container, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
		outPut.setEditable(false);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = layout.numColumns;
		gd.heightHint = 100;
		outPut.setLayoutData(gd);
		
		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		boolean exists = false;
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (int i = 0; i < projects.length; i++) {
			IProject proj = projects[i];
			
			try {
				IProjectNature projNature = proj.getNature(RubytlCore.NATURE_ID);
				if (projNature != null) {
					exists = true;
					projectName = proj.getName();
					break;
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		if (!exists) {
			projectName = Activator.PROJECT;
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			if (!(project.exists())) {
				IProgressMonitor monitor = null;
				try {
					project.create(monitor);
					project.open(monitor);
			
					IPath path = new Path("metamodels");
					IFolder customFolder = project.getFolder(path);
					customFolder.create(true, true, null);
					
					path = new Path("models");
					customFolder = project.getFolder(path);
					customFolder.create(true, true, null);
			
					path = new Path("tasks");
					customFolder = project.getFolder(path);
					customFolder.create(true, true, null);
			
					path = new Path("transformations");
					customFolder = project.getFolder(path);
					customFolder.create(true, true, null);
			
					path = new Path("helpers");
					customFolder = project.getFolder(path);
					customFolder.create(true, true, null);
					
					path = new Path("templates");
					customFolder = project.getFolder(path);
					customFolder.create(true, true, null);
					
					path = new Path("generationSQL");
					customFolder = project.getFolder(path);
					customFolder.create(true, true, null);
					
					setNature(project);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		else {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IResource resource = project.findMember("templates");
			if (resource == null) {
				IPath path = new Path("templates");
				IFolder customFolder = project.getFolder(path);
				try {
					customFolder.create(true, true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			resource = project.findMember("generationSQL");
			if (resource == null) {
				IPath path = new Path("generationSQL");
				IFolder customFolder = project.getFolder(path);
				try {
					customFolder.create(true, true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		
		initProject();
		
		dmlModel.setText("");
		ddlModel.setText("");		
		outPut.setText("");
	}
		
	private void importFileWizard(int browser) {
		ImportWizard importWizard = null;
		if (browser == 0) importWizard = new ImportWizard("Import DML Model.");
		else if (browser == 1) importWizard = new ImportWizard("Import DDL Model.");
		
		importWizard.init(workbench, (IStructuredSelection)selection);
		WizardDialog dialog = new WizardDialog(getShell(), importWizard);
		dialog.open();
		
		if (browser == 0) dmlModel.setText(importWizard.filePath);
		else if (browser == 1) ddlModel.setText(importWizard.filePath);
	}
	
	private void initProject() {
		DetectionErrorsWizard wizard = (DetectionErrorsWizard)getWizard();
		DetectionErrorsData data = wizard.errorsData;
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(projectName));
		IContainer container = (IContainer) resource;
		
		copyFileFromJar(container, data.getDMLMetamodel());
		copyFileFromJar(container, data.getDDLMetamodel());
		copyFileFromJar(container, data.getDML_DDLMetamodel());
		copyFileFromJar(container, data.getErrorMetamodel());
		
		copyFileFromJar(container, data.getTransformationDML_DDL());
		copyFileFromJar(container, data.getTransformationError());
		copyFileFromJar(container, data.getTransformationCorrect());
		copyFileFromJar(container, data.getTransformationResidual());
		copyFileFromJar(container, data.getModelToSql());
		
		copyFileFromJar(container, data.getCorrect_BD());
		copyFileFromJar(container, data.getModernizar_BD());
		copyFileFromJar(container, data.getResidual_BD());
		
		copyFileFromJar(container, data.getTableTemplate());
		copyFileFromJar(container, data.getInsertTemplate());
	}
	
	private void copyFileFromJar(IContainer container, IPath resource) {
		IFile file = container.getFile(resource);

		Location location = Platform.getInstallLocation();
		
		Path eclipsePath = new Path(location.getURL().getPath() + Path.SEPARATOR + "plugins" + Path.SEPARATOR + Activator.PLUGIN_ID + "_1.0.0.jar");
		
		File fileJ = new File(eclipsePath.toOSString());
		try {
			JarFile jarFile = new JarFile(fileJ, true);

	        JarEntry jarEntry = (JarEntry)jarFile.getEntry(resource.toString());
	        InputStream stream = jarFile.getInputStream(jarEntry);

			//InputStream stream = getClass().getClassLoader().getResource(resource.toOSString()).openStream();
			if (file.exists()) {
				file.delete(true, null);
				file.create(stream, true, null);
			} else {
				file.create(stream, true, null);
			}
			stream.close();
		} catch (IOException e) {
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	private void setNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();			

			for (int i = 0; i < natures.length; ++i) {
				if (RubytlCore.NATURE_ID.equals(natures[i])) {
					// Remove the nature
					String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i,
							natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
					return;
				}
			}
			
			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = RubytlCore.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
		}
	}
	
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		String dmlM = getDMLModel();
		String ddlM = getDDLModel();

		if (launched) updateStatus(null);
		
		if (dmlM.length() == 0) {
			updateStatus("DML Model must be specified");
			return;
		}
		if (ddlM.length() == 0) {
			updateStatus("DDL Model must be specified");
			return;
		}
		IResource containerDML = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).findMember(new Path(dmlM));
		if (containerDML == null) {
			updateStatus("Model DML must exist");
			return;
		}
		
		IResource containerDDL = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).findMember(new Path(ddlM));
		if (containerDDL == null) {
			updateStatus("Model DDL must exist");
			return;
		}
		
		int dotLoc = dmlM.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = dmlM.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("ecore") == false) {
				updateStatus("Model DML extension must be \"ecore\"");
				return;
			}
		}
		
		dotLoc = ddlM.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = ddlM.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("ecore") == false) {
				updateStatus("Model DDL extension must be \"ecore\"");
				return;
			}
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null && launched);
	}

	public boolean canFlipToNextPage()
	{
		if (getErrorMessage() != null) return false;
		return isPageComplete();
	}
	
	public void launch() {
		DetectionErrorsWizard wizard = (DetectionErrorsWizard)getWizard();
		DetectionErrorsData data = wizard.errorsData;
		updateData(data);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IResource resource = null;
		try {			
			progressBar.setSelection(0);
			
			resource = project.findMember(data.getDML_DDLModel());
			if (resource != null) resource.delete(true, null);
			
			DML_DDLWriter transformDML_DDL = new DML_DDLWriter(data);
			transformDML_DDL.write();		
		
			progressBar.setSelection(25);
		
			RunRubyTL runDML_DDL = new RunRubyTL(data, data.getRakefileDML_DDL().toOSString());
			outPut.append(runDML_DDL.execute("models2model"));
			outPut.append("\n");			
			outPut.redraw();
		
			Thread.sleep(500);
		
			progressBar.setSelection(50);
		
			resource = project.findMember(data.getErrorModel());
			if (resource != null) resource.delete(true, null);
			
			ErrorWriter transformError = new ErrorWriter(data);
			transformError.write();		
		
			progressBar.setSelection(75);
		
			RunRubyTL runError = new RunRubyTL(data, data.getRakefileError().toOSString());
			outPut.append(runError.execute("models2error"));
			outPut.append("\n");
			outPut.redraw();
		
			Thread.sleep(500);
		
			progressBar.setSelection(100);
		} catch (Exception e) {
			MessageDialog.openError(getShell(), "Error", e.getMessage());
		}
		
		launched = true;
		updateStatus(null);
	}
	
	private void updateData(DetectionErrorsData data) {
		data.setDDLModel(new Path(getDDLModel()));
		data.setDMLModel(new Path(getDMLModel()));
		
		data.setProjectName(projectName);
		
		IPath projectPath = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).getLocation();
		data.setProjectPath(projectPath);
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
	
	public String getDMLModel() {
		return dmlModel.getText();
	}
	
	public String getDDLModel() {
		return ddlModel.getText();
	}
	
	public boolean getLaunched() {
		return launched;
	}
}