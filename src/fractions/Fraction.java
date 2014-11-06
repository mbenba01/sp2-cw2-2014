package fractions;
/**
 * @author Mustapha Benbaziz
 * @version 1.0
 */
import java.io.IOException;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		
		//Throws an error message if the denominator is zero and exits the java virtual machine 
		if(d == 0) {
			System.err.println("Invalid fraction with denominator 0, please use another digit!");
			System.exit(1);
			//return;
		}
		//Reduce the numerator and denominator when appropriate by dividing them by their great common denominator (gcd)
		int gcd = findGCD(n, d);
		numerator = n / gcd;
		denominator = d /gcd;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int n) {
		numerator = n;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int d) {
		denominator = d;
	}

	@Override
	public String toString() {
		if(getDenominator() == 1) {
			return "" + getNumerator();
		}
		return "" + getNumerator() + '/' + getDenominator();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Fraction other = (Fraction) obj;
		
		if (denominator != other.denominator) return false;
		if (numerator != other.numerator) return false;
		
		return true;
	}
	
	public Fraction multiply(Fraction f) throws IOException {
		
		int num = this.numerator * f.getNumerator();
		int denom = this.denominator * f.getDenominator();
		return new Fraction(num, denom);
		
	}
	
	public Fraction add(Fraction f) throws IOException {
		
		int n1 = this.numerator * f.getDenominator();
		int n2 = this.denominator * f.getNumerator();
		int d = this.denominator * f.getDenominator();
		int gcd = findGCD(n1, n2);
		
		//returns a new, and reduced fraction using the gcd from findGCD method
		return new Fraction((n1 + n2) / gcd, (d / gcd));
		//return new Fraction(n1 + n2,d);
		
	}
	
	private int findGCD(int n, int d) {
		
		while(d != 0) {
			int t = d;
			d = n % d;
			n = t;
		}
		return n;
		
	}
	
	
	
	
	
}
