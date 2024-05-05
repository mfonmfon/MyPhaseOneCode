//this is the fifth questions of chi assignment




import java.util.Scanner;

public class KeyNumber{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);


	System.out.println("Enter the first number");
	int firstNum = scan.nextInt();

	System.out.println("Enter the second number");
	int secondNum = scan.nextInt();

	int result = firstNum * secondNum;

	System.out.println(result);	

}

}