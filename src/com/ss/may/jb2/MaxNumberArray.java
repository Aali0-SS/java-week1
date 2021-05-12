/**
 * 
 */
package com.ss.may.jb2;

/**
 * A 2D array construct that finds the max number and its position.
 * @author ahmed
 *
 */
public class MaxNumberArray {

	/**
	 * @param args
	 */
	public static double highestValue(double[][] doubles) {
		double currentHighestValue = Double.MIN_VALUE;
		for (int row = 0; row < doubles.length; row++) {
			double value = doubles[3][10];
			if (value > currentHighestValue) {
				currentHighestValue = value;
			}
		}
	return currentHighestValue;
	}	
}