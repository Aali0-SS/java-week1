package com.ss.may.jb;

import java.util.Scanner;

/**
 * 
 */

/**
 * A Java Program that prints out a star pattern.
 * @author ahmed
 *
 */
public class StarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i, j, row=4;
		
		for(i=0; i < row; i++) {
			for(j=0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	System.out.println('-');
	}

	public void secondPattern() {
		
		int n = 7;
		
		for(int i = 0; i <= n; i++) {
			for(int j=1; j <= n-i; j++) {
				System.out.print("");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		System.out.println('-');
	}
	public void thirdPattern() {
		int row, i, j, space = 1;
		System.out.print("Enter number of rows:");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		space = row - 1;
		
		for(j = 1; j <= row; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print("");
			}
			space--;
			for(i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		space = 1;
		for (j = 1; j <= row - 1; j++) {
			for (i = 1; i <= space; i ++) {
				System.out.print("");
			}
			space++;
			for(i = 1; i <= 2 * (row - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
}
