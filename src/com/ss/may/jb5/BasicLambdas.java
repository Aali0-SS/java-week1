/**
 * 
 */
package com.ss.may.jb5;

import java.util.Arrays;

/**
 * An example of basic lambdas, making an array and sorting with conditions.
 * @author ahmed
 *
 */
public interface BasicLambdas {
	
	public static void main(String[] args) {
		
		String anime[] = {"DBZ", "Attack on Titan", "One Punch Man", "Full Metal Alchemist"};
//		Sorting by length
		Arrays.sort(anime, (it1, it2) -> (it1.length()-it2.length()));
		Arrays.stream(anime).forEach(i -> System.out.print(i + ","));
//		Sorting by reverse length
		Arrays.sort(anime, (it1, it2) -> (it2.length()-it1.length()));
		Arrays.stream(anime).forEach(i -> System.out.print(i + ","));
//		Sorting by strings that contain 'e' first
		Arrays.sort(anime, (it1, it2) -> (it1.charAt(0)));
		Arrays.stream(anime).forEach(i -> System.out.print(i + ","));
//		Implementing static helper
		Arrays.sort(anime, (it1, it2) -> ((it1.contains("e")?0:1) - (it2.contains("e")?0:1)));
		Arrays.stream(anime).forEach(i -> System.out.print(i + ","));
	}
}
