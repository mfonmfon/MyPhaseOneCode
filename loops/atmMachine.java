import java.util.Scanner;
public class AtmMachine{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int userInput = scan.nextInt();


	int number = userInput;
	int reverse = 0;

	while(userInput != 0){
	
		reverse = reverse * 10 + userInput % 10;
		userInput = userInput / 10;

	
	}

	if(number==reverse){
		System.out.println( reverse + "Palindrome number");

	}
	
	
	System.out.print(reverse);
}
}