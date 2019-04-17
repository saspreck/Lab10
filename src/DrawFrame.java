import java.awt.Color;
import java.awt.Point;
import javax.swing.JFrame;

/**
 * Class to draw all the shapes in the frame
 * @author skylersprecker
 *
 */
public class DrawFrame extends JFrame {
	
	/**
	 * Constructor for the DrawFrame object, takes a string as the title
	 * @param title
	 */
	public DrawFrame(String title) {
		
		//creates the frame
		super(title);
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//creates a panel on the frame to add shapes to
		DrawPanel panel = new DrawPanel();
		this.add(panel);
		
		//Rectangle for the grass in the picture
		Rectangle grass = new Rectangle(new Point(0, 500), 1000, 200, new Color(100, 200, 0), true);
		//Rectangle for the sky in the picture
		Rectangle sky = new Rectangle(new Point(0,0), 1000, 500, new Color(69, 179, 224), true);
		//Circle for the sun in the picture
		Circle sun = new Circle(new Point(700, 100), 100, Color.YELLOW, true);
		//Sinusoids for the sun rays in the picture
		Sinusoid rays = new Sinusoid(Color.YELLOW, new Point(705, 150), 1, 7, 10);
		Sinusoid moreRays = new Sinusoid(Color.YELLOW, new Point(545, 150), 1, 7, 10);
		//Square for the house in the picture
		Square house = new Square(new Point(150, 300), 250, new Color(210, 180, 140), true);
		//Right triangles for the roof of the house
		RightTriangle roof = new RightTriangle(new Point(275, 300), -150, -100, Color.BLACK, true);
		RightTriangle roof2 = new RightTriangle(new Point(275, 300), 150, -100, Color.BLACK, true);
		//Polyline for the door of the house
		PolyLine door = new PolyLine(new Point(200, 450), new Point(250, 450), 100, Color.PINK, true);
		//Diamond and ovals for the windows of the house
		Oval window = new Oval(new Point(205, 350), 40, 60, new Color(69, 179, 224), true);
		Diamond window2 = new Diamond(new Point(247, 255), 40, new Color(69, 179, 224), true);
		Oval window3 = new Oval(new Point(305, 350), 40, 60, new Color(69, 179, 224), true);
		//Circle for the door handle of the house
		Circle doorHandle = new Circle(new Point(235, 500), 10, Color.DARK_GRAY, true);
		//Isosceles triangles for the mountain and snow in the picture
		IsoscelesTriangle mountain = new IsoscelesTriangle(new Point(450, 500), 400, -350, Color.GRAY, true);
		IsoscelesTriangle snow = new IsoscelesTriangle(new Point(593, 250), 114, -100, Color.WHITE, true);
		
		
		//adds each shape to the picture
		panel.addShape(grass);
		panel.addShape(sky);
		panel.addShape(sun);
		panel.addShape(rays);
		panel.addShape(moreRays);
		panel.addShape(house);
		panel.addShape(roof);
		panel.addShape(roof2);
		panel.addShape(door);
		panel.addShape(window);
		panel.addShape(window2);
		panel.addShape(window3);
		panel.addShape(doorHandle);
		panel.addShape(mountain);
		panel.addShape(snow);

	}
	
	/**
	 * Main method, creates the frame for the picture
	 * @param args
	 */
	public static void main(String [] args) {
		DrawFrame frame = new DrawFrame("My Own Little Picture");
	}

}
