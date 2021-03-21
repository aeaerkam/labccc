/**
 * @(#)Lab03a.java
 *
 * Lab03a application: repr. circles
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/12
 */
 
public class Circle extends Shape implements Selectable
{
	//PROPERTIES
	private int radius;
	private boolean select;
	
	//CONSTRUCTOR
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	//METHOD TO GET AREA (OVERRIDDEN)
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public String toString()
	{
		if(getSelected())
			return "A 'selected' circle with radius " + radius + ", and area " + getArea();
		else
			return "A 'not selected' circle with radius " + radius + ", and area " + getArea();
	}
	
	
	//RETURNS THE SELECTED SITIATION OF SHAPE (OVERRIDDEN)
	public boolean getSelected()
	{
		return select;
	}
	
	//SETS THE SELECTED SITUATION OF SHAPE (OVERRIDDEN)
	public void setSelected(boolean select)
	{
		this.select = select;
	}
	
	//DETERMINES THE LOCATION INSIDE BY USING THE FORMULA (x^2 - a) + (y^2 - b) < r^2 (OVERRIDDEN)
	public Shape contains(int a, int b)
	{
		if (Math.pow((this.getX() - a), 2) + Math.pow((this.getY() - b), 2) <= Math.pow (this.radius, 2))
			return this;
		else
			return null;
	}			
}