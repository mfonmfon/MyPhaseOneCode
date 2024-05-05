public class JavaScript{

	public static void main(String... args){
	

	}

	public static int max(int[] numbers){
	int max = 0;

		for(int counter = 0; counter < numbers.length; counter++){
		if(numbers[counter] > max){

		max = numbers[counter];
		}
		
	}

	return max;
}

}