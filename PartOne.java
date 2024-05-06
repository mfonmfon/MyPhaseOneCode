import java.util.Scanner;

public class PartOne{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);
	
	String [] userNames = new String [5];


	for(int counter = 0; counter < 5; counter++){

	System.out.println("Enter your name");
	String name = scan.nextLine();

	userNames[counter] = name;
	}
	for(int counter = 0; counter < 5; counter++){
	System.out.println(userNames[counter]);

	}
	

	
	


}

}