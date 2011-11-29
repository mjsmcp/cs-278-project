package edu.vu.vuse.cs278.g3.model;


import org.nlogo.api.CompilerException;
import org.nlogo.app.App;

public class RoundObject extends PhysicsObject {
	
	/*
	 * Member Elements
	 */
	
	
	public RoundObject(int _array_num, double _xCoord, double _yCoord, int _radius) {
		super(_xCoord, _yCoord, 0,0);
		radius=_radius;

		
		try { 
			//RoundObjects must be defined in nlogo file: "array [RoundObjects RoundObject]"
			App.app.command("create-RoundObjects 1");			//create object at origin
		} catch (CompilerException e) {
			e.printStackTrace();
		}
		commit(); //set position
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void updatePosition(double xcoord, double ycoord) {
		xCoord = xcoord;
		yCoord = ycoord;
	}
	
	private	int array_num; 
	private int radius;
	private double xCoord, yCoord;
	@Override
	public void commit() {
		try {
			App.app.command("ask RoundObject " + array_num + " [set xcor " + (int)xCoord + "]");	//move to desired location
			App.app.command("ask RoundObject " + array_num + " [set ycor " + (int)yCoord + "]");
		} catch (CompilerException e) {
			e.printStackTrace();
		}
	}	
}
