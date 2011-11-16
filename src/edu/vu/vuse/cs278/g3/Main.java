package edu.vu.vuse.cs278.g3;
import org.nlogo.app.App;

import edu.vu.vuse.cs278.g3.engine.PhysicsEngine;
import edu.vu.vuse.cs278.g3.model.RoundObject;
import edu.vu.vuse.cs278.g3.model.SquareObject;


public class Main {

	public static void main(String[] args) {
/*		
		App.main(args);	//setup netlogo
		try {
			java.awt.EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					try {
						//open and run project
						App.app.open("./CS278.nlogo");
					} catch (java.io.IOException ex) {
						ex.printStackTrace();
					}
				}
			});
			
			App.app.command("set-background"); //setup background method, defined in nlogo file
			
			int turtle_num = 0; //increment by one after each object creation
			SquareObject sq0 = new SquareObject(turtle_num++, 0.0, 0.0, 1, 1); 
			RoundObject r0 = new RoundObject(turtle_num++, 0.0, 0.0, 1);
			SquareObject sq1 = new SquareObject(turtle_num++, 0, 0, 1, 1);
			RoundObject r1 = new RoundObject(turtle_num++, 0, 0, 4);
			sq0.updatePosition(-5, -10);
			r0.updatePosition(10, 5);	
			sq1.updatePosition(-10, -5);
			r1.updatePosition(5, 10);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
*/

		try {
			PhysicsEngine pe = new PhysicsEngine();
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

}
