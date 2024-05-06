import java.util.Scanner;

public class Mod{

	public static void main(String... args){


	Scanner scan = new Scanner(System.in);

	int gradeCounter = 0;
	int total = 0;


	System.out.println("Enter grade or -1 to quit");
	int grade = scan.nextInt();


	while(grade != -1){
	total = total + grade;
	gradeCounter = gradeCounter + 1;


	System.out.println("Enter grade or -1 to quit");
	grade = scan.nextInt();


	}

	if( gradeCounter != 0 ){
	double average = (double) total / gradeCounter;

	System.out.printf("%d%n the total class is  ", total, gradeCounter);
	System.out.printf("class average is %.2f%n ",  average);

	}
	else{
	System.out.println("no grade were found");
	}
	

	}

}