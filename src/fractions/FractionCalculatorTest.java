package fractions;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionCalculatorTest {

	
	@Test
	public void testSplitString() {
		
		String input = "3/2 + 3/3 / 5/4";
		String[] expecteds = {"3/2", "3/3", "/", "5/4"};
		
		FractionCalculator fc = new FractionCalculator();
		String[] actual = fc.splitString(input);
		
		assertArrayEquals("Wrong answer!", expecteds, actual);
		
	}
	
	@Test
	public void testSplitFraction() {
		
		String[] input = {"3/2", "3/3", "/", "5/4"};
		String[] expecteds =  {"5/4", "9/7"};
		String[] actual = null;
		FractionCalculator item = new FractionCalculator();
		
		for(int i = 0; i < input.length; i++) {
			
			actual = item.splitFraction(input[i]);
			
		}
		assertArrayEquals("Wrong answer!", expecteds, actual);
			
	}
	
	@Test
	public void testIsFraction() {
		String[] input = {"3/4"};
		String[] expected = {"+"};
		String[] actual = null;
		FractionCalculator item = new FractionCalculator();
		
		for(int i = 0; i < input.length; i++) {
			
			actual = item.splitFraction(input[i]);
			
		} 
		assertTrue(item.isFraction(expected));
		
	}

}
