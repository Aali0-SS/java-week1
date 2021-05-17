/**
 * 
 */
package com.ss.may.jb4;

import java.util.Iterator;
import java.util.Vector;

/**
 * A program with a producer that produces ints and a consumer that consumes items.
 * @author ahmed
 *
 */
public class ProducerConsumer {

	private static Vector<Object> data = new Vector<Object>();
	
	public static void main(String[] args) {
		new Producer().start();
		new Consumer().start();
	}
	
	public static class Consumer extends Thread {
		Consumer() {
			super("Consumer");
		}
		
		public void run() {
			for (;;) {
				try {
					Thread.sleep(1000);
					System.out.println("Object Consumed!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				synchronized (data) {
					Iterator it = data.iterator();
					while (it.hasNext())
						it.next();
				}
			}
		}
	}
	public static class Producer extends Thread {
		Producer() {
			super("Producer");
		}
		
		public void run() {
			for(;;) {
				try {
					Thread.sleep(1000);
					System.out.println("Object Produced!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				data.add(new Object());
				if (data.size() > 1000)
					data.remove(data.size() -1);
			}
		}
	}
}