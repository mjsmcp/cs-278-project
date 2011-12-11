package edu.vu.vuse.cs278.g3.model;


public abstract class PhysicsObject {
	
	/** The x coordinate on the Netlogo display of the object */
	protected double xCoord = 0;
	
	/** The y coordinate on the Netlogo display of the object */
	protected double yCoord = 0;
	
	/** The speed of the object, measured in pixels per frame */
	protected double speed = 0;
	
	/** The acceleration of the object, measured in pixels per frame per frame */
	protected double acceleration = 0;
	
	/** The deceleration of the object, measured in pixels per frame per frame */
	protected double deceleration = 0;
	
	/** The mass of the object in kg */
	protected double mass = 0;
	
	/** The number in the array of the Netlogo object*/
	protected int array_num = 0;
	
	/**
	 * Creates a PhysicsObject with the specified parameters.
	 * @param arrayNum The number in the Netlogo array
	 * @param xcoord The xcoord in the Netlogo display
	 * @param ycoord The ycoord in the Netlogo display
	 * @param speed The speed of the object. Positive indicates rightward motion.
	 * @param acceleration The acceleration of the object.
	 * @param mass The mass of the object.
	 */
	protected PhysicsObject(int arrayNum, double xcoord, double ycoord, double speed, double acceleration, double mass) {
		this.array_num = arrayNum;
		this.xCoord = xcoord;
		this.yCoord = ycoord;
		this.speed = speed;
		this.acceleration = acceleration;
		this.mass = mass;
	}
	
	/**
	 * Returns the speed of the object
	 * @return The object's speed
	 */
	public double getSpeed() {
		return this.speed;
	}
	
	/**
	 * Sets the speed of the object.
	 * @param iSpeed The speed in pixels/frame
	 */
	public void setSpeed(double iSpeed) {
		this.speed = iSpeed;
	}
	
	
	/**
	 * Returns the acceleration of the object
	 * @return The object's acceleration
	 */
	public double getAcceleration() {
		return this.acceleration;
	}
	
	/**
	 * Set's the object's acceleration
	 * @param acc A double indicating the acceleration of the object.
	 */
	public void setAcceleration(double acc) {
		this.acceleration = acc;
	}
	
	public void setDecleration(double dec) { this.deceleration = dec; };
	public double getDeceleration() { return this.deceleration; }
	/**
	 * Returns the x coordinate of the object
	 * @return The object's X coordinate
	 */
	public double getXCoord() {
		return this.xCoord;
	}
	
	/**
	 * Returns the y coordinate of the object
	 * @return The object's Y coordinate
	 */
	public double getYCoord() {
		return this.yCoord;
	}
	
	/**
	 * Sets the y coordinate of the object
	 * @param ycoord y coordinate in pixels
	 */
	public void setYCoord(double ycoord) {
		this.yCoord = ycoord;
	}
	
	/**
	 * Sets the x coordinate of the object
	 * @param xcoord x coordinate in pixels
	 */
	public void setXCoord(double xcoord) {
		this.xCoord = xcoord;
	}
	
	/**
	 * Returns the mass of the object
	 * @return The object's mass
	 */
	public double getMass() {
		return this.mass;
	}
	
	/**
	 * Sets the mass of the object
	 * @param mass The new mass of the object
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	/**
	 * Immediately changes the object's shape. Must exist in netlogo shapes library.
	 * @param shape
	 */
	public abstract void setShape(String shape);
	
	/**
	 * Commits the changes to the NetLogo backend to update the graphical display.
	 * You do not need to call this function unless the POSITION has changed.
	 */
	public abstract void commit();
	
	/**
	 * Updates the position with the specified xcoords and ycoords
	 * @param xcoord
	 * @param ycoord
	 */
	public void updatePosition(double xcoord, double ycoord) {
		this.xCoord = xcoord;
		this.yCoord = ycoord;
	}

}

