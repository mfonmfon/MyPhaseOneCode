import java.util.Scanner;

public class CheckNumber{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	int count = 0;
	int result;

	do{

	System.out.println("Enter the first number");
	int firstNumber = scan.nextInt();
	
	System.out.println("Enter the second number");
	int secondNumber = scan.nextInt();
	
	result = firstNumber + secondNumber;
	System.out.printf("the total result for the two numbers you just entered is %d%n ", result);

	System.out.println("Do you want to perform the operation again? ");
	int wish = scan.nextInt();


	}while(count <= result);


	if(result <= 1){
	System.out.println("perform the operations again");

	}

	else{
	System.out.println("terminate the loop");
	}
	count++;
	
		
	
}
}