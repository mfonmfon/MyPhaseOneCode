import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaximumNumberTest{



	@Test
	public void testThatFunctionReturnMaximumValue(){
	int[]array = {1, 2, 2, 2, 3};
	int result = MaximumNumber.getMaximumValue(array);
	assertEquals(2, result);

	}


	@Test
	public void testThatFunctionReturnMaximumValue(){

	
	int[]array = {32, 55, 6, 5, 4};
	
	int result = MaximumNumber.getMaximumValue();
	assertEquals(1, result);





	}


}