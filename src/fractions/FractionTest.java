package fractions;
/**
 * @author Musatpha Benbaziz
 * @version 1.0.2
 */
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testMultiply() throws IOException {
		
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3,5);
		
		int n1 = f1.getNumerator() * f2.getNumerator();
		int d1 = f1.getDenominator() * f2.getDenominator();
		
		Fraction expected = new Fraction(3, 10);
		
		Fraction actual = new Fraction(1, 2);
		actual = actual.multiply(f2);
		
		assertEquals("Oooops!", expected, actual);
		
	}
	
	@Test
	public void testAdd() throws IOException {
		
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 5);
		
		/*int n1 = f1.getNumerator() * f2.getDenominator();
		int n2 = f2.getNumerator() * f1.getDenominator();
		int d =  f1.getDenominator() * f2.getDenominator();*/
		
		Fraction expected = new Fraction(1, 10);
		
		Fraction actual = new Fraction(1,2);
		actual = actual.add(f2);
		
		assertEquals("Wrong answer!", expected, actual);
		
		
	}
	

}
