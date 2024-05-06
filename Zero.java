import java.util.Scanner;

public class Zero{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 1000");
		int userInput = scan.nextInt();

		int firstNumber = 0;
		int secondNumber = 0;

		for(int count = 0; count <= firstNumber; count++){
		
		System.out.println(userInput);
			
		
		int sum = firstNumber + userInput  / 36;
		System.out.printf("the sum the digits is %d%n", sum);
		

	}

	}

	        


}