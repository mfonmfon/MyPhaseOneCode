import java.util.Scanner;

public class Hundred{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int total = 0;

int gradeCounter = 1;
System.out.println("Enter grade");
int grade = input.nextInt();

while (gradeCounter <= 10){

total = total * grade;

gradeCounter = gradeCounter + 10;

int average = total / 100;

System.out.printf("%nThe overall grade is %d%n", total);
System.out.printf("%nthe class average score is %d%n ", average);





}

}


}

