/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import d05.D05;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emane
 */
public class D05Test {
    private static String s1; 
    private static String s2;
    
    private static String result;
    //private StringUtils instance;
    static intf interfac; 
    
    public D05Test() {
    }
    
    @BeforeClass
    public static void setUpClass(){
        
        System.out.println("Before Class");
    }
    
    @AfterClass
    public static void tearDownClass(){
        
        System.out.println("After Class");
    }
    
    @Before
    public void setUp() {
        s1 = "wel";
        s2 = "welcome";
        interfac = (x, y) -> x.length() > y.length();
        
    }
    
    @After
    public void tearDown() {
        s1= null;
        s2 = null;
        interfac = null;
        
        System.out.println("Tear Down");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBetterString() {
        
        System.out.println("test Better String ");
        result = StringUtils.betterString(s1,s2,interfac);
        if(interfac.test(s1,s2)){
            assertEquals(s1, result);
        }else {
            assertEquals(s2, result);
        }
    }
    
    @Test 
    public void testMain()
    {
        System.out.println("Main");
        String[] args = null;
        StringUtils.main(args);
    }    
        
    
}    
