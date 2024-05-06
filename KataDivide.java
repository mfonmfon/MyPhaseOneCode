import java.util.Scanner;
public class KataDivide{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the first number");
	int firstNum = scan.nextInt();

	System.out.println("Enter the first number");
	int secondNum = scan.nextInt();

	float div = firstNum / secondNum;
	System.out.println(div);

	if (secondNum == 0){
	System.out.println(secondNum);

	}
	


	}

}