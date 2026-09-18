/* Write a Java program to calculate power of a number using recursion. */
import java.util.Scanner;
class Assignment2SETA1{


static int pow(int num,int power){
   if(power==0)
   {
    return -1;
   }
   if(power==1)
   {
    return num;
   }

   return num*pow(num,power-1);


}


public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=scan.nextInt();
    System.out.println("Enter the power of a num:");
    int power=scan.nextInt();
    int result=pow(num,power);
    System.out.println(result);


}




}