import java.util.Scanner;

public class GasMileage{


	public static void main(String[] args){
	
	Scanner scanner;
	new Scanner(System.in);


	int account;
	int oldbalance;
	int charges;
	int credit;
	creditLimit;
	newBalance;


	system.out.print("\n Enter your account number\n");
	int account = input.nextInt();


	while (account != 1){


	System.out.print("Enter your new balance");
	int oldBalance = input.nextInt();

	System.out.print("Enter charges:");
	int charges = input.nextInt();

	System.out.print( " Enter credit" );
	int credit = input.nextInt();

	System.out.Print( "Enter creditLimit" );
	int creditLimit = input.nextInt();

	newBalance = oldBalance + creditLimit - credit;
	System.out.println("new balance is %d\n, new Balance");

	if (newBalance > credit){
	System.out.println("Baba your credit limit is exceeded: ");

	System.out.println("\n Enter account number (or -1 to quit):");

}
}
}
}