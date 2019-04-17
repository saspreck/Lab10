import java.awt.Color;
import java.awt.Point;
/**
 * CLass to create a right triangle
 * @author skylersprecker
 * @version 2019-04-16
 */
public class RightTriangle extends Triangle{
	
	/**
	 * Constructor, takes the point where the right angle is, the height, the base, the color, and the fill
	 * @param pointRA
	 * @param base
	 * @param height
	 * @param color
	 * @param fill
	 */
	public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill) {
		//calls the super constructor
		super(pointRA, color, fill);
		
		//initializes the array and adds the given point
		location = new Point[3];
		location[0] = pointRA;
		//adds the base and height as appropriate and puts those points into the array
		location[1] = new Point((int) pointRA.x, (int) pointRA.y + height);
		location[2] = new Point((int) pointRA.x + base, (int) pointRA.y);
	}

}
