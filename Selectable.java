
/**
 * @(#)Lab03a.java
 *
 * Lab03a application: This interface provides methods about select options of shapes
 *
 * @author :Abdullah Erkam Arslan 
 * @version 1.00 2014/3/12
 */
public interface Selectable
{
	boolean getSelected();
	void setSelected (boolean check);
	Shape contains (int a, int b);
}
