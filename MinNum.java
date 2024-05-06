public class PractEvenAndOddNumber{
	
	public static int[] returningMini(int[] array){
		int[] number ;
		number = new int [array.length];
		for(int counter = 0; counter < array.length; counter++){
			if(array[counter] % 2 != 0){
				number[counter] = 1;
			}
		}
		
		return number;
		
	}




}