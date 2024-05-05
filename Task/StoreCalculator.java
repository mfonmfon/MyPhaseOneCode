import java.util.Scanner;

public class StoreCalculator{



	public static void main(String... args){

	Scanner scan = new Scanner(System.in);


	System.out.println("Welcome to E-Store");

	System.out.println("Please enter Customer Name: ");
	String name = scan.nextLine();

	int counter = 0;
	double originalCost = 0;
	double discount = 10;


	while(counter < 10){

	System.out.println("Please enter cost for items: ");
	double item = scan.nextDouble();

	originalCost += item;
	counter = counter + 1;
	
	}

	double discountAmount = originalCost * discount/100;
	double discountPercentage =  originalCost - discountAmount;
	
	if(discountPercentage >= 200){
	System.out.println(discountPercentage);
		
	}
	//else{
	//System.out.println("no discount added");
	//}
	
	


	System.out.printf("Customer Name: %s%n", name);
	System.out.println("<***************************>");
	System.out.printf("Original cost: " + originalCost + "\n");
	System.out.println("<***************************>");
	System.out.printf("Discount cost: " + discountPercentage + "\n");
	System.out.println("<***************************>");
	System.out.println("Thank you for your patronage");
	System.out.println("<***************************>");




}
}