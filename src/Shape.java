/**
 * Abstract class to represent a shape
 * 
 * @author skylersprecker
 * @version 2019-04-11
 *
 */
public abstract class Shape implements Drawable {
	
	protected Point[] location;
	
	private Color color;
	
	private boolean filled;
	
	/**
	 * Constructor for a shape, initializes the color and whether the shape is filled in
	 * @param color
	 * @param filled
	 */
	public Shape(Color color, boolean filled) {
		this.color = color;
		this.filled = filled; 
	}
	
	/**
	 * Method to get the color of the shape
	 * @return color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Method to return whether the shape is filled or not
	 * @return filled
	 */
	public boolean isFilled() {
		return filled;
	}
	
	/**
	 * Method to get the location of the shape
	 * @return location
	 */
	public Point[] getLocation() {
		return location;
	}	
}
