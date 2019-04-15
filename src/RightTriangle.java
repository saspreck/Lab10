import java.awt.Color;
import java.awt.Point;
public class RightTriangle extends Triangle{
	
	public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill) {
		super(pointRA, color, fill);
		
		location = new Point[3];
		location[0] = pointRA;
		location[1] = new Point((int) pointRA.x, (int) pointRA.y + height);
		location[2] = new Point((int) pointRA.x + base, (int) pointRA.y);
	}

}
