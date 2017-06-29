package tesis;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Display;

	public class AboutAction extends Action {
			ApplicationWindow window;
			ImageDescriptor imageDesc = ImageDescriptor.createFromFile (null,"./src/img/info.gif");
			
			public AboutAction(ApplicationWindow w) {
				setToolTipText("About author");
				this.setText("&About");
				window = w;
				setImageDescriptor(imageDesc);
			}
			public void run() {
				MessageDialog.openInformation(Display.getCurrent().getActiveShell(),"About author", "Fco Javier Bermudez Ruiz");
				
		      
			}
	} 