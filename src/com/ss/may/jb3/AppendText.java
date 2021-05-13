/**
 * 
 */
package com.ss.may.jb3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A program that appends text to a file.
 * @author ahmed
 *
 */
public class AppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			String text = "Hello World!";
			File file = new File("/java-week1/src/com/ss/may/jb3/testFile.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fileWritter = new FileWriter(file.getName(), true);
			BufferedWriter bw = new BufferedWriter(fileWritter);
			bw.write(text);
			bw.close();
			System.out.println("Complete");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
