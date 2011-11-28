package edu.vu.vuse.cs278.g3.model;


import org.nlogo.api.CompilerException;
import org.nlogo.app.App;

public class RoundObject implements PhysicsObject {

	public RoundObject(int _array_num, double _xCoord, double _yCoord, int _radius)
	{
		array_num = _array_num;
		radius=_radius;
		xCoord=_xCoord;
		yCoord=_yCoord;
		
		try { 
			//RoundObjects must be defined in nlogo file: "array [RoundObjects RoundObject]"
			App.app.command("create-RoundObjects 1");			//create object at origin
		} catch (CompilerException e) {
			e.printStackTrace();
		}
		commitChanges(); //set position
	}
	
	public double getXCoord() {
		return xCoord;
	}

	public double getYCoord() {
		return yCoord;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void commitChanges(){
		try {
			App.app.command("ask RoundObject " + array_num + " [set xcor " + (int)xCoord + "]");	//move to desired location
			App.app.command("ask RoundObject " + array_num + " [set ycor " + (int)yCoord + "]");
		} catch (CompilerException e) {
			e.printStackTrace();
		}
	}
	public void updatePosition(double xcoord, double ycoord) {
		xCoord = xcoord;
		yCoord = ycoord;
	}
	
	private	int array_num; 
	private int radius;
	private double xCoord, yCoord;	
}
