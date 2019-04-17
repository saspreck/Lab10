import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Graphics;
/**
 * Class to create a draw panel
 * @author skylersprecker
 * @version 2019-04-16
 */
public class DrawPanel extends JPanel{
	//arraylist to store the shapes in
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	/**
	 * Method to add shapes to the arraylist
	 * @param shape
	 */
	public void addShape(Shape shape) {
		shapeList.add(shape);
	}
	
	/**
	 * Method to draw the shapes
	 */
	protected void paintComponent(Graphics graphics) {
		
		for(Shape s : shapeList) {
			s.draw(graphics);
		}
	}

}
