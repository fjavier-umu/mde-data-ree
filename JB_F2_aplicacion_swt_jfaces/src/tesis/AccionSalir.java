package tesis;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.ApplicationWindow;

public class AccionSalir extends Action { 
	  ApplicationWindow window; 
	 
	  public AccionSalir(ApplicationWindow w) { 
	        super("E&xit@Ctrl+W",AS_PUSH_BUTTON); 
	        setToolTipText("Exit"); 
	        window = w; 
	        setImageDescriptor(ImageDescriptor.createFromFile (null,"./src/img/salir.gif")); 
	  } 
	  public void run() { 
	    window.close(); 
	  } 
	} 