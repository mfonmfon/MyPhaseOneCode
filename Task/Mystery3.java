public class Mystery3{

public static void main(String[] args){

int row = 20;

while (row >= 1){
int column = 5;


System.out.print(row % 2 == 0 ? "x" : "O");
++column;

}


--row;
System.out.println();

}




}