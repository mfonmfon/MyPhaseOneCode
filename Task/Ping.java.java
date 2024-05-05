import java.util.Scanner;

public class EnergyCounter{

	public static void main(String [] arg) {

	Scanner scanner = new scanner(System.in);

	System.out.println("Enter the amount of water in kilogram");
	int amountOfWater = input.nextInt();

	System.out.println("Enter the intital temperature");
	int initialTemperature = input.nextInt();


	System.out.println("Enter the final temperature");
	int finalTemperature = input.nextInt();

	int energy = amountOfWater * (initialTemperature - finalTemperature) * 4184;
	System.out.println("%s%d," energy);
	}
}