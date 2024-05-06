public class Calculator{

	public static int add(int firstNumber, int secondNumber){
		int sum = firstNumber + secondNumber;

		return sum;

	}
	public static int subtract(int firstNumber, int secondNumber){
		int difference = secondNumber - firstNumber;

		return difference;
	}

	public static int subtractSubtract(int firstNumber, int secondNumber){
		int difference = secondNumber + secondNumber;

		return difference;
		
	}

	public static int multiply(int firstNumber, int secondNumber){

		int product = 0;

		for(int counter = 0; counter < secondNumber; counter++){

			product += firstNumber;

	
		}
 
		return product;
	}

}