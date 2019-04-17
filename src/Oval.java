import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

/**
 * Class to create an oval object
 * @author skylersprecker
 * @version 2019-04-16
 */
public class Oval extends Polygon{
	//the two diameters of the oval
	private int diameter1;
	private int diameter2;
	
	/**
	 * Constructor, takes a point, the lengths of the two diameters, the color, and the fill
	 * @param pointUL
	 * @param d1
	 * @param d2
	 * @param color
	 * @param fill
	 */
	public Oval(Point pointUL, int d1, int d2, Color color, boolean fill) {
		//calls the super constructor and assigns the two diameters
		super(color, fill);
		diameter1 = d1;
		diameter2 = d2;
		//creates a new point array and puts the given point in it
		location = new Point[1];
		location[0] = pointUL;
	}

	//returns the first diameter
	public int getDiameter1() {
		return diameter1;
	}

	//returns the second diameter
	public int getDiameter2() {
		return diameter2;
	}
	
	/**
	 * Method to draw the oval
	 */
	public void draw(Graphics graphics) {
		
		//sets the upper left point
		Point upperLeft = location[0];
		//sets the color
		graphics.setColor(getColor());
		//draws the oval according to whether it is filled or not
		if(this.isFilled()) {
			graphics.fillOval(upperLeft.x, upperLeft.y, diameter1, diameter2);
		}
		else {
			graphics.drawOval(upperLeft.x, upperLeft.y, diameter1, diameter2);
		}	
	}

}
