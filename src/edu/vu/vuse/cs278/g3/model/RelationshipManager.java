package edu.vu.vuse.cs278.g3.model;

import java.util.LinkedList;
import java.util.List;

public class RelationshipManager {

	/*
	 * Singleton Class
	 */
	private static RelationshipManager instance = null;
	public static RelationshipManager getInstance() {
		if(instance == null)
			instance = new RelationshipManager();
		return instance;
	}
	private RelationshipManager() {}
	
	
	/*
	 * Member Elements
	 */
	
	/*
	 * Methods
	 */

}
