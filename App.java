import java.util.Scanner;
public class App{

	public static void main(String... args){


	Scanner scan = new Scanner(System.in);


	System.out.println("Enter the miles ");
	int milesDriven = scan.nextInt();


	int counter = 0;

	while(counter <= milesPerGallons){
	
		System.out.println("Enter the miles ");
		milesDriven = scan.nextInt();

		System.out.println("Enter the gallons used");
		int gallonUsed = scan.nextInt();

		double milesPerGallons = milesDriven + gallonUsed;
		double average = milesPerGallons / 100;

		System.out.println("The miles driven is " + "\n"+ milesPerGallons);
		System.out.println("The average that calculated is " + "\n" + average);

		counter = counter + 1;
	}

		





	}

}