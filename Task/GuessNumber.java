import java.util.Scanner;

public class GuessNumber{


public static void main(String...args){

Scanner scanner = new Scanner(System.in);


int luckyNumber1 = 0;
int luckyNumber2 = 1;
int counter = 0;




System.out.println("How many times do you want to play?");
int playTime = scanner.nextInt();

System.out.println("Enter either 0 or 1");
int userInput = scanner.nextInt();

while(counter < playTime){

counter = counter + 1;

  if (luckyNumber1 == 1 ){
System.out.println("0");


 if(luckyNumber2 <= 0)
System.out.println("1");
}

}

}
}