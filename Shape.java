/**
 * @(#)Lab03a.java
 *
 * Lab03a application: An abstract class in the top of the hyerarchy
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/12
 */
 
public abstract class Shape implements Locatable
{
	protected int x;
	protected int y;
	
	abstract double getArea();
	
	public void setLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}	
	public int getY()
	{
		return y;
	}
	
}