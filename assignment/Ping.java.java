import java.util.Scanner;

public class Ping{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
        
	System.out.println("Enter the number in square meters: ");
	double number1 = scanner.nextDouble();


	double squareMeters = 0.3025;
	
	double Ping = squareMeters * number1;

	System.out.printf("Ping is %d%n", Ping);

	

	
	 

}


}