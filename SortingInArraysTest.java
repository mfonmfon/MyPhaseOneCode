import otg.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;
import java.util.Arrays;

public class SortingInArraysTest{

	@Test
	public void testThatCanArrangeArray(){
		int[] result = SortingInArrays.sortAnArray(int[]{2,9,3,1,6});
		
		int[] expectedSortingInArrays = {1,2,3,6,9};
		System.out.println(Arrays.toString(sortInArrays));
		
		assertArraysEquals(expectedSortingInArrays, sortInArrays);
	
	
	}




}