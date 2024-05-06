import java.util.Scanner;


public class StoreCalculator2{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to E-Store");

		System.out.println("Please enter Customer Name: ");
		String name = scan.nextLine();
	
		System.out.println("Enter number of item purchased");
		int purchased = scan.nextInt();

			System.out.println("Please Enter percentage discount: ");
			int discount = scan.nextInt();


				int counter = 0;
				int total = 0;


					while(counter >= 10){

					System.out.println("Please Enter cost for item");
					int item = scan.nextInt();

					int originalCost = originalCost + item;

					counter = counter + 1;		
					}

					double discountAmount = originalCost * discount / 100;
					double discountPercentage =  originalCost - discountAmount;
	
						if(discountPercentage >= 200){
							System.out.println(discountPercentage);
		
	}

	

}

}