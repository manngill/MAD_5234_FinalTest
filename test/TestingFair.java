import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestingFair {
    TestingFair FairTesting;
        
    
    public TestingFair() {
        FairTesting = new TestingFair();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testCalculateTotal() {
         
    }
    
       
        @Test
    public void test1() {
         
      String[] from = {"leslie"};
        String[] to = {"Don Mills"};
        double result = TestingFair.calculateTotal(from,to);
        assertEquals(2.50, result,0.0);
    }
    
    
   
         @Test
    public void test2() {
         
      String[] from = {"Sheppard"};
        String[] to = {"Finch"};
        double result = TestingFair.calculateTotal(from,to);
        assertEquals(3.00, result,0.0);
    }
    

    
    
}
