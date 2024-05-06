import java.util.Scanner;
public class DrillTaskTwo{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	int total = 0;
	int counter = 0;


	while(counter <= 9){

	System.out.println("Enter score: ");
	int score = scan.nextInt();
	
	total = total + score;

	counter =  counter + 1;

	}

	int average = total / 10;

	System.out.printf("The average is " + average, "\n");
	System.out.print("the total is " + total);

	
	
}



}