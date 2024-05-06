import java.util.Scanner;

public class Main{


public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	int total = 0;
	int gradeCounter = 0;

	System.out.println("Enter the grade or -1 to quit");
	int grade = input.nextInt();

	while (gradeCounter != -1) {

	total = total + grade;
	gradeCounter = gradeCounter + 1;

	System.out.println("Enter the grade or -1 to quit");
	grade = input.nextInt();

}


	if (grade != 0){
	double average = (double) gradeCounter / total;
	System.out.printf("%n the average grade is %d%s", gradeCounter, total);
	System.out.printf("the class average is %.2f%s", average);


}
	else {
	System.out.println("No grades were enterd");
}

}
}