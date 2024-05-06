import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaximumTest{

	@Test
	public void testThatCanReturnMaximumNumber(){

		int[] arrayNumber = {8, 4, 9, 2, 5, 7, 3};

		int result = Maximum.getMaximumNumber(arrayNumber);

		assertEquals(9, result);

	}

	@Test 
	public void testThatCanReturnMaximumNumber2(){

		int[] arrayNumber = {8, 4, 9, 2, 5, 7, 3};

		int result = Maximum.getMaximumNumber(arrayNumber);
		assertEquals(8, result);

	}

	

}