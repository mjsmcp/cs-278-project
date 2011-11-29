package edu.vu.vuse.cs278.g3.model;

import java.util.HashMap;
import java.util.Map;

public class ObjectManager {

	/*
	 * Singleton Class
	 */
	private static ObjectManager instance = null;
	public static ObjectManager getInstance() {
		if(instance == null)
			instance = new ObjectManager();
		return instance;
	}
	
	private ObjectManager() {}
	
	
	/*
	 * Member Elements
	 */
	private Map<String, PhysicsObject> objects = new HashMap<String, PhysicsObject>();
	private int obj_count = 0;
	
	/*
	 * Methods
	 */
	public PhysicsObject getObject(String id) {
		return this.objects.get(id);
	}
	
	public boolean addObject(String id, PhysicsObject object) {
		if(this.objects.containsKey(id))
			return false;
		else
			this.objects.put(id, object);
		return true;
	}
	
	public void removeObject(String id) {
		this.objects.remove(id);
	}
	
	public SquareObject createSquare(double _xCoord, double _yCoord, int _width, int _height){
		return new SquareObject(obj_count++, _xCoord, _yCoord, _width, _height);
	}
	
	public RoundObject createCircle(double _xCoord, double _yCoord, int _radius){
		return new RoundObject(obj_count++, _xCoord, _yCoord, _radius);
	}
	
}
