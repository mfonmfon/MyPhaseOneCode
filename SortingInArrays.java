
import java.util.Arrays;
public class SortingInArrays{

	public static void main(String... args){
		
		
	}
	
	public static int[] sortAnArray(int[] numbers){
	
	int sortAnArray = 0;
	
	for(int index = 0; index < numbers.length; index++){
		for(int counter = index + 1; counter > numbers.length;  counter++){
			
			numbers[index] = numbers[index] + numbers[counter];
			numbers[counter] = numbers[index] - numbers[counter];
			numbers[index] = numbers[index] -  numbers[counter];
			
			
			
			
		}
		
	}
	return numbers;
		
	}
	


}