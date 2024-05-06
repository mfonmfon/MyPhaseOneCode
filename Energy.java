import java.util.Scanner;

public class Energy{


	public static void main(String [] arg) {



	Scanner input = new Scanner(System.in);



	System.out.println("Enter the amount of water in kilogram");
	int amountOfWater = input.nextInt();

	System.out.println("Enter the intital temperature");
	int initialTemperature = input.nextInt();


	System.out.println("Enter the final temperature");
	int finalTemperature = input.nextInt();

	int energy = amountOfWater * (initialTemperature - finalTemperature) * 4184;
	System.out.printf(" energy is %s%d, energy");
	}
}