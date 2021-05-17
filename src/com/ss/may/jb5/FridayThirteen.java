/**
 * 
 */
package com.ss.may.jb5;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalQuery;

/**
 * An example that checks if a given date is on Friday 13th.
 * @author ahmed
 *
 */
public class FridayThirteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Month month = null;
        LocalDate date = null;

        if (args.length < 2) {
            System.out.printf("Usage: Superstitious <month> <day>%n");
            throw new IllegalArgumentException();
        }

        try {
            month = Month.valueOf(args[0].toUpperCase());
        } catch (IllegalArgumentException exc) {
            System.out.printf("%s is not a valid month.%n", args[0]);
            throw exc;    
        }

        int day = Integer.parseInt(args[1]);

        try {
            date = Year.now().atMonth(month).atDay(day);
        } catch (DateTimeException exc) {
            System.out.printf("%s %s is not a valid date.%n", month, day);
            throw exc;   
        }

        System.out.println(date.query(new FridayThirteenQuery()));
    } 
}