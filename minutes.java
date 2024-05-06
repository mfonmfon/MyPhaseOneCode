import java.util.Scanner;

public class minutes{

	public static void main(String[] args) {


	Scanner scanner = new Scanner (System.in);

	System.out.print("Enter the minutes:");
	int maximumNumbersOfYears = scanner.nextInt();


	int year = 365;

	int minutes  = year * maximumNumbersOfYears;

	System.out.printf("minutes is %d%n", minutes);



}




}