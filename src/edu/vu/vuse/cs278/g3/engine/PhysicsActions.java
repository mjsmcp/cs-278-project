package edu.vu.vuse.cs278.g3.engine;

import edu.vu.vuse.cs278.g3.model.ObjectManager;
import edu.vu.vuse.cs278.g3.model.SquareObject;

public class PhysicsActions {

	/**
	 * The bus itself should never move on the screen. 
	 * We will simulate movement by adjusting the position of the background.
	 * @author syddraf
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
	
	public class accelerateBus implements Runnable {

		@Override
		public void run() {
			SquareObject busObject = (SquareObject) ObjectManager.getInstance().getObject("bus");
			busObject.setAcceleration(busObject.getAcceleration() + 1);
			
			
		}
		
	}
}
