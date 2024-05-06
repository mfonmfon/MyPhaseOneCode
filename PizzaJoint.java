import java.util.Scanner;
import java.util.ArrayList;

public class PizzaJoint {

  public static void main(String... args) {

    Scanner pizza = new Scanner(System.in);

    ArrayList<String> type = new ArrayList<String>();
    ArrayList<Integer> slice = new ArrayList<Integer>();
    ArrayList<Integer> boxes = new ArrayList<Integer>();
    ArrayList<Integer> price = new ArrayList<Integer>();


    int pizzaQunatity = 0;
    int numberOfslices = 0;


    
    System.out
        .println("Welcome to Iya Affeez Pizza Joint Ajegunle  follow the instructions to order your delicious pizza.");
    // String typeOfPizza = " ";
    System.out.println();
    System.out.println();

    System.out.print("How many guest are you expecting at your event? ");
    int numberOfGuest = pizza.nextInt();

    System.out.println("What type of pizza do you want to buy?");
    String typeOfPizza = pizza.next();

    int[][] pizzaBox = new int[pizzaQunatity][numberOfslices];

    for(int i = 0; i < pizzaBox.length; i++ ){

      System.out.println("Number of ")

      if(typeOfPizza.equals("Odogwu")){
        
      }

    }



  }

}