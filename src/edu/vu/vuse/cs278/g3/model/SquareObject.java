package edu.vu.vuse.cs278.g3.model;
import org.nlogo.api.CompilerException;
import org.nlogo.app.App;

public class SquareObject extends PhysicsObject {

	public SquareObject(int _array_num, double _xCoord, double _yCoord, int _width, int _height)
	{
		super(_xCoord, _yCoord, 0,0);
		array_num = _array_num;
		width=_width;
		height=_height;

		
		try {
			//SquareObjects must be defined in nlogo file: "array [SquareObjects SquareObject]"
			App.app.command("create-SquareObjects 1");			//create object at origin
		} catch (CompilerException e) {
			e.printStackTrace();
		}
		commit(); //set location
	}
	
	public double getXCoord() {
		return xCoord;
	}

	public double getYCoord() {
		return yCoord;
	}
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	private int array_num; //number that this object is accessed by in netlogo
	private int width, height;

	
	@Override
	public void commit() {
		try {
			App.app.command("ask SquareObject " + array_num + " [set xcor " + (int)xCoord + "]");	//move to desired location
			App.app.command("ask SquareObject " + array_num + " [set ycor " + (int)yCoord + "]");
		} catch (CompilerException e) {
			e.printStackTrace();
		}		
	}

	
	public void updatePosition(double xcoord, double ycoord) {
		xCoord = xcoord;
		yCoord = ycoord;
	}
	

}
