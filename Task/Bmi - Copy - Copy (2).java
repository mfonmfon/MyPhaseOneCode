import java.util.Scanner;

public class Bmi{

	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
	

	System.out.println("Enter the weight in pounds");
	double weight = scanner.nextDouble();

	System.out.println("Enter the height in inches");
	int height = scanner.nextInt();

	double constantValueForConvertingToKilogram = 0.4535925;
	double constantValueForConvertingToMeter = 0.0254;

	double weightInKilogram = weight * constantValueForConvertingToKilogram;
	double heightInMeter = height * constantValueForConvertingToMeter;

	double Bmi = weightInKilogram/(height * height);

	System.out.printf("Bmi is %2f",Bmi);

	}
}