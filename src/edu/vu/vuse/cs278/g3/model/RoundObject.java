package edu.vu.vuse.cs278.g3.model;

import edu.vu.vuse.cs278.g3.gui.MainWindow;

public class RoundObject extends PhysicsObject {
	
	/** The radius of the circle object*/
	private double radius;
	private boolean restrained;
	RoundObject(int _array_num, double _xCoord, double _yCoord, double _radius, double mass) {
		super(_array_num, _xCoord, _yCoord, 0,0, mass);
		radius=_radius;
		restrained = false;
		//RoundObjects must be defined in nlogo file: "array [RoundObjects RoundObject]"
		MainWindow.getInstance().command("create-RoundObjects 1");			//create object at origin
		MainWindow.getInstance().command("ask RoundObject " + array_num + "[set shape \"circle\"]");
		commit(); //set position
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void updatePosition(double xcoord, double ycoord) {
		xCoord = xcoord;
		yCoord = ycoord;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setRestrained(boolean val){
		restrained = val;
		if (restrained) setShape("circle_belt");
		else setShape("circle");
	}
	
	public boolean isRestrained(){
		return restrained;
	}

	@Override
	public void commit() {
		MainWindow.getInstance().command("ask RoundObject " + array_num + " [set xcor " + xCoord + "]");	//move to desired location
		MainWindow.getInstance().command("ask RoundObject " + array_num + " [set ycor " + yCoord + "]");
		MainWindow.getInstance().command("ask RoundObject " + array_num + " [set size " + (radius*2) + "]"); //update obj size
	}

	@Override
	public void setShape(String shape) {
		MainWindow.getInstance().command("ask RoundObject " + array_num + " [set shape \"" + shape + "\"]");
	}	
}
