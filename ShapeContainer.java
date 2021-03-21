/**
 * @(#)Lab03a.java
 *
 * Lab03a application: Manages a set of Shape object's sub classes 
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/12
 */

import java.util.ArrayList;

public class ShapeContainer  
{
	private ArrayList<Shape> shapes;
	
	public ShapeContainer()
	{
		shapes = new ArrayList<Shape>();
	}	
	
	public void add( Shape s)
	{
		shapes.add(s);
	}
	
	//CALCULATES AND RETURNS TOTAL AREA OF SHAPES IN THE COLLECTION
	public double getArea()
	{
		double totalArea = 0;
		
		for(int i = 0; i < shapes.size(); i++)
		{
			totalArea += shapes.get(i).getArea();
		}
		
		return totalArea;	 
	}
	
	public void select ( int x, int y) 
	{
		Shape temp = null;
		
		for ( int  i = 0; temp == null && i < shapes.size(); i++) 
		{
			temp = ((Selectable) shapes.get(i)).contains( x, y);
		}
		
		if ( temp != null)
			((Selectable)temp).setSelected ( !( ((Selectable) temp).getSelected() ) ) ;
		
		if ( temp == null)
			System.out.println( "Not found any shape");
		else
			System.out.println( temp.toString());
	}	
	
		
	// Returns the string repr. of the shape container
	public String toString()
	{
		String shapeInf;
		shapeInf = "\nThe all shapes in the container\n";
		
		if(shapes.size() == 0)
			System.out.println("NO SHAPE");
		
		for(int i = 0; i < shapes.size(); i++)
		{
			shapeInf += "[" + i + "]" + shapes.get(i) + "\n";
		}
			 
		return shapeInf;
	}
	
	// returns the Arraylist of shapes
	public ArrayList<Shape> getSet()
	{
		return shapes;
	}
	
	public void removeAllSelected() 
	{
		for ( int i = 0; i < shapes.size(); i++) 
		{
			if ( ( (Selectable) shapes.get(i) ).getSelected() ) 
			{
				System.out.println( "Removed items are: \n" + shapes.get(i) );
				shapes.remove(i);
			}	
		}
	}
	
	
	
			
}

