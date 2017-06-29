package es.modelum.deterrores.runRubyTL;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import es.modelum.deterrores.wizards.DetectionErrorsData;

import gts.rubytl.launching.core.configuration.Binding;
import gts.rubytl.launching.core.configuration.TaskM2MWriter;
import gts.rubytl.launching.core.configuration.data.TaskM2MConfigurationData;

public class Correct_ResidualWriter {

	Binding sourceDML_DDL;
	Binding sourceError;
	Binding targetCorrect;
	Binding targetResidual;
	
	private IPath rakeFilePath;
	private String projectName;
	
	TaskM2MConfigurationData m2mCorrect;
	TaskM2MConfigurationData m2mResidual;
	
	public Correct_ResidualWriter(DetectionErrorsData data) throws Exception {
		projectName = data.getProjectName();
		rakeFilePath = data.getRakefileCorrection();
		
		sourceDML_DDL = new Binding();
		sourceDML_DDL.addModel(data.getDML_DDLModel().toOSString());
		sourceDML_DDL.addMetamodel("DML_DDL", data.getDML_DDLMetamodel().toOSString());
		
		sourceError = new Binding();
		sourceError.addModel(data.getErrorModel().toOSString());
		sourceError.addMetamodel("Errores", data.getErrorMetamodel().toOSString());
		
		targetCorrect = new Binding();
		targetCorrect.addModel(data.getCorrect().toOSString());
		targetCorrect.addMetamodel("Correct", data.getDML_DDLMetamodel().toOSString());
		
		targetResidual = new Binding();
		targetResidual.addModel(data.getResidual().toOSString());
		targetResidual.addMetamodel("Residual", data.getDML_DDLMetamodel().toOSString());
		
		m2mCorrect = new TaskM2MConfigurationData(data.getRuby(), data.getRubyTL_Path().toOSString(), data.getProjectPath().toOSString(), data.getTransformationCorrect().toOSString());
		m2mCorrect.addSourceBinding(sourceDML_DDL);
		m2mCorrect.addSourceBinding(sourceError);
		m2mCorrect.addTargetBinding(targetCorrect);
		
		m2mResidual = new TaskM2MConfigurationData(data.getRuby(), data.getRubyTL_Path().toOSString(), data.getProjectPath().toOSString(), data.getTransformationResidual().toOSString());
		m2mResidual.addSourceBinding(sourceDML_DDL);
		m2mResidual.addSourceBinding(sourceError);
		m2mResidual.addTargetBinding(targetResidual);
	}
	
	public void write() {	
		TaskM2MWriter writer = new TaskM2MWriter();
		String result = writer.writeConfiguration(m2mCorrect, "correctModels");
		result += "\n\n";
		result += writer.writeConfiguration(m2mResidual, "residualModels");
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(projectName));
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(rakeFilePath);
		try {
			InputStream stream = new ByteArrayInputStream(result.getBytes());
			if (file.exists()) {
				file.setContents(stream, true, true, null);
			} else {
				file.create(stream, true, null);
			}
			stream.close();
		} catch (IOException e) {
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
