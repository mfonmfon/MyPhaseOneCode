import java.util.Scanner;

public class CustomerCare{


public static void main(String... args){


String prompt = """

Hello, Welcome to Semicolon Customer care
press

1 -> For English
2 -> For Pigin
3 -> For Hausa
4 -> For Yoruba

 """;


System.out.println(prompt);

Scanner askMeInput = new Scanner(System.in);
int userInput = askMeInput.nextInt();

switch(userInput){
case 1 -> System.out.println("English");

case 2 -> System.out.println("Pigin");

case 3 -> System.out.println("Hausa");

case 4 -> System.out.println("Yoruba");

default -> System.out.println("End the call");


}


String con = """ 
1 -> To Apply for software engineering course
2 -> For Enquiry 
3 -> Talk to a semicolon customer care

""";
System.out.println(con);
int enquireInput = askMeInput.nextInt();


switch(enquireInput){

case 1 -> System.out.println("To Apply for software engineering course");

case 2 -> System.out.println("For Enquire");

case 3 -> System.out.println("Talk to a semicoln customer care");

default -> System.out.println("Next time");

}
String pal = """ 
1 -> For full-stack engineering

2 -> For frontend engineering
3 -> For backend engineering

""";
System.out.println(pal);
int optionInput = askMeInput.nextInt();
int call = askMeInput.nextInt();


switch(optionInput){

case 1 ->{
 System.out.println("For full-stack engineering ");
    switch(call){
     case 1-> System.out.println("Last call cost");
     case 2-> System.out.println("Last call cost");
}
}
case 2 -> System.out.println("For frontend engineering");

case 3 -> System.out.println("For backend engineering");

default -> System.out.println("my bro, you need help !!!");
}



}
}