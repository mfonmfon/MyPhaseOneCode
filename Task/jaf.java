import java.util.Scanner;

public class Jaf{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the price");
	double price = scan.nextInt();


	System.out.println("Enter the discount amount");
	double discount = scan.nextInt();

		
	double totalAmount = price - discount / 2;

	System.out.println("The price after discount is " + totalAmount);


	}

}