import java.util.Scanner;

public class Employees{

public static void main(String [] args){


Scanner input = new Scanner(System.in);


 double pay;
 double hours;
 double rate; 
 int count = 1;


while ( count <= 3 ) {
System.out.print( "Enter hourly rate: " );
rate = input.nextDouble();

System.out.printf( "Enter hours worked: " );
hours = input.nextDouble();


if ( hours > 40 ){
pay = ( 40.0 * rate ) + ( hours - 40 ) * ( rate * 1.5 );
 }
else{
 pay = (hours * rate);
}
System.out.printf( "Pay for Employee %d is $%.2f\n",count, pay );







}


}




}