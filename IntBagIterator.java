
/**
 * @(#)Lab03b.java
 *
 * Lab03b application: Implements Iterator and contains required methods for TestIterators class
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/18
 */
 
import java.util.Iterator;
public class IntBagIterator implements Iterator 
{
	// VARIABLES
	IntBag bag;
	int index;
	
	// CONSTRUCTOR
	public IntBagIterator( IntBag bag)
    {
		this.bag = bag;
		index = 0;
	}

	// method simply determines whether the index value is less than the number of elements in the set or not to check whether there exists a next item.
	public boolean hasNext() 
	{
		if( bag.size() > index)
			return true;
		return false;
	}

	// Returns the next object(Integer type) in the IntBag
	public Object next() 
	{
		// to be able to look for the next integer in the IntBag 'bag' incr. index by one
		index++; 
		return bag.get(index - 1);
	}
	
	
	public void remove() 
	{
		bag.remove(--index);	
	}
}