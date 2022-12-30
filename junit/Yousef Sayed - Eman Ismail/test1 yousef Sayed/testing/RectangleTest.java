import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class RectangleTest {

    public static int count = 0;

    @Before
    public void setUp(){
        count++;
        System.out.println("Task number : " + count);
    }

    @After
    public void  bef(){
        count--;

    }


    @Test
    public void CirAreaTest(){
        Circle c1 = new Circle(5);
        Assert.assertEquals(28.26, c1.area(),0.0);
    }

    @Test
    public void CirAreaTest2(){
        Circle c1 = new Circle(3);
        Assert.assertEquals(28.26, c1.area(),0.0);
    }

//    @Test
//    public void CirdrawTest(){
//        Circle c1 = new Circle(3);
//        String s1 = "Draw Circle ....";
//        Assert.assertEquals(s1, c1.draw());
//    }

}