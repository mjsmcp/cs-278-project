package edu.vu.vuse.cs278.g3.model;


import org.nlogo.api.CompilerException;
import org.nlogo.app.App;

public class RoundObject extends PhysicsObject {
	
	/*
	 * Member Elements
	 */
	
	
	RoundObject(int _array_num, double _xCoord, double _yCoord, double _radius) {
		super(_xCoord, _yCoord, 0,0);
		radius=_radius;
		array_num = _array_num;
		
		try { 
			//RoundObjects must be defined in nlogo file: "array [RoundObjects RoundObject]"
			App.app.command("create-RoundObjects 1");			//create object at origin
			App.app.command("ask RoundObject " + array_num + "[set shape \"circle\"]");
		} catch (CompilerException e) {
			e.printStackTrace();
		}
		commit(); //set position
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void updatePosition(double xcoord, double ycoord) {
		xCoord = xcoord;
		yCoord = ycoord;
	}
	
	final private int array_num; 
	private double radius;
	private double xCoord, yCoord;
	@Override
	public void commit() {
		try {
			App.app.command("ask RoundObject " + array_num + " [set xcor " + xCoord + "]");	//move to desired location
			App.app.command("ask RoundObject " + array_num + " [set ycor " + yCoord + "]");
			App.app.command("ask RoundObject " + array_num + " [set size " + (radius*2) + "]"); //update obj size
		} catch (CompilerException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setShape(String shape) {
		try {
			App.app.command("ask RoundObject " + array_num + " [set shape " + shape + "]");
		} catch (CompilerException e) {
			e.printStackTrace();
		}		
	}	
}
