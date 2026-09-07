// Write a Python program to create a list of tuples with the first element as the number and second element 
// as the square of the number. 
import java.util.List;
import java.util.ArrayList;
public class Assignment3SETB2 {
public record NumberSquare(int number,int square){}
 public static void main(String[] args) {
     int start = 1;
     int end = 5;
 List<NumberSquare> Squaretupple = new ArrayList<>();

for(int i=start;i<=end;i++){
    Squaretupple.add(new NumberSquare(i,i*i));

}

for(NumberSquare tupple:Squaretupple){
    System.out.println("("+tupple.number()+", "+tupple.square()+")");
    
}

 }
 

    
}
 