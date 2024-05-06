import java.util.Scanner;

public class PurchaseApp{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	int number1;
	int number2;

	System.out.println("Enter the first number: ");
	number1 = scan.nextInt();

	System.out.println("Enter the second number: ");
	number2 = scan.nextInt();

	if(number1 > number2 ){

	System.out.printf("%d is larger", number1);
	}

	if(number2 < number2 ){
	System.out.printf("%d is smaller", number2);
	}

	if(number1 == number2 ){
	System.out.println("these numbers are equal to each other ");
	}

}

}