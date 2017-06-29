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

public class ErrorWriter {

	Binding sourceDML_DDL;
	Binding targetError;
	
	private IPath rakeFilePath;
	private String projectName;
	
	TaskM2MConfigurationData m2mConf;
	
	public ErrorWriter(DetectionErrorsData data) throws Exception {
		projectName = data.getProjectName();
		rakeFilePath = data.getRakefileError();
		
		sourceDML_DDL = new Binding();
		sourceDML_DDL.addModel(data.getDML_DDLModel().toOSString());
		sourceDML_DDL.addMetamodel("DML_DDL", data.getDML_DDLMetamodel().toOSString());
		
		targetError = new Binding();
		targetError.addModel(data.getErrorModel().toOSString());
		targetError.addMetamodel("Errores", data.getErrorMetamodel().toOSString());
		
		m2mConf = new TaskM2MConfigurationData(data.getRuby(), data.getRubyTL_Path().toOSString(), data.getProjectPath().toOSString(), data.getTransformationError().toOSString());
		m2mConf.addSourceBinding(sourceDML_DDL);
		m2mConf.addTargetBinding(targetError);
	}
	
	public void write() {	
		TaskM2MWriter writer = new TaskM2MWriter();
		String result = writer.writeConfiguration(m2mConf, "models2error");
		
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
