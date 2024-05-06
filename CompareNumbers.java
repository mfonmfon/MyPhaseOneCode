import java.util.Scanner;

public class CompareNumbers{


public static void main(String[] args){


Scanner input = new Scanner(System.in);

	int firstNumber = 1;
	int secondNumber = 0;

	System.out.println("Enter the first number");
	firstNumber = input.nextInt();

	System.out.println("Enter the second number");
	secondNumber = input.nextInt();


	if (firstNumber == firstNumber){
	System.out.print(0);
	}
	else if(firstNumber > secondNumber){
	System.out.print(1);
	}
	else{
	System.out.println(-1);

	}


}


	
}