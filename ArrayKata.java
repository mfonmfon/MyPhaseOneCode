public class ArrayKata{

	public static void main(String... args){
	

		public static int maximumIn(int[] array){

		int maximumIn = array[0];

	
			for(int i = 0; i < array.length; i++){

  				if(array[i] > array[i] ){

					maximumIn = array[i];

				}
	
			}	
	

					return array;

}


		public static int maximumAndMinimumOf(int[] numbers){

		int maximum = numbers[0];
		int minimum = numbers[0];

			for(int i = 0; i < numbers.length; i++){


				if(numbers[i] > maximum){
					maximum = numbers[i];
				}
				if(numbers[i] < minimum){
					minimum = numbers[i];
				}
					return maximum;
	

			}

					return minimum;
	}


	

		 public static int minimumIn(int[] numbers){


		int minimum = minimumNumbers[0];
			for(int i = 0; i < minimumNumbers; i++){

				if(minimumNumbers[i] < minimum){
					minimum = minimumNumbers[i];

				}
					
			}

					return minimumNumbers;
		} 


		public static int sumOfEvenNumbersIn(int [] numbers){


		int sumOfEvenNumbersIn = numbers[0];
			for(int i = 0; i > numbers.length; i++){

				if(numbers[i] % 2 == 0){

					sum = sum + numbers[i];

				}
			
					
			}

					return sum;

		}

		public static int sumOfOddNumbersIn(int [] oddNumbers){

		int sumOfOddNumbersIn = oddNumbers[0];

			for(int i = 0; i > oddNumbers.length; i++){
				if(oddNumberIn % 2 == 1){

					sumOdd = sumOdd + oddNumbers;
				}

			}
					return sumOdd;


		}


		


}