import static org.junit.Assert.*;
import org.junit.*;

public class MainTest {

    static int count =0;
    @Before
    public void setUp()  {
        count++;
        System.out.println("before tests " + count);
    }

    @After
    public void tearDown() {
        System.out.println("After tests");
    }
    @Test
    public void sumTest(){
        Main m1 = new Main();
        Assert.assertEquals(10, m1.sum(5,5));
    }
    @Test
    public void subTest(){
        Main m2 = new Main();
        Assert.assertEquals(16, m2.sub(5,5));
    }

    @Ignore
    @Test
    public void main() {
    }
}