import java.util.Scanner;

public class NokiaCallCenter{

public static void main(String... args){


String welcomeMessage = """ 
Hello
Welcome to your Nokia phone
your companion that shares your life outlook.

Every minutes is vibrant and every day is adventure, enjoy every moments!!!
press

1 -> To Search
2 -> For Service Nos
3 -> To Add name 
4 -> To Erase
5 -> To Edit
6 -> To Assign tones
7 -> To Send b'cards
8 -> For Options
9 -> For Speed dials
10 -> For Voice Mails

""";
Scanner welcomeNokiaInput = new Scanner(System.in);
int userInput = welcomeNokiaInput.nextInt();
System.out.println(welcomeMessage);


switch(welcomeNokiaInput){

case 1 -> System.out.println("Search");

case 2 -> System.out.println("Sevice Nos");

case 3 -> System.out.println("Add name");

case 4 -> System.out.println("Erase");

case 5 -> System.out.println("Edit");

case 6 -> System.out.println("Assign tones");

case 7 -> System.out.println("Send b'cards");

case 8 -> System.out.println("Options"){
break;
case -> System.out.println("Type of view");
break;
case -> System.out.println("Memory status");

}
case -> System.out.println("Speed Dials");
case -> System.out.println("Voice mails");

default -> System.out.println("End the call");
}


}




}