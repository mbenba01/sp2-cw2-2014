package fractions;
/**
 * @author Mustapha Benbaziz
 * @version 1.0
 */
import java.io.IOException;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) throws IOException {
		if(d == 0) {
			System.out.println("Invalid fraction with denominator 0");
			return;
		}
		numerator = n;
		denominator = d;
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
		
		return new Fraction(n1 + n2, d);
		
	}
	
	
	
	
	
}
