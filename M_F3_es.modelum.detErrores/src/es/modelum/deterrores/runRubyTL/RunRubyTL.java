package es.modelum.deterrores.runRubyTL;

import es.modelum.deterrores.wizards.DetectionErrorsData;
import gts.rubytl.launching.core.configuration.data.RakefileConfigurationData;
import gts.rubytl.launching.core.launcher.RakefileLauncher;


public class RunRubyTL {

	RakefileLauncher launcher;
	
	public RunRubyTL(DetectionErrorsData data, String rakeFile) {
		RakefileConfigurationData configData = new RakefileConfigurationData(data.getRuby(), data.getRubyTL_Path().toOSString(), data.getProjectPath().toOSString(), rakeFile);
		launcher = new RakefileLauncher(configData);
	}
	
	public String execute(String transform) {
		return launcher.execute(transform);
	}
}
