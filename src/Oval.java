import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

public class Oval extends Polygon{
	
	private int diameter1;
	private int diameter2;
	
	public Oval(Point pointUL, int d1, int d2, Color color, boolean fill) {
		super(color, fill);
		diameter1 = d1;
		diameter2 = d2;
		
		location = new Point[1];
		location[0] = pointUL;
	}

	public int getDiameter1() {
		return diameter1;
	}

	public int getDiameter2() {
		return diameter2;
	}
	
	public void draw(Graphics graphics) {
		
		Point upperLeft = location[0];
		graphics.setColor(getColor());
		if(this.isFilled()) {
			graphics.fillOval(upperLeft.x, upperLeft.y, diameter1, diameter2);
		}
		else {
			graphics.drawOval(upperLeft.x, upperLeft.y, diameter1, diameter2);
		}	
	}

}
