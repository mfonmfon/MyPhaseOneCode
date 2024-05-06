public class Minimum{

	public static int getMinimumValue(int[] array){
		int lowest = array[0];
		for(int index = 0; index < array.length; index++){
			if(array[index] < lowest){
				lowest = array[index];
			}
		}
		return lowest;
	}

}