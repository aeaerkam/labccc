/**
 * @(#)Lab03a.java
 *
 * Lab03a application: tests the hyerarchy of all classes
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/12
 */
import java.util.Scanner;

public class ShapeTester
{
	public static void main (String[] args) 
	{
		
		// VARIABLES
		Scanner scan = new Scanner(System.in);
		ShapeContainer shapes; 
		int choice;
		int totalArea;
		int x, y;
		
		shapes = new ShapeContainer();
		
		do
		{
			System.out.println();
			System.out.println("(1) Create an empty set of shapes");
			System.out.println("(2) Add a circle");
			System.out.println("(3) Add a rectangle");
			System.out.println("(4) Compute & print out the total surface area of the entire set of shapes");
			System.out.println("(5) Print out the information about all shapes in the container");
			System.out.println("(6) Select a shape if entered (x,y) in any shape");
			System.out.println("(7) Remove all selected shapes from the set of  shapes");
			System.out.println("(8) Quit");
			System.out.print("Please enter your choice: ");
			
			choice = scan.nextInt();
			
			if(choice == 1)
			{
				shapes = new ShapeContainer();
			}
			
			else if(choice == 2)
			{
				System.out.print("Please enter the radius of the circle you wish to add: ");
				shapes.add(new Circle(scan.nextInt()));
			}
			
			else if(choice == 3)
			{
				System.out.print("Please enter the width and the length of the rectangle you wish to add(width length): ");
				shapes.add(new Rectangle(scan.nextInt(), scan.nextInt()));
			}
			
			else if(choice == 4)
			{
				System.out.println("The total surface area of the entire set of shapes is " + shapes.getArea() );			
			}
			
			else if(choice == 5)
			{
				System.out.println(shapes.toString());
			}
			
			else if ( choice == 6) 
			{
				System.out.print( "Enter the X loc: ");
				x = scan.nextInt();
				System.out.print( "Enter the Y loc: ");
				y = scan.nextInt();
						
				shapes.select( x, y);
			}
			
			else if ( choice == 7 ) 
			{
				shapes.removeAllSelected();
			}
			
							
			
		}while(choice !=  8);	 	
	}
	
}