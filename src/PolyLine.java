import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon{
	
	
	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean fill) {
		super(color, fill);
		location = new Point[4];
		location[0] = pointUL;
		location[1] = pointUR;
		
		location[2] = new Point((int) pointUR.x, (int) pointUR.y + thickness); 
		
		location[3] = new Point((int) pointUL.x, (int) pointUL.y + thickness);
	}

}
