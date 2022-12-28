import org.junit.*;

import static org.junit.Assert.*;

public class Example2Test {

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
    public void applyTest(){
        Converter c = new Converter();
        Enters e = new Enters(1, 7, 10);
        Roots r = new Roots(-2,-5);

        Assert.assertEquals(r.getA(), c.apply(e).getA(),0);
    }

    @Test
    public void applyTest1(){
        Converter c = new Converter();
        Enters e = new Enters(1, 7, 10);
        Roots r = new Roots(-5,-5);

        Assert.assertEquals(r.getA(), c.apply(e).getA(),0);
    }

    @Ignore
    @Test
    public void main() {
    }
}