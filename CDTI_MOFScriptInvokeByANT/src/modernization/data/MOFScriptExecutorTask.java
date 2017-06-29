package modernization.data;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.mofscript.parser.MofScriptParseError;
import org.eclipse.mofscript.parser.ParserUtil;
import org.eclipse.mofscript.runtime.ExecutionManager;
import org.eclipse.mofscript.runtime.ExecutionMessageListener;
import org.eclipse.mofscript.runtime.MofScriptExecutionException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 * MOFScriptExecutor is a generic class to execute a MOFScript transformation.
 * This class is based on the example provided in the MOFScript User Guide,
 * which can be found at http://www.eclipse.org/gmt/mofscript/ .
 * 
 * Notice that before executing the transformation, it is necessary to set the
 * parameters using the method
 * {@link modernization.data.MOFScriptExecutor#setParameters}
 * .
 * 
 */
public class MOFScriptExecutorTask extends Task implements ExecutionMessageListener {

        private String compilepath;
        private String metamodel;
        private String metamodelname;
        private String model;
        private String transformation;
        private String outputdir;
        private ResourceSet rsSource;

        public String getMetamodelname() {
                return metamodelname;
        }

        public void setMetamodelname(String metamodelname) {
                this.metamodelname = metamodelname;
        }

        public String getCompilepath() {
                return compilepath;
        }

        public void setCompilepath(String compilepath) {
                this.compilepath = compilepath;
        }

        public String getMetamodel() {
                return metamodel;
        }

        public void setMetamodel(String metamodel) {
                this.metamodel = metamodel;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public String getTransformation() {
                return transformation;
        }

        public void setTransformation(String transformation) {
                this.transformation = transformation;
        }

        public String getOutputdir() {
                return outputdir;
        }

        public void setOutputdir(String outputdir) {
                this.outputdir = outputdir;
        }

        /**
         * Sets the parameters necessary to the transformation.
         * 
         * @param compilepath
         *            the compile path
         * @param metamodel
         *            the path to the metamodel file
         * @param metamodelname
         *            the name used to identify the metamodel in the MOFScript
         *            transformation
         * @param model
         *            the path to the model file
         * @param transformation
         *            the path to the transformation file
         * @param outputdir
         *            the output directory, where the code will be generated
         */
        public void setParameters(String compilepath, String metamodel,
                        String metamodelname, String model, String transformation,
                        String outputdir) {
                setCompilepath(compilepath);
                setMetamodel(metamodel);
                setMetamodelname(metamodelname);
                setModel(model);
                setTransformation(transformation);
                setOutputdir(outputdir);
        }

        private void makeTransformation() throws MofScriptExecutionException,
                        IOException {
                ParserUtil parserUtil = new ParserUtil();
                ExecutionManager execMgr = ExecutionManager.getExecutionManager();

                registryJASFactory();

                parserUtil.setCompilePath(getCompilepath());

                parserUtil.parse(new File(getTransformation()), true);

                // check for errors:
                int errorCount = ParserUtil.getModelChecker().getErrorCount();
                Iterator<?> errorIt = ParserUtil.getModelChecker().getErrors();
                writeErroLog(errorCount, errorIt);

                execMgr.setRootDirectory(getOutputdir());

                registryFactoryToJAS();

                executeTransformation(execMgr, getModel());
        }

        private EObject loadSourceModel(String path) {
                XMIResourceFactoryImpl _xmiFac = new XMIResourceFactoryImpl();
                EObject sourceModel = null;
                File sourceModelFile = new File(path);
                //ResourceSet rSet = new ResourceSetImpl();
                rsSource.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
                                _xmiFac);
                URI uri = URI.createFileURI(sourceModelFile.getAbsolutePath());
                Resource resource = rsSource.getResource(uri, true);

                if (resource != null) {
                        if (resource.getContents().size() > 0) {
                                sourceModel = (EObject) resource.getContents().get(0);
                        }
                }
                return sourceModel;
        }

        private void executeTransformation(ExecutionManager execMgr, String fileLoad)
                        throws MofScriptExecutionException {
                // load source model
                EObject sourceModel = loadSourceModel(fileLoad);

                // set the source model for the execution manager
                execMgr.addSourceModel(sourceModel);

                // if true, files are not generated to the file system, but populated
                // into a filemodel which can be fetched afterwards.
                // Value false will result in standard file generation
                execMgr.setUseFileModel(false);
                // Turns on/off system logging
                execMgr.setUseLog(false);
                // Adds an output listener for the transformation execution.
                execMgr.getExecutionStack().addOutputMessageListener(this);
                execMgr.executeTransformation();
                execMgr.clearModelTypeMap();
        }

        private void registryFactoryToJAS() {
                Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
                                "txt", new XMIResourceFactoryImpl() {
                                        public Resource createResource(URI uri) {
                                                XMIResource xmiResource = new XMIResourceImpl(uri);
                                                return xmiResource;
                                        }
                                });
        }

        private void writeErroLog(int errorCount, Iterator<?> errorIt) {
                System.out.println("Parsing result: " + errorCount + " errors");
                if (errorCount > 0) {
                        for (; errorIt.hasNext();) {
                                MofScriptParseError parseError = (MofScriptParseError) errorIt
                                                .next();
                                System.out.println("\t \t: Error: " + parseError.toString());
                        }
                        return;
                }
        }

        /**
         * 
         */
        private void registryJASFactory() {
                rsSource = new ResourceSetImpl();
                rsSource.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                                "*", new XMIResourceFactoryImpl());
                String metamodelString = getMetamodel();
                System.out.println("Metamodel path: " + metamodelString);
                Resource resSource = rsSource.getResource(URI
                                .createFileURI(metamodelString), true);
                EPackage pkg = (EPackage) resSource.getContents().get(0);
                EPackage.Registry.INSTANCE.put(getMetamodelname(), pkg);
        }

        /*
         * (non-Javadoc)
         * 
         * @see
         * org.eclipse.mofscript.runtime.ExecutionMessageListener#executionMessage
         * (java.lang.String, java.lang.String)
         */
        public void executionMessage(String type, String description) {
                System.out.println(type + " - " + description);
        }

        /**
         * Executes the transformation.
         */
        public void executeTransformations() {
                long start = System.currentTimeMillis();
                try {
                        makeTransformation();
                } catch (MofScriptExecutionException e) {
                        new RuntimeException(e);
                } catch (IOException e) {
                        new RuntimeException(e);
                }
                System.out.println("Total time to apply the transformation: " + (System.currentTimeMillis() - start) + " ms");
        }

        public void execute() throws BuildException {
        	 /*setParameters(
                             "D:\\workspace\\MOFScriptRunner\\metamodels",
                             "D:\\workspace\\MOFScriptRunner\\metamodels\\placeTransition.ecore",
                             "http:///ptnet.ecore",
                             "D:\\workspace\\MOFScriptRunner\\models\\parque2.ptnet",
                             "D:\\workspace\\MOFScriptRunner\\Petri2Maude.m2t",
                             "D:\\workspace\\MOFScriptRunner\\metamodels");
        	  */
             executeTransformations();
        }
        public static void main(String[] args) {
                MOFScriptExecutorTask mof = new MOFScriptExecutorTask();
                mof.execute();
        }
}