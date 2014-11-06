package fractions;

/**
 * @author Musatpha Benbaziz
 * @version 1.0.2
 * 
 */
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testMultiply() throws IOException {

		//f will be used as the argument for the multiply method 
		Fraction f = new Fraction(3, 2);
		
		//expected is a random fraction used to compare with the actual result of the multiply method
		Fraction expected = new Fraction(1, 4);
		
		//actual, with arguments 1 and 2, is the actual fraction resulting from the multiply method computation of actual and f fractions
		Fraction actual = new Fraction(1, 2);
		actual = actual.multiply(f);
		
		//actual = actual.negate(actual);
		
		assertEquals("Wrong answer!", expected, actual);
		
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
		
		//f will be used as the argument for the add method 
		Fraction f = new Fraction(3, 6);
			
		//expected is a random fraction used to compare with the actual result of the add method
		Fraction expected = new Fraction(3, 10);
		
		//actual, with arguments 1 and 2, is the actual fraction resulting from the add method computation of actual and f fractions
		Fraction actual = new Fraction(1,2);
		actual = actual.add(f);
		
		//actual = actual.negate(actual);
		//actual = actual.absValue(actual);
		
		//Check if values of expected and actual are the same
		assertEquals("Wrong answer!", expected, actual);
		
		
	}
	
	@Test
	public void testSubtract() throws IOException {
		
		//f will be used as the argument for the sub method 
		Fraction f = new Fraction(4, 2);
		
		//Random fraction used to compare with the actual result of the sub method
		Fraction expected = new Fraction(1, 14);
		
		//with arguments 3 and 5, the actual fraction stores the result of the sub method computation of actual and f fractions
		Fraction actual = new Fraction(3, 4);
		actual = actual.subtract(f);
		
		//actual = actual.negate(actual);
		//actual = actual.absValue(actual);
		
		assertEquals("Wrong answer!", expected, actual);
		
	}
	
	@Test 
	public void testDivide() throws IOException {
		
		Fraction f = new Fraction(3, 5);
		
		Fraction expected = new Fraction(2, 4);
		
		Fraction actual = new Fraction(3, 2);
		actual = actual.divide(f);
		
		//actual = actual.negate(actual);
		
		assertEquals("Wrong answer!", expected, actual);
		
	}

}
