/* Write a Java program to display Fibonacci series using function. */
import java.util.Scanner;
public class Assignment2SETA2 {
    public static void Fibo(){
        int a=0;
        int b=1;
        int c;
        System.out.println("Enter the range till where you want to check fibonesis series:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println("a:"+a);
            c=a+b;
            a=b;
            b=c;
            
        }


    }
    public static void main(String[] args) {
       Fibo();
    }


}