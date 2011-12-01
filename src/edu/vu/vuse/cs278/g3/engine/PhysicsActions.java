package edu.vu.vuse.cs278.g3.engine;

import edu.vu.vuse.cs278.g3.model.ObjectManager;
import edu.vu.vuse.cs278.g3.model.SquareObject;

/**
 * Class that contains inner classes that implement the Runnable interface.
 * All inner classes should implement the Runnable interface and be designed as 
 * one specific action for the PhysicsEngine work queue.
 * @author Matthew Shea
 *
 */
public class PhysicsActions {

	/**
	 * The bus itself should never move on the screen. 
	 * We will simulate movement by adjusting the position of the background.
	 * @author Matthew Shea
	 *
	 */
	public class moveBus implements Runnable{

		@Override
		public void run() {
			SquareObject busObject = (SquareObject) ObjectManager.getInstance().getObject("bus");
			busObject.setSpeed(busObject.getAcceleration() + busObject.getSpeed());
			busObject.setXCoord(busObject.getSpeed() + busObject.getXCoord());
			busObject.commit();
		}
		
	}
	
	
	/**
	 * Calculates the new speed for the bus based on the current speed and the acceleration.
	 * @author Matthew Shea
	 *
	 */
	public class accelerateBus implements Runnable {

		@Override
		public void run() {
			SquareObject busObject = (SquareObject) ObjectManager.getInstance().getObject("bus");
			busObject.setAcceleration(busObject.getAcceleration() + 1);
			
			
		}
		
	}
	
	/**
	 * Slows the bus based on the current speed and acceleration.
	 * @author syddraf
	 *
	 */
	public class deccelerateBus implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
