import java.util.Scanner;
public class Kata{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);

	//int[] numbers = {2, 4, 6, 8};

	//System.out.println(sumOf(numbers));


	//float firstNumber = scan.nextFloat();
        //float secondNumber = scan.nextFloat();

	//System.out.println(divideValue(firstNumber, secondNumber));

	}

	public static int subtractValue(int firstNumber, int secondNumber){

	int diff = firstNumber - secondNumber;

	return diff;

	}


	public static float divideValue(float firstNumber, float secondNumber){

	float result = firstNumber / secondNumber;

	if(secondNumber == 0){
	return secondNumber;

	}else{

	return result;

	}


	public static boolean isEven(int EvenNumber){
	if (EvenNumber % 2 == 0 ){
		return true;

	}else{

		return false;
	 
	}


	}


	public static int isPrimeNumber(int primeNumber){

	if(primeNumber % 2 == 1){

		return true

	}else{

		retrun false

	}


}


}


