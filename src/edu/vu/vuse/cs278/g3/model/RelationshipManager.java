package edu.vu.vuse.cs278.g3.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Singleton object to manage the list of Relationships
 * @author Matthew Shea
 *
 */
public class RelationshipManager {

	/*
	 * Singleton Class
	 */
	private static RelationshipManager instance = null;
	
	/**
	 * Returns the singleton instance of this type
	 * @return Singleton instance
	 */
	public static RelationshipManager getInstance() {
		if(instance == null)
			instance = new RelationshipManager();
		return instance;
	}
	private RelationshipManager() {}
	
}
