package tesis;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;

	public class CargarModelo extends Action {
			ApplicationWindow window;
			ImageDescriptor imageDesc = ImageDescriptor.createFromFile (null,"./src/img/cargar.gif");
			
			public CargarModelo(ApplicationWindow w) {
				setToolTipText("Load Defect Model");
				this.setText("&Load Model");
				window = w;
				setImageDescriptor(imageDesc);
			}
			public void run() {
					WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), new CargarFicheroWizard());
			        dialog.open();
			}
	} 