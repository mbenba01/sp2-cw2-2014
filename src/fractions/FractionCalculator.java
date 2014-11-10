package fractions;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class FractionCalculator extends Fraction {
	
	private static Fraction stValue;
	private static Fraction currentValue;
	private static int numerator;
	private static int denominator;
	
	public static final String ADDITION = "+";
	public static final String SUBTRACTION = "-";
	public static final String MULTIPLICATION = "*";
	public static final String DIVISION = "/";
	
	public static final String[] QUIT = {"q","Q","quit"};
	public static final String[] NEGATE = {"n","N","neg"};
	public static final String[] CLEAR = {"c","C","clear"};
	//public static final String[]  = {"q","Q","quit"};
	
	
	private static Scanner in = new Scanner(System.in);
	
	public FractionCalculator(int n, int d) {
		super(n, d);
		numerator = n;
		denominator = d;
		stValue = new Fraction(n,d);
	}
	
	


	public static Fraction getStValue() {
		return stValue;
	}



	public static void setStValue(Fraction stValue) {
		FractionCalculator.stValue = stValue;
	}



	public int getNumerator() {
		return numerator;
	}



	public void setNumerator(int numerator) {
		FractionCalculator.numerator = numerator;
	}



	public int getDenominator() {
		return denominator;
	}



	public void setDenominator(int denominator) {
		FractionCalculator.denominator = denominator;
	}



	public static String[] splitString(String input) {
		return input.split(" ");
	}
	
	public static String[] splitFraction(String input) {
		
		String[] e = new String[input.length()];
		for(int i = 0; i < input.length(); i++) {	
			 	e = input.split("/");	 	
		}
		return e;
	}
	
	public static boolean isFraction(String[] e) {
		for(int i = 0; i < e.length; i++) {
			return Character.isDigit(e[i].charAt(0));
		}
		return false;
		
		
	}
	
	public static String[] operators(String operator) {
		
		return splitFraction(operator);
		
	}
	
	public static String[] fractions(String input) {
		
		return splitFraction(input);

	}
	
	
	
	public static void main(String[] args) throws Exception {	
		
		String input = in.nextLine();
		
		// Line of input from the user pulled apart
		String[] f = splitString(input);
		
		stValue = setInValue(f);
		//System.out.print(stValue);
		String operation = setOperation(f);
		//System.out.print(operation);
		
		
	}
	public static String setOperation(String[] f) {
		String operator = "";
		for(int i = 0; i < f.length; i++) {
			String[] e = splitFraction(f[i]);
			if(!isFraction(e)) {
				String[] op = splitFraction(f[i]);
				for(int j = 0; j < 4; j++) {
					//System.out.print(op[j]);
					operator = op[j];
					break;
				}
			}
		}
		
		return operator;
		
	}
	public static Fraction setInValue(String[] f) { 
		for(int i = 0; i < f.length; i++) {
			
			//System.out.println("-------------");
			String[]  e = splitFraction(f[i]);
			
			if(isFraction(e))  {
				
				String[] r = splitFraction(f[i]);
				
				for(int j = 0; j < 1;) {
					
					numerator = Integer.parseInt(r[j]);
					denominator = Integer.parseInt(r[j + 1]);
					stValue = new Fraction(numerator, denominator);	
					System.out.println(stValue);
					break;
					
				}

			}
			
		}
		return stValue;
	}

}
