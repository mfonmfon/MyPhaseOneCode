
import java.util.Scanner;

public class SubGrade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out
                .println("Welcome to Semicolon,  please follow the instructions to check the grades of each student ");
        System.out.println();
        System.out.println();

        int student;
        int subject;

        System.out.println("Enter the number of students");
        student = scan.nextInt();

        System.out.println("Enter the number of subjects");
        subject = scan.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully");
        System.out.println();

        int[][] grades = new int[student][subject];

        for (int i = 0; i < student; i++) {
            System.out.printf("Enter score for student " + (i + 1) + " ");
            System.out.println();

            for (int j = 0; j < subject; j++) {

                System.out.printf("Enter score of subject ", (1 + j), "\n", " ");
                grades[i][j] = scan.nextInt();

                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved Successfully");
                System.out.println();
                System.out.println();

            }
        }
        System.out.println(
                "=======================================================================================================================");
       //System.out.print("STUDENT   ");
        int total = 0;

        // System.out.println(

        for (int i = 0; i < student; i++) {
            //System.out.print(" " + "SUB" + (1 + i) + "\t ");
             System.out.printf("%s\t %s \t  ", "STUDENT", "SUB1", 1 + i + " ");


            for (int j = 0; j < grades.length; j++) {

            
                total = total + grades[i][j];

                for (j = 0; j < subject; j++) {

                    System.out.printf("%-10s\t", "\nStudent " + (j + 1 + "  ") + grades[i][j] + " ");
                }
                double average = (double) total / subject;
            }

        }
    }
}