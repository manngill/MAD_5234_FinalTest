import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingFair {


	
	
	public void testR1() {
		
		FairTesting chrg = new FairTesting();
		String fair = chrg.Testingfair(2.50, 3);
		assertEquals("zone one trip", fair);
	}
	
	@Test
	public void testR2() {
		FairTesting chrg = new FairTesting();
		String fair = chrg.Testingfair(3, 3);
		assertEquals("Two way zone", fair);
	}

	@Test
	
	
	
	public void testR3() {
		FairTesting chrg = new FairTesting();
		String fair = chrg.Testingfair(3, 3);
		assertEquals("Trip between zones", fair);
	}

	@Test
	public void testR4() {
		FairTesting chrg = new FairTesting();
		String fair = chrg.Testingfair(3, 3);
		assertEquals("more trips", fair);	
	}

}
