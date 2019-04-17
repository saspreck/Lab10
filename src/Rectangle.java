import java.awt.Color;
import java.awt.Point;

/**
 * Class to create a rectangle
 * @author skylersprecker
 * @version 2019-04-16
 */
public class Rectangle extends Polygon{
	
	/**
	 * Constructor, takes a point, width, height, color, and fill
	 * @param pointUL
	 * @param width
	 * @param height
	 * @param color
	 * @param fill
	 */
	public Rectangle(Point pointUL, int width, int height, Color color, boolean fill) {
		//calls the super constructor
		super(color, fill);
		//initializes the array and adds the given point to it
		location = new Point[4];
		location[0] = pointUL;
		//adds the width and height as appropriate and puts those points into the array
		location[1] = new Point((int) pointUL.x + width, (int) pointUL.y);
		location[2] = new Point((int) pointUL.x + width, (int) pointUL.y + height);
		location[3] = new Point((int) pointUL.x, (int) pointUL.y + height);
		
	}

}
