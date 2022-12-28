package triangle;
import org.junit.*;

import static org.junit.Assert.*;

public class TriangleTest {
    static int counter = 0 ;

    @Before
    public void setUp() throws Exception {
        counter++;
        System.out.println("Test Case number " + counter);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void allposTest(){
        Triangle t1 = new Triangle(1,2,3);

        Assert.assertEquals(true, t1.allPositive());
    }
    @Test
    public void allposTest2(){
        Triangle t1 = new Triangle(1,-2,3);
        Assert.assertEquals(true, t1.allPositive());
    }


    ////valid triangle
    @Test
    public void allvalidTest(){
        Triangle t1 = new Triangle(1,-2,3);
        Assert.assertEquals(true, t1);
    }

}