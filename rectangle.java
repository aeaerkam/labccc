public class Rectangle extends Shape implements Selectable
{
	protected int width;
	protected int length;
	protected boolean select;
	
	//CONSTRUCTOR
	public Rectangle (int width, int length)
	{
		this.width = width;
		this.length = length;
		x = 0;
		y = 0;
		select = false;
	}
	
	//METHOD TO GET AREA (OVERRIDDEN)
	public double getArea()
	{
		return width * length;
	}
	
	//toString()
	public String toString()
	{
		if(getSelected())
			return "A 'selected' rectangle with width " + width + " and length " + length + ", and area " + getArea();
		else
			return "A 'not selected' rectangle with width " + width + " and length " + length + ", and area " + getArea();
		
	}
	
	//SETS THE CENTER OF MASS OF THE RECTANGLE (OVERRIDDEN)
	public void setLocation(int a, int b)
	{
		x = a;
		y = b;
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
	
	//DETERMINES THE LOCATION IS INSIDE THE RECTANGLE (OVERRIDDEN)
	public Shape contains(int a, int b)
	{
		//Checks if the given poit is squeezed between four sides. If it is, returns the shape
		if (a >= this.getX() - (width / 2) && a <= this.getX() + (length / 2)&& b <= this.getY() + (width / 2) && b >= this.getY() - (width / 2))
		{
			return this;
		}
		else
		{
			return null;
		}
	}
}
