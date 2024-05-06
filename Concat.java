import java.util.Scanner;

public class Concat{

	public static void main(String... args){
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Price: ");
	int price = scan.nextInt();

	System.out.println("Discount: ");
	double discount = scan.nextInt();
	
	
	price = 60;

	double total = price - discount / 10;

	System.out.println(total);
	




}


}