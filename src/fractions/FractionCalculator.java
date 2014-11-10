package fractions;

import java.util.Arrays;
import java.util.Scanner;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.io.*;
/**
 * 
 * @author Mustapha Benbaziz
 * 
 * Fraction calculator takes a line of input from the user. The line of input is a mixture of 
 * fractions and arithmetic operators separated by space. Fraction calculator carries all the 
 * calculations with the result being a new fraction.
 * It uses the following methods:
 * evaluate of type Fraction
 * splitString of type String[]
 * splitFraction of type String[]
 * 
 *
 */
public class FractionCalculator {
	
	
	
	
	/**
	 * 
	 * @param f
	 * @param inputString
	 */
	public Fraction evaluate(Fraction f, String inputString) {
		
		//Array of all elements in inputString separated by space.
		String[] input = splitString(inputString);
		
		//Declare an array of type String to store result of splitting each item of input 
		String[] elements = null,
				 fraction = null,
				 operator = null;
		
		//Iterate through items in the array input
		for(int i = 0; i < input.length; i++) {
			
			//Array of type String. it Stores all elements of each item in input
			elements = splitFraction(input[i]);
			
			//Check if element is a fraction.
			if(isFraction(elements)) {
				
				//if true store element in array fraction of type String
				fraction = fractions(input[i]);
				
			} else {
					
				//Array of possible operators
				operator = operators(input[i]);
				
			}
			
		}
		
	return new Fraction(6,8);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome!");
		System.out.println("--------------------");
		
		System.out.println("Enter your calculation:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		FractionCalculator calculator = new FractionCalculator();
		
		Fraction result = calculator.evaluate(null, input);
		System.out.print(result);
		
	}
	
	
	/**
	 * 
	 * @param input
	 * @return returns an array of strings computed by splitting this string using space [" "] as a delimiter.
	 * it takes input as a parameter of type String. 
	 */
	public static String[] splitString(String input) {
		return input.split(" ");
	}
	
	/**
	 * 
	 * @param input
	 * @return this method splits the fractions in the input String using the slash "/" as a delimiter
	 * it returns an array of strings.
	 */
	public static String[] splitFraction(String input) {
		
		String[] e = new String[input.length()];
		for(int i = 0; i < input.length(); i++) {	
			 	e = input.split("/", 1);	 	
		}
		return e;
	}
	
	/**
	 * 
	 * @param input
	 * @return this method takes input as a parameter of type String. 
	 * It checks if items in input array start with digits and returns true. It returns false otherwise
	 * it is used to sort fractions and separate them from arithmetic operators
	 */
	public static boolean isFraction(String[] input) {
		
		for(int i = 0; i < input.length; i++) {
			return Character.isDigit(input[i].charAt(0));
		}
		return false;
		
	}
	
	/**
	 * 
	 * @param input
	 * @return calls a method splitFraction. 
	 */
	public static String[] fractions(String input) {
		
		return splitFraction(input);

	}
	
	/**
	 * 
	 * @param operator
	 * @return calls a method splitFraction with a different argument
	 */
	public static String[] operators(String operator) {
		
		return splitFraction(operator);
		
	}

	
}
