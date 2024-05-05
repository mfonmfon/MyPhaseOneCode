import java.util.Scanner;
public class Bout{


	public static void main(String... args){



	Scanner scan = new Scanner(System.in);


	System.out.println("Enter a positive whole number");
	int prompt = scan.nextInt();

	for(int table = 1; table < prompt; table++){

	int sum = prompt * table;

	System.out.println(prompt + " * " + table + " is " + sum);
	}

	

}
}