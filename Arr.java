import java.util.Scanner;
public class Arr{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Hello there! Enter your credit card number");
	String userInput = scan.next();
	//.length()

	int cardResult = 0;
	int visaCard = 0;
	int masterCard = 0;
	int total = 0;
	int[] numbers = new int[16];
	
	
	for(int counter = 0; counter < numbers.length;  counter++){
	visaCard = numbers[counter];
	cardResult = visaCard * 2;

	System.out.println(visaCard );
	}	
	if(cardResult % 10 || cardResult < 13 || cardResult > 16){
		System.out.print("Valid visa card  \n");
	}else{
		System.out.println("Invalid Visa Card");
	}

	
	for(int counter = 0; counter < numbers.length; counter++){

	masterCard = numbers[counter];

	total = masterCard * 2;
	}
	if(total % 5 == 1 || total % 7 == 1){
		System.out.println("Valid MasterCard");
	}
	}


}