import java.util.Scanner;

public class StoreCalculator{



	public static void main(String... args){

	Scanner scan = new Scanner(System.in);


	System.out.println("Welcome to E-Store");

	System.out.println("Please enter Customer Name: ");
	String name = scan.nextLine();

	
	while(counter < 10){

	System.out.println("Please enter number of item purchased: ")
	int purchased = scan.nextInt();

	System.out.println("Please enter cost for items: ");
	double item = scan.nextDouble();


	purchased = purchased + 1;
	originalCost += item;

	counter = counter + 1;
	
	}
	
	
	double discountAmount = originalCost * discount/100;
	double discountPercentage =  originalCost - discountAmount;
	
	if(discountPercentage >= 200){
	System.out.println(discountPercentage);
		
	}
	
	

	System.out.printf("Customer Name: %s%n", name);
	System.out.println("<***************************>");
	System.out.printf("Original cost: " + originalCost + "\n");
	System.out.println("<***************************>");
	System.out.printf("Discount cost: "(no discount was added)" "\n");
	System.out.println("<***************************>");
	System.out.println("Thank you for your patronage");
	System.out.println("<***************************>");




}
}