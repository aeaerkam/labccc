
/**
 * @(#)Lab03b.java
 *
 * Lab03b application: tests IntBagIterator class
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/12
 */
 
import java.util.Iterator;
 
public class TestIterators 
{
    public static void main( String[] args) 
	{
		// VARIABLES
		Iterator i, j; 
		IntBag bag;
		
		// PROGRAM CODE
		bag = new IntBag();
		
		for( int k = 0; k < 10; k++)
		{
			bag.add(k);
		}
			
		i = new IntBagIterator( bag);
		

		while ( i.hasNext() ) 
		{
			System.out.println( i.next() );
	
			 //j = new IntBagIterator( bag);
			 j = bag.iterator();
	
			while ( j.hasNext() )
			{
				System.out.println( "--" + j.next() );
			}
		}
	}
	
}