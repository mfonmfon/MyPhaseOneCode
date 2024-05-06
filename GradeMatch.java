import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeMatch{
	
	
	public static void main(String... args){
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> pizzaType = new ArrayList<String>();
		ArrayList<Integer> guest = new ArrayList<Integer>();
		
		
		System.out.print("How many guest are you expecting at your event:   ");
		int numberOfGuest = scan.nextInt();
		
		System.out.print("What type of pizza do you want:   ");
		String typeOfPizza = scan.next();
		
		for(int i = 0; i < numberOfGuest.size(); i++){
			
			
			System.out.println("How many boxes of pizza do you want to buy:  ");
			int boxesOfPizza = scan.nextInt();
			
			System.out.println("How many slices:  ");
			int slice = scan.nextInt();
			
			System.out.println("How much do you have to pay:  ");
			int price = scan.nextInt();
			
			
		}	
		
		
		
		
		
		
	}
}