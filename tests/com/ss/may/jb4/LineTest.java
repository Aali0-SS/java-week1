/**
 * 
 */
package com.ss.may.jb4;

/**
 * A unit test for Line Class.
 * @author ahmed
 *
 */
public class LineTest {
	
	private Line line = new Line();
	
	public void getSlopeTest() {
		assertEquals(x1 == x0);
	}
	
	
	public void getDistanceTest() {
		assertNotSame((x1-x0), (y1-y0));
	}
	
	public void parallelToTest() {
		assertTrue(Math.abs(getSlope() - I.getSlope()) < .0001);
	}
}