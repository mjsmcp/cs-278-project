package edu.vu.vuse.cs278.g3.engine;

import edu.vu.vuse.cs278.g3.model.ObjectManager;
import edu.vu.vuse.cs278.g3.model.PhysicsObject;
import edu.vu.vuse.cs278.g3.model.SquareObject;

/**
 * Class that contains inner classes that implement the Runnable interface.
 * All inner classes should implement the Runnable interface and be designed as 
 * one specific action for the PhysicsEngine work queue.
 * @author Matthew Shea
 *
 */
public class PhysicsActions {

	public static class loadNewFrame implements Runnable {

		@Override
		public void run() {
			PhysicsEngine.getInstance().addtoQueue(new accelerateBus());
			PhysicsEngine.getInstance().addtoQueue(new moveBus());
			PhysicsEngine.getInstance().addtoQueue(new accelerateObject());
			PhysicsEngine.getInstance().addtoQueue(new updateObjectPosition());
			PhysicsEngine.getInstance().addtoQueue(new loadNewFrame());
			
		}
		
	}
	
	/**
	 * The bus itself should never move on the screen. 
	 * We will simulate movement by adjusting the position of the background.
	 * @author Matthew Shea
	 *
	 */
	public static class moveBus implements Runnable{

		@Override
		public void run() {
			// TODO Update the background or something to make things appear that they are moving
		}
		
	}
	
	
	/**
	 * Calculates the new speed for the bus based on the current speed and the acceleration.
	 * @author Matthew Shea
	 *
	 */
	public static class accelerateBus implements Runnable {

		@Override
		public void run() {
			// Retrieve Bus Object
			SquareObject busObject = (SquareObject) ObjectManager.getInstance().getObject("bus");
			
			// Update speed of the bus
			busObject.setSpeed(busObject.getSpeed() + busObject.getAcceleration() /* 1 Frame */);
			
			if(busObject.getAcceleration() > 0) {
				ObjectManager.getInstance().getObject("object").setSpeed(busObject.getSpeed());
			}
			// Commit changes
			busObject.commit();
		}
		
	}
	
	public static class accelerateObject implements Runnable {

		@Override
		public void run() {
			// Retrieve Object
			PhysicsObject object = ObjectManager.getInstance().getObject("object");
			
			// Update speed of object
			double opposingFrictionalForce = PhysicsFormulas.frictionalForce(null, object.getMass(), 0.125);
			double modifiedAcceleration = object.getAcceleration() - opposingFrictionalForce/object.getMass();
			object.setSpeed(object.getSpeed() + modifiedAcceleration);
			
			// Commit changes
			object.commit();
		}
		
	}
	
	public static class updateObjectPosition implements Runnable {

		@Override
		public void run() {
			PhysicsObject object = ObjectManager.getInstance().getObject("object");
			object.setXCoord(object.getXCoord() + object.getSpeed());
			object.commit();
			
		}
		
	}
}
