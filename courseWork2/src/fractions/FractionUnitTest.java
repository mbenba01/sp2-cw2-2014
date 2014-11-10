package fractions;

/**
 * @author Mustapha Benbaziz
 * @version 1.0.2
 * 
 */
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class FractionUnitTest {
	
	private static int testNum;
	private static int testDenom;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testNum = 3;
		testDenom = 2;
	}
	
	@Test
	public void testDivideByZero() {
		
		Fraction f = new Fraction(1, 3);
		
	}

	@Test
	/**
	 * 
	 * @throws IOException
	 * testMultiply tests the functionality of multiply method in Fraction Class. It compares a random fraction with the actual
	 * fraction created by multiply method. The actual result the latter is computed by multiplying actual fraction and fraction f 
	 * which is used as the argument for the multiply method. Both fractions actual and f are created in this test unit.
	 * 
	 */
	public void testMultiply() throws IOException {

		//f will be used as the argument for the multiply method 
		Fraction f = new Fraction(testNum, testDenom);
		
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
	 * fraction created by add method. The actual result of add method is computed by finding the GCD of the two fractions actual and f  
	 * - used as the argument for the add method - and then adding their numerators. 
	 * Both fractions actual and f are created in this test unit.
	 * 
	 */
	public void testAdd() throws IOException {
		
		//f will be used as the argument for the add method 
		Fraction f = new Fraction(testNum, testDenom);
			
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
	/**
	 * 
	 * @throws IOException
	 * testSubtract tests the functionality of subtract method in Fraction Class. It compares a random fraction with the actual
	 * fraction created by the subtract method. The actual result of this method is computed by computing the GCD of actual fraction and fraction f 
	 * which is used as the argument for the subtract method and then subtract the numerator of the two fractions. 
	 * Both fractions actual and f are created in this test unit.
	 * 
	 */
	public void testSubtract() throws IOException {
		
		//f will be used as the argument for the sub method 
		Fraction f = new Fraction(testNum, testDenom);
		
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
	/**
	 * 
	 * @throws IOException
	 * testDivide tests the functionality of divide method in Fraction Class. It compares a random fraction with the actual
	 * fraction created by divide method. The actual result of this method is computed by multiplying actual fraction by the reverse of fraction f 
	 * which is used as the argument for the divide method. Both fractions actual and f are created in this test unit.
	 * 
	 */
	public void testDivide() throws IOException {
		
		Fraction f = new Fraction(testNum, testDenom);
		
		Fraction expected = new Fraction(2, 4);
		
		Fraction actual = new Fraction(3, 2);
		actual = actual.divide(f);
		
		//actual = actual.negate(actual);
		
		assertEquals("Wrong answer!", expected, actual);
		
	}

}
