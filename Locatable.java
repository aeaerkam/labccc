
/**
 * @(#)Lab03a.java
 *
 * Lab03a application: Interface to provide locatibility in the coordinate system
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/12
 */
public interface Locatable extends Selectable
{
	int getX(); //Returns x coordinate
	int getY(); //Returns y coordinate
	void setLocation (int a, int b); //Sets coordinates
}
