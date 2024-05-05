import java.util.Scanner;

public class NaturalNumbers{

	public static void main(String... args){
	Scanner scan = new Scanner(System.in);
	int total = 0;

	for(int counter = 0; counter <= 10; ++counter){


	System.out.println("sum of 10 natural numbers");
	total = scan.nextInt();

	 int sum = counter + total;
	
	System.out.println(sum);
	
	}	
	
	

}

}