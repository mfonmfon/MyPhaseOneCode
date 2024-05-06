import java.util.Scanner;

public class PartThree{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	String[] studentNames = new String[5];
	int [] studentGrades = new int[5];


		for(int counter = 0; counter < 5; counter++){

		System.out.print("Enter Student name: ");
		String name = scan.next();
		
		System.out.print("Enter Student Grade: ");
		int grade = scan.nextInt();


		studentNames[counter] = name;
		studentGrades[counter] = grade;

		}
		
		for(int counter = 0; counter < 5; counter++){
		System.out.println(studentNames[counter]);
		System.out.println(studentGrades[counter]);
		
		
		}
	}


}