import java.util.Scanner;

public class Prompt{

public static void main(String...args){


Scanner scanner = new Scanner(System.in);

int counter = 0;
//int luckyNumber;

	System.out.println("Welcome to binary hub");

	System.out.println("How many times would you want to play?");
	int luckyNumber = scanner.nextInt();
	
	while(counter < luckyNumber){


	
	System.out.println("Enter either 0 or 1");
	int userInput = scanner.nextInt();
	
	
	if(userInput == 1){
	System.out.println("0");

	}


	if(userInput == 0){
	System.out.println("1");
	}
	counter++;

}




}


}