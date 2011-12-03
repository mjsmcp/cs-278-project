package edu.vu.vuse.cs278.g3.model;

import org.nlogo.api.CompilerException;
import org.nlogo.app.App;

public class BusObject extends PhysicsObject{

	/** The length if the bus object*/
	private double length;
	
	BusObject(int _array_num, double _xCoord, double _yCoord, double _length, double mass) {
		super(_array_num, _xCoord, _yCoord, 0,0, mass);
		length=_length;
		
		
		try { 
			//RoundObjects must be defined in nlogo file: "array [RoundObjects RoundObject]"
			App.app.command("create-BusObjects 1");			//create object at origin
			App.app.command("ask BusObject " + array_num + "[set shape \"circle\"]");
		} catch (CompilerException e) {
			e.printStackTrace();
		}
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
	
	
	@Override
	public void commit() {
		try {
			App.app.command("ask BusObject " + array_num + " [set xcor " + xCoord + "]");	//move to desired location
			App.app.command("ask BusObject " + array_num + " [set ycor " + yCoord + "]");
			App.app.command("ask BusObject " + array_num + " [set size " + length + "]"); //update obj size
		} catch (CompilerException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setShape(String shape) {
		try {
			App.app.command("ask BusObject " + array_num + " [set shape " + shape + "]");
		} catch (CompilerException e) {
			e.printStackTrace();
		}		
	}	
}
