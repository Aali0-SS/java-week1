/**
 * 
 */
package com.ss.may.jb5;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A method that returns a list of all strings that start with the letter 'a'.
 * @author ahmed
 *
 */
public class StringFilter {
	
	public List<String> search(List<String> list) {
		
		return list.stream()
				.filter(s -> s.startsWith("a"))
				.filter(s -> s.length() == 3)
				.collect(Collectors.toList());
	}
}