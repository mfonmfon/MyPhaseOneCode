import java.util.Scanner;

public class Klass{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);


System.out.println("Enter a positive number");
int userInput = scanner.nextInt();


int factor = 0;
int counter = 0;


while(counter <= userInput){
 
if(userInput % counter == 0){
factor = factor + 1;

}
counter = counter + 1;
}
System.out.print(factor);
}
}
System.out
}
}