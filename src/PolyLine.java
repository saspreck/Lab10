import java.awt.Color;
import java.awt.Point;

/**
 * Class to create a polyline
 * @author skylersprecker
 * @version 2019-04-16
 */
public class PolyLine extends Polygon{
	
	/**
	 * Constructor, takes two points, a thickness, a color, and a fill
	 * @param pointUL
	 * @param pointUR
	 * @param thickness
	 * @param color
	 * @param fill
	 */
	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean fill) {
		//calls the super constructor
		super(color, fill);
		//initializes the array and puts the given points in it
		location = new Point[4];
		location[0] = pointUL;
		location[1] = pointUR;
		
		//adds the thickness to the y value of the points and puts it into the array
		location[2] = new Point((int) pointUR.x, (int) pointUR.y + thickness); 
		location[3] = new Point((int) pointUL.x, (int) pointUL.y + thickness);
	}

}
