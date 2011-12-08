package edu.vu.vuse.cs278.g3.model;

import java.util.HashMap;
import java.util.Map;

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
	
	/** Map relating the string code to the relationshiptype between two objects */
	private Map<String, RelationshipTypes> relationshipMap = new HashMap<String, RelationshipTypes>();
	
	/**
	 * This function fetches a relationship between two objects. The order of the objects
	 * is important. For example, getRelationship("a", "b") is not the same as
	 * getRelationship("b", "a")
	 * @param object1 The string id of the first object
	 * @param object2 The string id of the second object
	 * @return The relationshipType, if available, or NO_RELATIONSHIP if not.
	 */
	public RelationshipTypes getRelationship(String object1, String object2) {
		RelationshipTypes i = this.relationshipMap.get(object1+object2);
		if(i == null)
			return RelationshipTypes.NO_RELATIONSHIP;
		else
			return i;
	}
	
	/**
	 * This function sets a relationship between two objects. The order of the objects
	 * is important. For example, getRelationship("a", "b") is not the same as
	 * getRelationship("b", "a")
	 * @param object1 The string id of the first object
	 * @param object2 The string id of the second object
	 * @param type The RelationshipType to define
	 */
	public void setRelationship(String object1, String object2, RelationshipTypes type) {
		this.relationshipMap.put(object1+object2, type);
	}
}
