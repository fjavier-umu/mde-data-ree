package es.modelum.deterrores.runRubyTL;

import es.modelum.deterrores.wizards.DetectionErrorsData;
import gts.rubytl.launching.core.configuration.Binding;
import gts.rubytl.launching.core.configuration.TaskM2TWriter;
import gts.rubytl.launching.core.configuration.data.TaskM2TConfigurationData;

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


public class ModelToSql {

	Binding sourceDML_DDL;
	
	private IPath rakeFilePath;
	private String projectName;
	
	TaskM2TConfigurationData m2tConf;
	
	public ModelToSql(DetectionErrorsData data) throws Exception {
		projectName = data.getProjectName();
		rakeFilePath = data.getRakefileSQL();
		
		sourceDML_DDL = new Binding();
		sourceDML_DDL.addModel(data.getCorrect().toOSString());
		sourceDML_DDL.addMetamodel("DML_DDL", data.getDML_DDLMetamodel().toOSString());
		
		m2tConf = new TaskM2TConfigurationData(data.getRuby(), data.getRubyTL_Path().toOSString(), data.getProjectPath().toOSString(), data.getModelToSql().toOSString(), data.getGenerationSQL().toOSString());
		m2tConf.addSourceBinding(sourceDML_DDL);
	}
	
	public void write() {	
		TaskM2TWriter writer = new TaskM2TWriter();
		String result = writer.writeConfiguration(m2tConf, "model2sql");
		
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
