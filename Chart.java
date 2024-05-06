import java.util.Scanner;

public class Chart{

	public static void main(String... args){
	
	int total = 0;
	

	Scanner scan = new Scanner(System.in);

	System.out.println("Type the first value betwwen 1 and 30");
	int bar1 = scan.nextInt();

	System.out.println("Type the second value between 1 and 30");
	int bar2 = scan.nextInt();

	System.out.println("Type the third value between 1 and 30");
	int bar3 = scan.nextInt();
	
	System.out.println("Type the fourth value between 1 and 30");
	int bar4 = scan.nextInt();

	System.out.println("Type the fifth value between 1 and 30");
	int bar5 = scan.nextInt();


	for(int count = 0; count <= bar1; ++count){
	
	total = total + bar1;

	System.out.println(" * ");
	
	for(int j = 0; j <= bar2 - bar1; ++j){

	total = total + bar2;
	
	System.out.println(" * ");
	
	}
	
	}

	




}
}