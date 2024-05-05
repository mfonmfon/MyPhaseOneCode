//import java.util.Arrays;

public class Array {
  public static void main(String... args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    int minimum = minimmumNumber(array);
    System.out.println(minimum);

  }

  public static int minimmumNumber(int[] numbers){
    int minimum = 0;

    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] < minimum){
        minimum = numbers[i];


      }

      return minimum;

  }
}
