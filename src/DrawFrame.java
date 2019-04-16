import java.awt.Color;
import java.awt.Point;
import javax.swing.JFrame;

public class DrawFrame extends JFrame {
	
	private DrawPanel drawPanel;
	
	public DrawFrame(String title) {
		
		super(title);
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		DrawPanel panel = new DrawPanel();
		this.add(panel);
		
		Rectangle grass = new Rectangle(new Point(0, 500), 1000, 200, new Color(100, 200, 0), true);
		Rectangle sky = new Rectangle(new Point(0,0), 1000, 500, new Color(69, 179, 224), true);
		Circle sun = new Circle(new Point(700, 100), 100, Color.YELLOW, true);
		Sinusoid rays = new Sinusoid(Color.YELLOW, new Point(705, 150), 1, 7, 10);
		Sinusoid moreRays = new Sinusoid(Color.YELLOW, new Point(545, 150), 1, 7, 10);
		Square house = new Square(new Point(150, 300), 250, new Color(210, 180, 140), true);
		RightTriangle roof = new RightTriangle(new Point(275, 300), -150, -100, Color.BLACK, true);
		RightTriangle roof2 = new RightTriangle(new Point(275, 300), 150, -100, Color.BLACK, true);
		PolyLine door = new PolyLine(new Point(200, 450), new Point(250, 450), 100, Color.PINK, true);
		Oval window = new Oval(new Point(205, 350), 40, 60, new Color(69, 179, 224), true);
		Diamond window2 = new Diamond(new Point(247, 255), 40, new Color(69, 179, 224), true);
		Oval window3 = new Oval(new Point(305, 350), 40, 60, new Color(69, 179, 224), true);
		Circle doorHandle = new Circle(new Point(235, 500), 10, Color.DARK_GRAY, true);
		IsoscelesTriangle mountain = new IsoscelesTriangle(new Point(450, 500), 400, -350, Color.GRAY, true);
		IsoscelesTriangle snow = new IsoscelesTriangle(new Point(593, 250), 114, -100, Color.WHITE, true);
		
		
		
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
	
	public static void main(String [] args) {
		DrawFrame frame = new DrawFrame("My Own Little Picture");
	}

}
