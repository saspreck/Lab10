import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
public abstract class Polygon extends Shape{
	
	public Polygon(Color color, boolean filled) {
		super(color, filled);
		
	}
	
	public void draw(Graphics graphics) {
		
		int numPoints = location.length;
		int[] xCoordinates = new int[numPoints];
		int[] yCoordinates = new int[numPoints];
		
		for(int i = 0; i < numPoints; i++) {
			xCoordinates[i] = location[i].x;
			yCoordinates[i] = location[i].y;
		}
		graphics.setColor(getColor());
		if(this.isFilled()) {
			graphics.fillPolygon(xCoordinates, yCoordinates, numPoints);
		}
		else {
			graphics.drawPolygon(xCoordinates, yCoordinates, numPoints);
		}
		
	}

}
