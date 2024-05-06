import java.util.Scanner;
public class DrillTaskFive{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	int total = 0;
	int counter = 1;


	while(counter <= 9){

	System.out.println("Enter score: ");
	int score = scan.nextInt();
	
	total = total + counter;

	counter =  counter + 1;

	if(counter % 3 == 1){
	System.out.println(score);

	}

	

	}

	

	
	
}



}