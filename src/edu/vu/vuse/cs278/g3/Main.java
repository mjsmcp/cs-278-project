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
		 try 
	     {
			 //all this works
	         final javax.swing.JFrame frame = new javax.swing.JFrame();
	         final InterfaceComponent comp = new InterfaceComponent(frame);
	         java.awt.EventQueue.invokeAndWait
	             ( new Runnable()
	                 { public void run() {
	                     frame.setSize(1000,700);
	                     frame.add(comp);
	                     frame.setVisible(true);
	                     try {
	                       comp.open("./CS278.nlogo");
	                     }
	                     catch(Exception ex) {
	                       ex.printStackTrace();
	                     }
	                 } } ) ;
			 try {
				comp.command("create-turtles 10");
			} catch (CompilerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	     }
	     catch(Exception ex) {
	         ex.printStackTrace();
	     }
	 
		 
	       /* Create and display the form */
	        try{
		        java.awt.EventQueue.invokeAndWait(new Runnable() {
		            public void run() {
		        		MainWindow.getInstance().setVisible(true);
		             }            
		        });
	        }
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        //create the bus, 250cm, 10000kg
	        ObjectManager.getInstance().addObject("bus",ObjectManager.getInstance().createBus(0, 0, 250, 10000));
	 }
	 
}
