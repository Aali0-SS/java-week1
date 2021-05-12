/**
 * 
 */
package com.ss.may.jb2;

/**
 * A program that takes command line arguments and adds them.
 * @author ahmed
 *
 */
public class AddingValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String x = "8";
		String y = "42";
		
		System.out.println( x + y );
		
		System.out.println( Integer.parseInt(x) + Integer.parseInt(y) );	
	}
}
