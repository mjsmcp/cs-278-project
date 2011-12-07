package edu.vu.vuse.cs278.g3;
import org.nlogo.api.CompilerException;

import edu.vu.vuse.cs278.g3.engine.PhysicsEngine;
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
	 }
	 


/*
		try {
			PhysicsEngine pe = PhysicsEngine.getInstance();
			pe.enable();
			for (int i = 0; i <20; ++i) {
				pe.addtoQueue(new Runnable() {

					@Override
					public void run() {
						System.out.println("    Printing ");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {

						}
						
					}
					
				});
			}

			Thread.sleep(5000);
			System.out.println("Disabling");
			pe.disable();
			Thread.sleep(2000);
			System.out.println("Enabling");
			pe.enable();
			Thread.sleep(3000);
			System.out.println("Disabling");
			pe.disable();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
*/
}
