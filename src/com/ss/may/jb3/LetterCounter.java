/**
 * 
 */
package com.ss.may.jb3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * A program that counts how many times the letter 'e' appears in a file.
 * @author ahmed
 *
 */
public class LetterCounter {
	
	private final char search;
	private FileReader file1 = new FileReader("/java-week1/src/com/ss/may/jb3/articleFile");
	
	LetterCounter(FileReader file, char search) throws IOException {
		this.file1 = file;
		this.search = search;
	}

	private String readFile() throws IOException {
		
		String allText;
		
		try (BufferedReader br = new BufferedReader(file1)) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			while (line != null) {
			sb.append(line);
			sb.append(System.lineSeparator());
			line = br.readLine();
			}
				allText = sb.toString();
		} 
	return allText;	
	}
	
	private int count(String line) {
		int count = 0;
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == search) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		FileReader file1 = new FileReader("/java-week1/src/com/ss/may/jb3/articleFile");
		LetterCounter cl = new LetterCounter(file1, 'e');
		
		System.out.println(cl.count(cl.readFile()));
	}
}
