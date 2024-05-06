import java.util.ArrayList;
import java.util.Scanner;
public class PartTwo{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	int[] age = new int[5];

	for(int counter = 0; counter < 5; counter++){

	System.out.println("Enter age: ");
	int userAge = scan.nextInt();

	 age[counter] = userAge;
	}
	for(int counter = 0; counter < 5; counter++){
	System.out.println(age[counter]);

	}
	
	}


}