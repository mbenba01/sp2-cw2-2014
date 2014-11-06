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
		
		//Fraction f1 = new Fraction(1, 2);
		//f will be used as the argument for the multiply method 
		Fraction f = new Fraction(3, 6);
		
		/*int n1 = f1.getNumerator() * f2.getNumerator();
		int d1 = f1.getDenominator() * f2.getDenominator();*/
		
		//expected is a random fraction used to compare with the actual result of the multiply method
		Fraction expected = new Fraction(3, 10);
		
		//actual, with arguments 1 and 2, is the actual fraction resulting from the multiply method computation of actual and f fractions
		Fraction actual = new Fraction(1, 2);
		actual = actual.multiply(f);
		
		assertEquals("Oooops!", expected, actual);
		
	}
	
	@Test
	/**
	 * 
	 * @throws IOException
	 * testAdd will test the functionality of add method in Fraction Class. It compares a random fraction with the actual
	 * fraction created by add method. The actual result of add method is computed by adding actual fraction and fraction f 
	 * which is used as the argument for the add method. Both fractions actual and f are created in this test unit.
	 * 
	 */
	public void testAdd() throws IOException {
		
		//Fraction f1 = new Fraction(1, 2);
		
		//f will be used as the argument for the add method 
		Fraction f = new Fraction(3, 6);
		
		/*int n1 = f1.getNumerator() * f2.getDenominator();
		int n2 = f2.getNumerator() * f1.getDenominator();
		int d =  f1.getDenominator() * f2.getDenominator();*/
		
		//expected is a random fraction used to compare with the actual result of the add method
		Fraction expected = new Fraction(1, 10);
		
		//actual, with arguments 1 and 2, is the actual fraction resulting from the add method computation of actual and f fractions
		Fraction actual = new Fraction(1,2);
		actual = actual.add(f);
		
		//Check if values of expected and actual are the same
		assertEquals("Wrong answer!", expected, actual);
		
		
	}
	

}
