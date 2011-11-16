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
}
