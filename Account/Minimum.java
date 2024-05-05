public class Maximum{

	public static int getMaximumValue(int[] array){
	int total = array[0];
	
	for(int i = 0; i < array.length; i++){
		if(array[i] > total){

			total = array[i];
		}

	return total;
	}
	
	}


}