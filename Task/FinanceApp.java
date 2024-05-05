import java.util.Scanner;

public class FinanceApp{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter your interest rate");
	double annualInterestRate = input.nextDouble();

	System.out.println("Enter your balance");
	double balance = input.nextDouble();


	double interest = balance * (annualInterestRate/1200);

	System.out.println("interest is 2.91667");



	}






}