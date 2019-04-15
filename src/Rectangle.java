import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{
	
	public Rectangle(Point pointUL, int width, int height, Color color, boolean fill) {
		super(color, fill);
		location = new Point[4];
		location[0] = pointUL;
		location[1] = new Point((int) pointUL.x + width, (int) pointUL.y);
		location[2] = new Point((int) pointUL.x + width, (int) pointUL.y + height);
		location[3] = new Point((int) pointUL.x, (int) pointUL.y + height);
		
	}

}
