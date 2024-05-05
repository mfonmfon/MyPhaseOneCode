public class Array{

public static void main(String... args){

int[] array = {1, 2, 4, 67, 32};

System.out.printf("%s%8s%n", "Index", "Value");

for(int counter = 0; counter < array.length; counter++){

System.out.printf("%5%8d%n", counter, array[counter])


}

}
}