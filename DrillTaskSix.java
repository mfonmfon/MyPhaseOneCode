import java.util.Scanner;
public class DrillTaskSix{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	int total = 0;
	int counter = 1;


	while(counter <= 10){

	System.out.println("Enter score: ");
	int score = scan.nextInt();
	
	total = total + counter;

	counter =  counter + 1;

	int average = total / 10;

	System.out.print("The average is, " + average);

	}

	


	}

	

	
	
}



}