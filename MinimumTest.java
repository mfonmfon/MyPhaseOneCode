import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTest{

	@Test
	public void testThatFunctionReturnsMinimumValue(){
		int[] array = {8, 4, 9, 2, 5, 7, 3};
		int result = Minimum.getMinimumValue(array);
		assertEquals(2, result);
	}

	@Test
	public void testThatFunctionReturnsMinimumValue2(){
		int[] array = {8, 4, 9, 1, 5, 7, 3};
		int result = Minimum.getMinimumValue(array);
		assertEquals(1, result);
	}

}