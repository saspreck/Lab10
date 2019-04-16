import java.awt.Color;
import java.awt.Point;
import org.junit.Test;
import org.junit.Assert;

public class RectangleTest {
	
	private Rectangle rect1 = new Rectangle(new Point(200, 300), 100, 200, Color.GREEN, true);
	private Rectangle rect2 = new Rectangle(new Point(200, 300), 150, 250, Color.PINK, false);
	
	private Square sqr1 = new Square(new Point(100, 200), 150, Color.BLUE, true);
	private Square sqr2 = new Square(new Point(100, 200), 200, Color.GRAY, false);
	
	@Test
	public void testRectangleConstructor() {
	
		// Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the Rectangle is more than 4", 4, rect1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Rectangle is more than 4", 4, rect2.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is more than 4", 4, sqr1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is more than 4", 4, sqr2.getLocation().length);

        // Verify the location for each shape
        Assert.assertEquals("Incorrect location for the Rectangle", new Point(200, 300), rect1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Rectangle", new Point(300, 300), rect1.getLocation()[1]);
        Assert.assertEquals("Incorrect location for the Rectangle", new Point(300, 500), rect1.getLocation()[2]);
        Assert.assertEquals("Incorrect location for the Rectangle", new Point(200, 500), rect1.getLocation()[3]);
        Assert.assertEquals("Incorrect location for the Square", new Point(100, 200), sqr2.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Square", new Point(300, 200), sqr2.getLocation()[1]);
        Assert.assertEquals("Incorrect location for the Square", new Point(300, 400), sqr2.getLocation()[2]);
        Assert.assertEquals("Incorrect location for the Square", new Point(100, 400), sqr2.getLocation()[3]);

        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Rectangle", Color.GREEN, rect1.getColor());
        Assert.assertEquals("Incorrect color for the Rectangle", Color.PINK, rect2.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.BLUE, sqr1.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.GRAY, sqr2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the Rectangle", rect1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Rectangle", rect2.isFilled());
        Assert.assertTrue("Incorrect flag for filled for the Square", sqr1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Square", sqr2.isFilled());
        
	}

}
