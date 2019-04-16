import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Graphics;

public class DrawPanel extends JPanel{
	
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	public void addShape(Shape shape) {
		shapeList.add(shape);
	}
	
	protected void paintComponent(Graphics graphics) {
		
		for(Shape s : shapeList) {
			s.draw(graphics);
		}
	}

}
