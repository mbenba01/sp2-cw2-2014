package fractions;

import java.io.IOException;

public class FractionTest extends Fraction {
	
	FractionTest(int n, int d) {
		super(n, d);
	}
	
	public static void main(String[] args) throws IOException {
		
		//Test divide by zero - prints an error and exits if denominator is changed to 0
		Fraction f = new FractionTest(1, 6);
		
		//test multiply - 
		Fraction f1 = new Fraction(1, 4);
		Fraction f2 = new Fraction(1, 4);
		
		Fraction expected = new Fraction(1,16);
		
		Fraction result = f1.multiply(f2);
		
		if(!(result.equals(expected))) {
			System.err.print("Error!");
			System.exit(1);
		}
		System.out.println("EQUALS TESTS");
		//TEST EQUALS
		//1. one fraction equals to one identical 
		if(f1.equals(f2)) System.out.println("isTrue: 1/2 = 1/2");
		
		//2. one fraction equals to one with the same GCD
		Fraction small = new Fraction(1, 2);
		Fraction big = new Fraction(3, 6);
		
		if(small.equals(big)) System.out.println("isTrue: 1/2 = 3/6");
		
		//3. one fraction with a negative numerator equals to one identical with negative denominator instead
		Fraction negNum = new Fraction(-1, 2);
		Fraction NegDenom = new Fraction(6, -12);
		
		if(negNum.equals(NegDenom)) System.out.println("isTrue: -1/2 = 1/-2 = 3/-6");
		
		//4. one fraction with negative numerator and denominator equals to one identical with positive numerator and denominator
		Fraction negative = new Fraction(-1, -2);
		Fraction positive = new Fraction(3, 6);
		
		if(negative.equals(positive)) System.out.println("isTrue: -1/-2 = 1/2 = 3/6");		
		
		//TEST ADDITION
		result = f1.add(f2);
		if(!(result.equals(new Fraction(5, 12))))  {
			System.out.println("\nADDITION TEST");
			System.out.println("Wrong answer! result should be: "
				+ new Fraction(result.getNumerator(), result.getDenominator()));
		} 
		
		//TEST SUBTRACTION
		result = f1.subtract(f2);
		if(!(result.equals(new Fraction(-1, 12))))  {
			System.out.println("\nSUBTRACTION TEST");
			System.out.println("Wrong answer! result should be: "
					+ new Fraction(result.getNumerator(), result.getDenominator()));
		} 
		
		//TEST DIVISION
		result = f1.divide(f2);
		if(!(result.equals(new Fraction(2, 3))))  {
			System.out.println("\nDIVISION TEST");
			System.out.println("Wrong answer! result should be: "
					+ new Fraction(result.getNumerator(), result.getDenominator()));
		} 
		

	}

}
