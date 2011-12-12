package edu.vu.vuse.cs278.g3;
import org.nlogo.api.CompilerException;

import edu.vu.vuse.cs278.g3.engine.PhysicsEngine;
import edu.vu.vuse.cs278.g3.gui.MainWindow;
import edu.vu.vuse.cs278.g3.model.ObjectManager;
import edu.vu.vuse.cs278.g3.model.RoundObject;
import edu.vu.vuse.cs278.g3.model.SquareObject;
import org.nlogo.lite.InterfaceComponent;

public class Main {
	 public static void main(String[] argv) {
		 

	        //create the bus, 250cm, 10000kg
	        
	       /* Create and display the form */
	        try{
		        java.awt.EventQueue.invokeAndWait(new
		        		Runnable() {
		            public void run() {
		        		MainWindow.getInstance().setVisible(true);
		             }
		        });
	        }
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        initializeBus();
	 }
	 
	 
	 public static void initializeBus() {
		 ObjectManager.getInstance().addObject("bus", ObjectManager.getInstance().createBus(0, 0, 250, 10000));
		 ObjectManager.getInstance().getObject("bus").setAcceleration(2);
		 ObjectManager.getInstance().getObject("bus").setDecleration(2);
	    }

	 
}
