package tesis;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
  

public class VentanaPrincipal extends ApplicationWindow {
		
		
		public VentanaPrincipal() {
			super(null);
			this.addMenuBar();
			addStatusLine();
			addToolBar(SWT.FLAT |SWT.WRAP);
			
		}
		
		protected Control createContents (Composite parent) {
			Shell shell = this.getShell();
			shell.setText("Defect Model Assistant");
			shell.setSize(1000,600);
			
		
			
			
			parent.pack();
			return parent;
		
		}

		protected MenuManager createMenuManager() {
			MenuManager bar = new MenuManager();
			
			MenuManager archivoMenu = new MenuManager("&File");
			MenuManager ayudaMenu = new MenuManager("&Help");
			
			bar.add(archivoMenu);
			bar.add(ayudaMenu);
			
			archivoMenu.add(new CargarModelo(this));
			archivoMenu.add(new AccionSalir(this));

			ayudaMenu.add(new AboutAction(this));
			
			return bar;
		}
		
		protected ToolBarManager createToolBarManager(int style) {
			ToolBarManager toolBarManager = new ToolBarManager(style);
			toolBarManager.add(new CargarModelo(this));
			toolBarManager.add(new AccionSalir(this));
			toolBarManager.add(new AboutAction(this));
			
			return toolBarManager;
		}



		
		public static void main(String[] args){
			VentanaPrincipal app = new VentanaPrincipal();
			
			app.setBlockOnOpen(true);
			app.open();
			
			Display .getCurrent().dispose();
			
		}
	}
