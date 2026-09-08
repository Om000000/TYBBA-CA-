/* Define an Interface “Integer” with a abstract method check().Write a Java program to check whether 
a given number is Positive or Negative. 
 */
import java.util.Scanner;
interface Integer {
    public void check(int num);
}
class Number implements Integer{
    public void check(int num){
        if(num>0){
            System.out.println("Positive number");
        }
    
        if(num<0){
            System.err.println("Number is negative");
        }
    }
}
public class Assignment3SETA3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    Number n=new Number();
    n.check(num);
}
    

}
