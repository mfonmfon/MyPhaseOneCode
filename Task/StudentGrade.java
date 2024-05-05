import java.util.Scanner;

public class StudentGrade{

public static void main(String... args){

Scanner input = new Scanner(System.in);



String name = """
 press 

1: for menue
2: to exit


""";


int userInput = input.nextInt();
System.out.println(name);
switch(userInput) {

case 1 -> System.out.println("menue");
break;
case 2 -> System.out.println("exit");
break;
}





System.out.print("Enter first number");
int firstNumber = input.nextInt();



System.out.print("Enter first number");
int secondNumber = input.nextInt();



int studentGrade = firstNumber + secondNumber;


if (studentGrade >= 100){
System.out.println(name, + " you passed by A");

}
else if (studentGrade >= 70){
System.out.println(name, + " you passed by B");

}
else if (studentGrade >= 50){
System.out.println(name, + "you passed by C");

}
else{
System.out.println(name, "you failed this semester");
}




}



}