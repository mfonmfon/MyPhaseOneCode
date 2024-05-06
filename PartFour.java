import java.util.Scanner;
public class PartFour{

	public static void main(String... args){
	
	Scanner scan = new Scanner(System.in);
	
	String[] studentNames = new String[5];
	int[] studentGrades = new int [5];
	int total = 0;
	double average = 0;
	int grade = 0;
	for(int counter = 0; counter < 5; counter++){

	System.out.print("Enter Student Names: ");
	String name = scan.next();

	System.out.print("Enter Student Grade: ");
	grade = scan.nextInt();
	
	
	studentNames[counter] = name;
	studentGrades[counter] = grade;
	
	}
		for(int counter = 0; counter < 1; counter++){
			total = total + grade;
			average = total  / 5;
			
			
		}
			System.out.println("The total number of grades is," + total);
			System.out.println("the average scores " + average);
	}


}