import java.util.Scanner;


public class AutoMobile{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int gallonUsed = 0;
	int milesDriven = 0;
	int milesPerGallon = 1;

	System.out.println("Enter the gallons");
	milesDriven = input.nextInt();


	while (milesPerGallon == 10) {

	

	gallonUsed = gallonUsed + milesDriven;

	milesPerGallon = milesPerGallon + 1; 


	System.out.println("Enter the (-1 miles or quit)");
	milesPerGallon = input.nextInt();

}

	if (milesPerGallon != 0) {

	double overAllTrip = (double)  gallonUsed / milesPerGallon;


	System.out.printf ("%n Total of the tankful is %d%n", milesPerGallon, gallonUsed);
	
	
}
else{
System.out.println(" tankful was not measured appropriately");

}





}

}