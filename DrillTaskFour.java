import java.util.Scanner;
public class DrillTaskFour{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	int total = 0;
	int counter = 1;


	while(counter <= 9){

	System.out.println("Enter score: ");
	int score = scan.nextInt();
	
	total = total + counter;

	counter =  counter + 1;

	if(counter % 2 == 0){
	System.out.println(counter);

	}


	}

	//System.out.print(total);

	
	
}



}