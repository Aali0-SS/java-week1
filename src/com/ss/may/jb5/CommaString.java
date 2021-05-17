/**
 * 
 */
package com.ss.may.jb5;

import java.util.List;

/**
 * An example of using Java 8 features that returns a comma separated string based on integers.
 * @author ahmed
 *
 */
public class CommaString {
	
	public String stringReturn(List<Integer> list) {
		
		return list.stream()
				.map(i -> i % 2 == 0 ? "e" + i : "o" + i)
				.collect(joining(","));
	}
}