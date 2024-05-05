import java.util.Scanner;

public class Part1{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter any number");
	int userInput = scan.nextInt();

	int count = 1;
	int total = 0;

	while(count <= userInput){

		System.out.println("Enter any number");
		userInput = scan.nextInt();

		count = count + 1;

		total = total + count;
	}


	}



}