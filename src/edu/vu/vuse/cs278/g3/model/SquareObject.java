package edu.vu.vuse.cs278.g3.model;

import edu.vu.vuse.cs278.g3.gui.MainWindow;

public class SquareObject extends PhysicsObject {

	SquareObject(int _array_num, double _xCoord, double _yCoord, double _width, double _height, double mass)
	{
		super(_array_num, _xCoord, _yCoord, 0,0, mass);
		array_num = _array_num;
		width=_width;
		height=_height;

		//SquareObjects must be defined in nlogo file: "array [SquareObjects SquareObject]"
		MainWindow.getInstance().command("create-SquareObjects 1");			//create object at origin
		commit(); //set location
	}
	
	public double getXCoord() {
		return xCoord;
	}

	public double getYCoord() {
		return yCoord;
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	final private int array_num; //number that this object is accessed by in netlogo
	private double width, height;
	
	@Override
	public void commit() {
		MainWindow.getInstance().command("ask SquareObject " + array_num + " [set xcor " + xCoord + "]");	//move to desired location
		MainWindow.getInstance().command("ask SquareObject " + array_num + " [set ycor " + yCoord + "]");
	}

	@Override
	public void setShape(String shape) {
		MainWindow.getInstance().command("ask SquareObject " + array_num + " [set shape " + shape + "]");
	}	
	
	public void updatePosition(double xcoord, double ycoord) {
		xCoord = xcoord;
		yCoord = ycoord;
	}
}
