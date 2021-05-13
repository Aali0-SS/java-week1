/**
 * 
 */
package com.ss.may.jb3;

import java.io.File;

/**
 * A program that lists all file/directory names under a given directory.
 * @author ahmed
 *
 */
public class FileMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("/java-week1/src/com/ss/may/jb3/testFile.txt");
		String[] fileList = file.list();
		for(String name: fileList) {
			System.out.println(name);
		}
	}
}
