package edu.vu.vuse.cs278.g3;
import org.nlogo.api.CompilerException;

import edu.vu.vuse.cs278.g3.engine.PhysicsEngine;
import edu.vu.vuse.cs278.g3.gui.MainWindow;
import edu.vu.vuse.cs278.g3.model.*;
import org.nlogo.lite.InterfaceComponent;

public class Main {
	 public static void main(String[] argv) {
	        
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
			 MainWindow.getInstance().command("set-background");
			 ObjectManager.getInstance().addObject("bus", ObjectManager.getInstance().createBus(0, 0, 250, 10000));
			 ObjectManager.getInstance().getObject("bus").setAcceleration(2);
			 ObjectManager.getInstance().getObject("bus").setDecleration(2);
			 
			 //create tree to show movement of bus.
			 ObjectManager.getInstance().addObject("tree", ObjectManager.getInstance().createSquare(700, 8, 30, 0));
			 SquareObject tree = (SquareObject) ObjectManager.getInstance().getObject("tree");
			 tree.setShape("tree");
			 
			 //demonstrates how to move the bus forward
			 /*
			 while (true){
				 ((BusObject)ObjectManager.getInstance().getObject("bus")).moveForward(10.0);
				 try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 */
	 }
	 
}
