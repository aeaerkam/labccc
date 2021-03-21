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
