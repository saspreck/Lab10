import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
/**
 * Abstract class to create a polygon shape
 * @author skylersprecker
 * @version 2019-04-16
 */
public abstract class Polygon extends Shape{
	
	/**
	 * Constructor, takes a color and a fill
	 * @param color
	 * @param filled
	 */
	public Polygon(Color color, boolean filled) {
		super(color, filled);
		
	}
	
	/**
	 * Draw method, draws the polygon
	 */
	public void draw(Graphics graphics) {
		
		//creates two arrays of the length of the number of points
		int numPoints = location.length;
		int[] xCoordinates = new int[numPoints];
		int[] yCoordinates = new int[numPoints];
		
		//adds the x and y coordinates to the respective arrays
		for(int i = 0; i < numPoints; i++) {
			xCoordinates[i] = location[i].x;
			yCoordinates[i] = location[i].y;
		}
		//sets the color
		graphics.setColor(getColor());
		//draws the polygon according to if it is filled or not
		if(this.isFilled()) {
			graphics.fillPolygon(xCoordinates, yCoordinates, numPoints);
		}
		else {
			graphics.drawPolygon(xCoordinates, yCoordinates, numPoints);
		}
		
	}

}
