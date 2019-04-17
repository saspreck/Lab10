import java.awt.Color;
import java.awt.Point;
/**
 * Class to created an isosceles triangle
 * @author skylersprecker
 * @version 2019-04-16
 */
public class IsoscelesTriangle extends Triangle {
	
	/**
	 * Constructor for an isosceles triangle
	 * Takes a point, the lengths of the height and base, the color and the fill
	 * @param pointLB
	 * @param base
	 * @param height
	 * @param color
	 * @param fill
	 */
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean fill) {
		//calls the super constructor
		super(pointLB, color, fill);
		//initializes the location array for the points
		location = new Point[3];
		//puts the base point in the array
		location[0] = pointLB;
		//adds the base and height to x and y and puts them into the array
		location[1] = new Point((int) pointLB.x + base, (int) pointLB.y);
		location[2] = new Point((int) pointLB.x + (base / 2), (int) pointLB.y + height);
	}

}
