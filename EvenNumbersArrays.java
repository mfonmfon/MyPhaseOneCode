public class EvenNumbersArrays{

	public static boolean evenNumbers(int[] number){
	for(int index = 0; index < number.length; index++){
	if(number[index] % 2 == 0){
		number[index] = 0;

	}

	else{

	number[index] = 1;


	}
	}
	return number;
	
	}




}