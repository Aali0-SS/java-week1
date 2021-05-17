/**
 * 
 */
package com.ss.may.jb4;

/**
 * An example of how a Deadlock occurs in java.
 * @author ahmed
 *
 */
public class Deadlock {
	
	String red = "Red";
	String blue = "Blue";
	
	Thread firstThread = new Thread("First Thread") {
		public void run() {
			while(true) {
				synchronized(red) {
					synchronized(blue) {
						System.out.println(red + blue);
					}
				}
			}
		}
	};

	Thread secondThread = new Thread("Secong Thread") {
		public void run() {
			while(true) {
				synchronized(blue) {
					synchronized(red) {
						System.out.println(blue + red);
					}
				}
			}
		}
	};
	
	public static void main(String a[]) {
		Deadlock executeLock = new Deadlock();
		executeLock.firstThread.start();
		executeLock.secondThread.start();
	}
}
