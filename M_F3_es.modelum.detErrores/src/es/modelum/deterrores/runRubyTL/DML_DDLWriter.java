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

import gts.age.preferences.PreferenceHelper;
import gts.eclipse.core.resources.ResourcesUtil;
import gts.rubytl.launching.core.configuration.Binding;
import gts.rubytl.launching.core.configuration.TaskM2MWriter;
import gts.rubytl.launching.core.configuration.data.TaskM2MConfigurationData;

public class DML_DDLWriter {

	Binding sourceDML;
	Binding sourceDDL;
	Binding targetDML_DDL;
	
	private IPath rakeFilePath;
	private String projectName;
	private String rubyTL_Path;
	
	TaskM2MConfigurationData m2mConf;
	
	public DML_DDLWriter(DetectionErrorsData data) throws Exception {
		projectName = data.getProjectName();
		rakeFilePath = data.getRakefileDML_DDL();
		rubyTLPath();
		data.setRubyTL_Path(new Path(rubyTL_Path));
		
		sourceDML = new Binding();
		sourceDML.addModel(data.getDMLModel().toOSString());
		sourceDML.addMetamodel("DML", data.getDMLMetamodel().toOSString());
		
		sourceDDL = new Binding();
		sourceDDL.addModel(data.getDDLModel().toOSString());
		sourceDDL.addMetamodel("DDL", data.getDDLMetamodel().toOSString());
		
		targetDML_DDL = new Binding();
		targetDML_DDL.addModel(data.getDML_DDLModel().toOSString());
		targetDML_DDL.addMetamodel("DML_DDL", data.getDML_DDLMetamodel().toOSString());
		
		m2mConf = new TaskM2MConfigurationData(data.getRuby(), data.getRubyTL_Path().toOSString(), data.getProjectPath().toOSString(), data.getTransformationDML_DDL().toOSString());
		m2mConf.addSourceBinding(sourceDML);
		m2mConf.addSourceBinding(sourceDDL);
		m2mConf.addTargetBinding(targetDML_DDL);
	}
	
	public void write() {	
		TaskM2MWriter writer = new TaskM2MWriter();
		String result = writer.writeConfiguration(m2mConf, "models2model");
		
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
	
	private void rubyTLPath() throws Exception {
		if ( PreferenceHelper.useAlternativePath() ) {
			rubyTL_Path = ResourcesUtil.joinPath(PreferenceHelper.alternativePath(), "lib", "rubytl.rb");
		} 
		else throw new Exception("Not Alternative Path for RubyTL. Please select one.");
	}
}
