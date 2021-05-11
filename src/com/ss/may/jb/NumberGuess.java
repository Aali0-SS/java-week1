/**
 * 
 */
package com.ss.may.jb;

import java.util.Scanner;

/**
 * A java program that asks a user to guess a random number.
 * @author ahmed
 *
 */
public class NumberGuess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		
		int randomNumber;
		randomNumber = (int) (Math.random() * 100 + 1);
		System.out.println("The random number is" + randomNumber);
		Scanner keyboard = new Scanner(System.in);
		int guess;
		do {
			System.out.print("Enter a number between 1-100:");
			guess = keyboard.nextInt();
			System.out.println("Your guess is" + guess);
			if (guess == randomNumber)
			System.out.println("WoW, You actually guessed the correct number!");
				else if (guess < randomNumber)
				System.out.println("Your guess is too small, try again");
				else if (guess > randomNumber)
				System.out.println("Your guess is too big, try again");
		} while (guess != randomNumber);
		}

}
