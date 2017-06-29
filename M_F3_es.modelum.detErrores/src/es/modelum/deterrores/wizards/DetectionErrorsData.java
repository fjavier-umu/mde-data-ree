package es.modelum.deterrores.wizards;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class DetectionErrorsData {
	
	private final String ruby = "ruby";
	private IPath rubyTL_Path;
	private IPath projectPath;
	private String projectName;
	
	private final IPath modernizar_BD = new Path("helpers/modernizar_BD.rb");
	private final IPath correct_BD = new Path("helpers/correct_BD.rb");
	private final IPath residual_BD = new Path("helpers/residual_BD.rb");
	
	private final IPath transformationDML_DDL = new Path("transformations/DML_DDL.rb");
	private final IPath rakefileDML_DDL = new Path("tasks/DML_DDL.rake");
	
	private final IPath transformationError = new Path("transformations/DetectionErrors.rb");
	private final IPath rakefileError = new Path("tasks/Error.rake");
	
	private final IPath transformationCorrect = new Path("transformations/CorrectionErrors.rb");
	private final IPath transformationResidual = new Path("transformations/CorrectionErrorsResidual.rb");
	private final IPath rakefileCorrection = new Path("tasks/Correction.rake");
	
	private final IPath ddlMetamodel = new Path("metamodels/DDL.ecore");
	private IPath ddlModel;
	
	private final IPath dmlMetamodel = new Path("metamodels/DML.ecore");
	private IPath dmlModel;
	
	private final IPath dml_ddlMetamodel = new Path("metamodels/DML_DDL.ecore");
	private final IPath dml_ddlModel = new Path("models/DML_DDL.ecore");
	private final IPath dml_ddlEmof = new Path("models/DML_DDL.emof");
	
	private final IPath errorMetamodel = new Path("metamodels/Errores.ecore");
	private final IPath errorModel = new Path("models/Errores.ecore");
	private final IPath errorEmof = new Path("models/Errores.emof");
	
	private final IPath correct = new Path("models/DML_DDL_Correct.ecore");
	private final IPath residual = new Path("models/DML_DDL_Residual.ecore");
	
	private final IPath modelToSql = new Path("transformations/modelToSql.2code");
	private final IPath rakefileSQL = new Path("tasks/ModelToSql.rake");
	private final IPath generationSQL = new Path("generationSQL");
	
	private final IPath tableTemplate = new Path("templates/create_table.rtemplate");
	private final IPath insertTemplate = new Path("templates/insert_into.rtemplate");
	
	public String getRuby() { return ruby; }
	
	public IPath getRubyTL_Path() { return rubyTL_Path; }
	public void setRubyTL_Path(IPath rubyTL_Path) { this.rubyTL_Path = rubyTL_Path; }
	
	public IPath getProjectPath() { return projectPath; }
	public void setProjectPath(IPath projectPath) { this.projectPath = projectPath; }
	
	public String getProjectName() { return projectName; }
	public void setProjectName(String projectName) { this.projectName = projectName; }
	
	public IPath getDDLMetamodel() { return ddlMetamodel; }
	
	public IPath getDDLModel() { return ddlModel; }
	public void setDDLModel(IPath ddlModel) { this.ddlModel = ddlModel; }
	
	public IPath getDMLMetamodel() { return dmlMetamodel; }
	
	public IPath getDMLModel() { return dmlModel; }
	public void setDMLModel(IPath dmlModel) { this.dmlModel = dmlModel; }
	
	public IPath getDML_DDLMetamodel() { return dml_ddlMetamodel; }
	
	public IPath getDML_DDLModel() { return dml_ddlModel; }
	
	public IPath getErrorMetamodel() { return errorMetamodel; }
	
	public IPath getErrorModel() { return errorModel; }
	
	public IPath getCorrect() { return correct; }
	
	public IPath getResidual() { return residual; }

	public IPath getTransformationDML_DDL() { return transformationDML_DDL; }

	public IPath getRakefileDML_DDL() { return rakefileDML_DDL; }

	public IPath getTransformationError() { return transformationError; }

	public IPath getRakefileError() { return rakefileError; }

	public IPath getTransformationCorrect() { return transformationCorrect; }
	
	public IPath getTransformationResidual() { return transformationResidual; }

	public IPath getRakefileCorrection() { return rakefileCorrection; }

	public IPath getModernizar_BD() { return modernizar_BD; }

	public IPath getCorrect_BD() { return correct_BD; }

	public IPath getResidual_BD() { return residual_BD; }

	public IPath getDML_DDLEmof() { return dml_ddlEmof;	}

	public IPath getErrorEmof() { return errorEmof;	}

	public IPath getModelToSql() { return modelToSql; }

	public IPath getTableTemplate() { return tableTemplate; }

	public IPath getInsertTemplate() { return insertTemplate; }

	public IPath getRakefileSQL() { return rakefileSQL; }

	public IPath getGenerationSQL() { return generationSQL; }
}
