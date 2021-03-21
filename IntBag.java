/**
 * @(#)IntBag.java
 *
 * IntBag class: Represents a collection of integers in a partially-filled array with the valid size 'valid'.
 *
 * @author: Abdullah Erkam Arslan 
 * @version 1.00 2014/2/18
 */

import java.util.Iterator;

public class IntBag 
{
	// Variables
	final static int DEFAULT_SIZE = 100;
	private int valid;
	private int[] bag;
	
	// Constructors
	public IntBag()
	{
		bag = new int[DEFAULT_SIZE];
		valid = 0; 
	}
	
	public IntBag(int maxElementNum)
	{
		bag = new int[maxElementNum];
		valid = 0;
	}
	
	// add( int valueToAdd) to add a value to the end of the collection
	public boolean add( int valueToAdd)
    {
    	//Since no space is available, can't add.
		if ( valid >= bag.length)
		{
			System.out.println("Error! Can't add. There is no space availible in the IntBag.");
			return false;
		}	
					
		bag[valid] = valueToAdd;
   		valid++;
		return true;
    }
    
    // to add a value at a particular index location i within it (moving other values "up" to make room and checking i is within bounds)
    public boolean add(int valueToAdd, int i)
    {
    	//Since no space is available, can't add.
    	if(valid >= bag.length)
    	{
    		System.out.println("Error! There is no space availible in the IntBag.");
    		return false;
    	}
    		
    	
    	// Can't add to the invalid part of the array
    	else if(i > valid)
    	{
    		System.out.println("Error! Can't add to the invalid part!");
    		return false;
    	} 
    		
    	
    	// Shift the elements up, do this to the index 'i';	
    	for(int j = valid - 1; j >= i; j--)
    		bag[j + 1] = bag[j];
    		
    	bag[i] = valueToAdd;
    	valid++;
    	System.out.println("Process completed!");
    	return true;	
    			
    }
    
    // remove(int index) to remove the value at a given index (moving other values back "down" the array)
    public void remove(int index)
    {
    	if(index >= valid)
    	{
    		System.out.println("Error! Can't remove from the invalid part!");
    	}	
    	
    	else
    	{
    		for( int i = index; i < valid - 1; i++)
	    		bag[i] = bag[i + 1];
	    	
	    	valid--;
	    	System.out.println("Process completed!");		

    	}	
	    		 
    }	
    
    // contains(int i) to test whether the collection contains a given value or not 
    public boolean contains(int i)
    {
    	for(int j = 0; j < valid; j++)
    		if(bag[j] == i)
    			return true;
    	
    	return false;			  
    }
    	
    // size() method to return the valid size of the bag array  
    public int size()
    {
    	return valid;
    }
    
    // get(int i): returns the value at a given index. If the index is not valid gives ArrayOutOfBounds exception.
    public int get(int i)
    {
    	if(i >= valid)
    	{
    		// gives ArrayOutOfBounds exception if user tries to get an element which is at an invalid index(more than valid). 
    		int[] bag2 = new int[valid];
    		return bag2[i];
    	}
    	
    	else
    	{
    		return bag[i];
    	} 	
    		
    }	
    
    // toString(): Returns the string repr. of the instance of the IntBag class
    public String toString()
    {	
    	String s;
    	
    	s = "[ ";
    	for(int i = 0; i < valid; i++)
    		s = s + bag[i] + " ";
    	s = s + "]"; 
    			
    	return s;
    }
    
    // findAll method : returns the locations (indexes) of all instances of a given value in the collection as an array of integers.
    public int[] findAll (int numberToLocate)
    {
    	// variables
    	int count;
    	int[] locations;
    	int j;
    	
    	count = 0; 
    	j = 0;
    	
    	// Counts the array contains how many of the given 'numberToLocate' integer to determine the length of the return array.  
    	for(int i = 0; i < bag.length; i++)
    	{
    		if(bag[i] == numberToLocate)
    			count++;
    	}
    	
    	// determine the length of the locations array.
    	locations = new int[count];
    	
    	// Place the locations(indexes) of the given value
    	for(int i = 0; i < valid; i++)
    	{
    		if(bag[i] == numberToLocate)
    		{
    			locations[j] = i;
    			j++;
    		}
    	} 
    	
    	return locations;			
    }
    
    
    // returns an Iterator object with the current object to iterate.
    public Iterator iterator() 
    {
		Iterator temp = new IntBagIterator(this);
		return temp;
	}	
}
