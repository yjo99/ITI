/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package search;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import search.Search;

/**
 *
 * @author emane
 */
public class TestSearch {
    
    private String str, search;
    private Search instance;

    
    public TestSearch() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        System.out.println("Before Class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        System.out.println("After Class");
    }
    
    @Before
    public void setUp() {
        
        str = "welcome";
        search = "welcome to java track , welcome again";
        instance = new Search(str, search);
    }
    
    @After
    public void tearDown() {
        
        str = null;
        search = null;
        
        System.out.println("Tear Down");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSearchWord() {
        System.out.println("test Search Word ");
        long n = Search.searchWord(search, str);

        assertEquals(2,n);
        System.out.println(n);

    }
    @Test 
    public void testMain ()
    {
        System.out.println("Main");
        String[] args = null;
        Search.main(args);
    }
}
