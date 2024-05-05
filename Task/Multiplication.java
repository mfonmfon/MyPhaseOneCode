import java.util.Scanner;
public class Multiplication{


	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the first natural numbers");
	int sum = scan.nextInt();
	

	for(int num = 1; num <= 10; num++){

        num = sum + num;

	System.out.println("the sum of " + num  + " is " + num );
		}


	}

}