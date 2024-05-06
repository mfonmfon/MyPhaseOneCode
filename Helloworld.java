import java.util.Scanner;
public class HelloWorld{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int firstNumber;
int secondNumber;

System.out.println("Enter the first number");
firstNumber = input.nextInt();

System.out.println("Enter the second number");
secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;


int product = (firstNumber * secondNumber);

double average = (double) firstNumber / 2;

System.out.printf("the sum of %d%s%d%s%d%n", firstNumber, " and ", secondNumber, " is ", sum);
System.out.printf("the product of %d%s%d%s%d%n", firstNumber, " and ", secondNumber, " is ", product);
System.out.printf("the average of %d%s%d%s%.1f%n", firstNumber, " and ", secondNumber, " is ", average);


}

}