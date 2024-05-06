import java.util.Scanner;

public class KataSub{
	
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);


	System.out.println("Enter first number");
	int firstNumber = scan.nextInt();

	System.out.println("Enter second number");
	int secondNumber = scan.nextInt();

	int diff = (firstNumber - secondNumber);
	System.out.println(diff);


	}

	
}