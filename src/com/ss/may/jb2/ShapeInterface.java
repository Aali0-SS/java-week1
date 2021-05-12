/**
 * 
 */
package com.ss.may.jb2;

/**
 * A shape interface with a rectangle, circle, and triangle class.
 * @author ahmed
 *
 */
public interface ShapeInterface {
	
	abstract class rectangle { 
		abstract void calculateArea();
		abstract void display();
	}
	
	abstract class circle { 
		abstract void calculateArea();
		abstract void display();
	}
	
	abstract class triangle {
		abstract void calculateArea();
		abstract void display();
	}
}
