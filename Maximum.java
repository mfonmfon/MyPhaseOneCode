public class Maximum{


	public static int getMaximumNumber(int[] array){
		int largestNumber = array[0];

		for(int index = 0; index < array.length; index++){
			
			if(array[index] > largestNumber){

				array[index] = largestNumber;

			}

		}	 
	
		return largestNumber;
	}

}