import java.util.Scanner;

public class FindNumber {

	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);

		int largestValue = 0;

		int numberCounter = 0;

		int smallestValue = 0;

		System.out.println("Enter any largest and smallest number");
		int num = scan.nextInt();

		while (numberCounter <= 5) {

			largestValue = largestValue + num;

			numberCounter = numberCounter + 1;

			System.out.println("Enter any large number");
			num = scan.nextInt();

			System.out.println("Enter any small number");
			num = scan.nextInt();

		}
		numberCounter++;

		smallestValue = largestValue + numberCounter;

		System.out.printf(
				" the largest number you've entered is " + largestValue + " and the smallest number is " + smallestValue);

	}
}