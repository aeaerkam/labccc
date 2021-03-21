/**
 * @(#)Lab03a.java
 *
 * Lab03a application: repr. squares
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/12
 */
 

public class Square extends Rectangle implements Selectable
{
	// VARIABLES
	private int side;
	
	//CONSTRUCTOR
	public Square (int side)
	{
		super(side, side);
		this.side = side;
	}
	
	//METHOD TO GET AREA (OVERRIDDEN)
	public double getArea()
	{
		return side * side;
	}
	
	// toString()
	public String toString()
	{
		if(getSelected())
			return "A 'selected' square with side length " + side + ", and area " + getArea();
			
		else
			return "'Not selected' square with side length " + side + ", and area " + getArea();  	
	}
	
	
	//RETURNS THE SELECTED STATE OF SHAPE (OVERRIDDEN)
	public boolean getSelected()
	{
		return super.getSelected();
	}
	
	//SETS THE SELECTED STATE OF SHAPE (OVERRIDDEN)
	public void setSelected(boolean choice)
	{
		select = choice;
	}
	
	//DETERMINES THE LOCATION IS INSIDE THE SQUARE (OVERRIDDEN)
	public Shape contains(int a, int b)
	{
		//Checks if the given poit is squeezed between four sides. If it is, returns the shape
		if (a >= this.getX() - (width / 2) && a <= this.getX() + (length / 2) && b <= this.getY() + (width / 2) && b >= this.getY() - (width / 2))
		{
			return this;
		}
		
		else
		{
			return null;
		}
	}		 
}