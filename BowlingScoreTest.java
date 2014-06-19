import static org.junit.Assert.*;

import org.junit.Test;


public class BowlingScoreTest {

	@Test
	public void testBowlingScore() {
		BowlingScore testScore = new BowlingScore();
		assertNotNull("testScore object should exist", testScore);
		
		assertTrue("nextScore should accept a value", testScore.nextScore(1));
		
		assertEquals("frameScore should be 1 after nextScore of 1", 1, testScore.frameScore());
	}

}
