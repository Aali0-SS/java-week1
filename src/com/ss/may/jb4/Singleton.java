/**
 * 
 */
package com.ss.may.jb4;

/**
 * A singleton with double checked locking.
 * @author ahmed
 *
 */
public class Singleton {
	
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if ( instance == null ) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}