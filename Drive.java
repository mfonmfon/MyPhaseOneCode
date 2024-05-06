
public class Drive{
	
	public static void main(String... args){
		
		
	}
	public static int[] numbersOfArray(int[] arrays){
		int[]  numbers = new int[0];
		int nada = 0;
			for(int counter = 0; counter < arrays.length; counter++){
				
				if (arrays[nada] % 2 == 0){
					arrays[counter] = nada;
					
					
				}
			}
			return numbers;
		
	}
	
	
	public static int[] oddIndex (int arr){
		int[] num = new int[0];
		int n = 0;
		
		for(int counter = 0; counter < arr.length; counter++){
			if(arr[counter] % 2 == 1){
				arr[counter] = num;
				
				
			}
			return num;
		}
	
	
	
	
}
	
}


