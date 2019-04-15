import java.awt.Color;
import java.awt.Point;
public class IsoscelesTriangle extends Triangle {
	
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean fill) {
		super(pointLB, color, fill);
		location = new Point[3];
		
		location[0] = pointLB;
		location[1] = new Point((int) pointLB.x + base, (int) pointLB.y);
		location[2] = new Point((int) pointLB.x + (base / 2), (int) pointLB.y + height);
	}

}
