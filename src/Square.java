import java.awt.Color;
import java.awt.Point;
/**
 * Class to create a square
 * @author skylersprecker
 * @version 2019-04-16
 */
public class Square extends Rectangle{
	
	/**
	 * Constructor, takes the upper left point, the side length, color, and fill
	 * @param pointUL
	 * @param width
	 * @param color
	 * @param fill
	 */
	public Square(Point pointUL, int width, Color color, boolean fill) {
		//calls the super constructor
		super(pointUL, width, width, color, fill);
	}

}
