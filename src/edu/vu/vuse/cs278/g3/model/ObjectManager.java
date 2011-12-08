package edu.vu.vuse.cs278.g3.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The ObjectManager serves to manage all objects involved in the model. 
 * It's two primary functions are maintaining a map of all objects involved
 * in the model and facilitating the creation of the objects.
 * @author Matthew Shea
 *
 */
public class ObjectManager {

	/** Instance object of the singleton ObjectManager */
	private static ObjectManager instance = null;
	
	/**
	 * Returns the singleton instance of the ObjectManager.
	 * @return Singleton instance of the ObjectManager
	 */
	public static ObjectManager getInstance() {
		if(instance == null)
			instance = new ObjectManager();
		return instance;
	}
	
	/**
	 * Private constructor for use with the singleton pattern
	 */
	private ObjectManager() {}
	
	
	/** Object that maps between a string identifier and a reference to a PhysicsObject */
	private Map<String, PhysicsObject> objects = new HashMap<String, PhysicsObject>();
	
	/** Keeps track of the number of objects for use in interfacing with netlogo */
	private int obj_count = 0;
	
	/**
	 * Returns the reference to the object associated with the id
	 * @param id identifier of the object
	 * @return The reference to the object or null if the object is not found.
	 */
	public PhysicsObject getObject(String id) {
		return this.objects.get(id);
	}

	/**
	 * Replaces the specified key with the new object.
	 * @param id Identifier
	 * @param obj New Object
	 */
	public void updateObject(String id, PhysicsObject obj) {
		this.objects.put(id, obj);
	}
	/**
	 * Adds an object to the manager with the specified id.
	 * @param id the UNIQUE identifier of the object
	 * @param object The object reference
	 * @return True if the object was successfully added and False if it already exists.
	 */
	public boolean addObject(String id, PhysicsObject object) {
		if(this.objects.containsKey(id))
			return false;
		else
			this.objects.put(id, object);
		return true;
	}
	
	
	/**
	 * Remove the object associated with the specified unique id.
	 * @param id Unique ID of the object to remove.
	 */
	public void removeObject(String id) {
		this.objects.remove(id);
	}
	
	/**
	 * Creates a SquareObject with the specified parameters and returns the reference.
	 * @param _xCoord The x position of the square
	 * @param _yCoord The y position of the square
	 * @param _width The width of the object
	 * @param _height The height of the object
	 * @return Object reference
	 */
	public SquareObject createSquare(double _xCoord, double _yCoord, double _width, double _height, double mass){
		return new SquareObject(obj_count++, _xCoord, _yCoord, _width, _height, mass);
	}
	
	/**
	 * Creates a RoundObject with the specified parameters and returns the reference.
	 * @param _xCoord The x position of the circle
	 * @param _yCoord The y position of the circle
	 * @param _radius The radius of the circle
	 * @return Object reference
	 */
	public RoundObject createCircle(double _xCoord, double _yCoord, double _radius, double mass){
		return new RoundObject(obj_count++, _xCoord, _yCoord, _radius, mass);
	}
	
	/**
	 * Creates a BusObject with the specified parameters and returns the reference.
	 * @param _xCoord The x position of the bus
	 * @param _yCoord The y position of the bus
	 * @param _length The length of the bus
	 * @return Object reference
	 */
	public BusObject createBus(double _xCoord, double _yCoord, double _length, double mass){
		return new BusObject(obj_count++, _xCoord, _yCoord, _length, mass);
	}
	
}
