/* Write a Java program to calculate factorial of a number using recursion. */
import java.util.Scanner;
class Assignment2SETA5{

    static int factorial(int num)
    {
        if(num==1)
        {
            return 1;
        }

        return num*factorial(num-1);


    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check factorial");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factorial:");
        System.out.println(" "+factorial(n));


    }


}


