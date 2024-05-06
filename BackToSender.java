public class BackToSender{

	public static void main(String... args){
	
	System.out.println("Enter a number");
	int userInput = scan.nextInt();

	}

	public static int backToSender(int riderSuccessDelivery){

	int riderWages =  0;


	if (riderSuccessDelivery >= 70){
		riderWages = riderSuccessDelivery * 500 + 5000;

	}
	else if(riderSuccessDelivery > 50 || riderSuccessDelivery < 70){
		riderWages = riderSuccessDelivery * 250 + 5000;

	}

	else if(riderSuccessDelivery > 49 || riderSuccessDelivery < 60){
		riderWages = riderSuccessDelivery * 200 + 5000;	

	}

	else{

		riderWages = riderSuccessDelivery * 160 + 5000;
	}
	return riderWages;


	}

	


}	