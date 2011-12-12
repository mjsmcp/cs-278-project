package edu.vu.vuse.cs278.g3.model;

import edu.vu.vuse.cs278.g3.gui.MainWindow;
public class BusObject extends PhysicsObject{

	final static int MINXCOR = -125, MAXXCOR = 800;
	
	/** The length if the bus object*/
	private double length;
	
	BusObject(int _array_num, double _xCoord, double _yCoord, double _length, double mass) {
		super(_array_num, _xCoord, _yCoord, 0,0, mass);
		length=_length;
		
	
		//RoundObjects must be defined in nlogo file: "array [RoundObjects RoundObject]"
		MainWindow.getInstance().command("create-BusObjects 1");			//create object at origin
			
		setShape("bus");
		commit(); //set position
	}
	
	public double getLength() {
		return length;
	}
	
	public void updatePosition(double xcoord, double ycoord) {
		xCoord = xcoord;
		yCoord = ycoord;
	}
	
	public void moveForward(double amt){
		SquareObject tree = (SquareObject) ObjectManager.getInstance().getObject("tree");
		
		double newx = tree.getXCoord()-amt;
		if (newx < MINXCOR){
			newx = MAXXCOR - (MINXCOR - newx);
		}
			
		tree.updatePosition(newx, tree.getYCoord());
		tree.commit();
	}
	
	@Override
	public void commit() {
		MainWindow.getInstance().command("ask BusObject " + array_num + " [set xcor " + xCoord + "]");	//move to desired location
		MainWindow.getInstance().command("ask BusObject " + array_num + " [set ycor " + yCoord + "]");
		MainWindow.getInstance().command("ask BusObject " + array_num + " [set size " + length + "]"); //update obj size
	}

	@Override
	public void setShape(String shape) {
		MainWindow.getInstance().command("ask BusObject " + array_num + " [set shape \"" + shape + "\"]");
	}	
}
