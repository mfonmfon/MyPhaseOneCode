import java.util.Scanner;
public class KataMain{
	
	public static void main(String... args){

	Scanner scan = new Scanner(System.in);


	System.out.println("Enter first number");
	boolean number = scan.nextBoolean();

	
	if(number % 2 == 0){
		System.out.println("true");


	}else{
		System.out.println("false");
	}

	
	}


}