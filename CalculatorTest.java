import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

	 @Test
	 public void testThatCalculatorCanAddTwoPossibleNumbers(){
		int sum = Calculator.add(2,2);
		int expectedSum = 4;
		//assertion
		assertEquals(expectedSum, sum);
		
	}

	@Test
	public void testThatCalculatorCanSubtractTwoPossibleNumbers(){
		int difference = Calculator.subtract(2,4);
		int expectedDifference  = 2;
		
		assertEquals(expectedDifference, difference);

	}

	@Test
	public void testThatCalculatorCanTakeTwoNegativeNumbers(){

		int difference = Calculator.subtractSubtract(-2,-2);
		int expectedDifference  = -4;
		
		assertEquals(expectedDifference, difference);

	}
	
	@Test
	public void testThatCalculatorCanMultiplyTwoNumbersWithoutUsingTheMultiplicationSign(){
		int product = Calculator.multiply(2,5);
		int expectedProduct = 10;

		assertEquals(expectedProduct, product);
	}


}