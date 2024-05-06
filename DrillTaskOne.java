import java.util.Scanner;
public class DrillTaskOne{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	int total = 0;
	int counter = 0;

	while(counter <= 9){

	System.out.println("Enter score:  ");
	int scores = scan.nextInt();
	
	
	
	total = scores + counter;
	System.out.print(total);
	
	counter += 1;

	}
	
	}



}