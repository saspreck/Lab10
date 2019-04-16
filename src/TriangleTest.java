import java.awt.Color;
import java.awt.Point;
import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
	
	RightTriangle rt1 = new RightTriangle(new Point(100, 200), 100, 200, Color.BLACK, true);
	RightTriangle rt2 = new RightTriangle(new Point(100, 200), 200, 400, Color.ORANGE, false);
	
	IsoscelesTriangle it1 = new IsoscelesTriangle(new Point(100, 200), 100, 200, Color.RED, true);
	IsoscelesTriangle it2 = new IsoscelesTriangle(new Point(100, 200), 200, 400, Color.MAGENTA, false);
	
	@Test
	public void testTriangleConstructor() {
		// Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the Right Triangle is more than 3", 3, rt1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Right Triangle is more than 3", 3, rt2.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Isosceles Triangle is more than 3", 3, it1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Isosceles Triangle is more than 3", 3, it2.getLocation().length);

        // Verify the location for each shape
        Assert.assertEquals("Incorrect location for the Right Triangle", new Point(100, 200), rt1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Right Triangle", new Point(100, 400), rt1.getLocation()[1]);
        Assert.assertEquals("Incorrect location for the Right Triangle", new Point(200, 200), rt1.getLocation()[2]);
        Assert.assertEquals("Incorrect location for the Isosceles Triangle", new Point(100, 200), it2.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Isosceles Triangle", new Point(300, 200), it2.getLocation()[1]);
        Assert.assertEquals("Incorrect location for the Isosceles Triangle", new Point(200, 600), it2.getLocation()[2]);

        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Right Triangle", Color.BLACK, rt1.getColor());
        Assert.assertEquals("Incorrect color for the Right Triangle", Color.ORANGE, rt2.getColor());
        Assert.assertEquals("Incorrect color for the Isosceles Triangle", Color.RED, it1.getColor());
        Assert.assertEquals("Incorrect color for the Isosceles Triangle", Color.MAGENTA, it2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the Right Triangle", rt1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Right Triangle", rt2.isFilled());
        Assert.assertTrue("Incorrect flag for filled for the Isosceles Triangle", it1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Isosceles Triangle", it2.isFilled());
        
	}

}
