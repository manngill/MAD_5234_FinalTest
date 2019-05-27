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
    public void  testcalculateTotal() {
         
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
    
         @Test
    public void test3() {
         
      String[] from = {"Don Mills"};
        String[] to = {"Finch"};
        double result = TestingFair.calculateTotal(from,to);
        assertEquals(3.00, result,0.0);
    }
    
       
         @Test
    public void test4() {
         
        String[] from = {"Finch", "Leslie"};
        String[] to = {"Sheppard","Don Mills"};
        double result = TestingFair.calculateTotal(from,to);
        assertEquals(5.50, result,0.0);
    }
    
         @Test
         public void test5() {

             String[] from = {"Finch", "sheppard","Finch"};
             String[] to = {"Sheppard","Don Mills","Sheppard"};
             double result = TestingFair.calculateTotal(from,to);
             assertEquals(6.0, result,0.0);
         }

         
         
         
    
}
