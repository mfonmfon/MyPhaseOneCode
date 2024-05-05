import java.util.Scanner;

public class Powa{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);


	System.out.println("Enter a factorial number");
	int bord = scan.nextInt();
	
	int call = 0;
	int fact = 1;

	while(fact <= bord){
	fact = fact * bord;
	call = call + 1;

	
	}
	fact++;
	System.out.printf("the factorial number is %d ", fact);
	}

}