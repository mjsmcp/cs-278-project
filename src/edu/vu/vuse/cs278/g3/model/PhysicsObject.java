package edu.vu.vuse.cs278.g3.model;

public interface PhysicsObject {
	//Object(){}
	abstract double getXCoord();
	abstract double getYCoord();
	abstract void updatePosition(double xcoord, double ycoord);
}

