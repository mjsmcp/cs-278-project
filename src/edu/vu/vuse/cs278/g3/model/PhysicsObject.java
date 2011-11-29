package edu.vu.vuse.cs278.g3.model;


public abstract class PhysicsObject {
	
	protected double xCoord = 0;
	protected double yCoord = 0;
	
	/** In Pixels/Frame */
	protected double speed = 0;
	
	/** In Pixels/Frame^2	 */
	protected double acceleration = 0;
	
	
	protected PhysicsObject(double xcoord, double ycoord, double speed, double acceleration) {
		this.xCoord = xcoord;
		this.yCoord = ycoord;
		this.speed = speed;
		this.acceleration = acceleration;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(double iSpeed) {
		this.speed = iSpeed;
	}
	
	public double getAcceleration() {
		return this.acceleration;
	}
	
	public void setAcceleration(double acc) {
		this.acceleration = acc;
	}
	
	public double getXCoord() {
		return this.xCoord;
	}
	
	public double getYCoord() {
		return this.yCoord;
	}
	
	public void setYCoord(double ycoord) {
		this.yCoord = ycoord;
	}
	
	public void setXCoord(double xcoord) {
		this.xCoord = xcoord;
	}
	
	/**
	 * Commits the changes to the NetLogo backend to update the graphical display.
	 * You do not need to call this function unless the POSITION has changed.
	 */
	public abstract void commit();
	public void updatePosition(double xcoord, double ycoord) {
		this.xCoord = xcoord;
		this.yCoord = ycoord;
	}

}

