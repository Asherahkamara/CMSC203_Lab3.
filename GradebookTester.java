import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	private Gradebook testobject1=new Gradebook(5);
	private Gradebook testobject2=new Gradebook(5);
	
	

	@BeforeEach
	void setUp() throws Exception 
		{
			testobject1.addScore(100.0);
			testobject1.addScore(90.0);
			testobject1.addScore(80.0);
			testobject1.addScore(70.0);
			testobject1.addScore(60.0);
		
			testobject2.addScore(50.0);
			testobject2.addScore(40.0);
			testobject2.addScore(30.0);
			testobject2.addScore(20.0);
			testobject2.addScore(10.0);
		}

	@AfterEach
	void tearDown() throws Exception 
	{
		testobject1=null;
		testobject2=null;
	}

	@Test
	void testAddScore()
	{
		assertTrue(testobject1.toString().equals("100.0 90.0 80.0 70.0 60.0 "));
		assertTrue(testobject2.toString().equals("50.0 40.0 30.0 20.0 10.0 "));
		assertEquals(5,testobject1.getScoreSize());
		assertEquals(5,testobject2.getScoreSize());
	}
	
	@Test
	void testSum() {
	assertEquals(400.0,testobject1.sum());
	assertEquals(150.0,testobject2.sum());	
	}
	
	@Test
	void testMinimum()
	{
		assertEquals(60.0,testobject1.minimum());
		assertEquals(10.0,testobject2.minimum());
	}
	@Test
	void testFinalScore()
	{
		assertEquals(340.0,testobject1.finalScore());
		assertEquals(140.0,testobject2.finalScore());
		
	}

}
