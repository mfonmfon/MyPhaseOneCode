
import java.util.Scanner;
public class TaskFive{

	public static void  main(String... agrs){
	Scanner scan = new Scanner(System.in);

	int[] oddNumbers = {1, 2, 3, 4, 5, 6, 7, 8};

	int[] result = isOdd(oddNumbers);

	System.out.println(result);

	}

	
	public static int[] isOdd(int[] oddNumbers){

	
	for(int i = 0; i < oddNumbers.length; i++){
		
		if(i % 2 == 0){
			System.out.printf("%3s%s ", oddNumbers[i], " ,");
		}
		
	}
	return oddNumbers;
	

	}


}