
/* 2. Write a java program to check whether given candidate is eligible for voting or not. Handle
user defined as well as system defined Exception. */

import java.util.InputMismatchException;
import java.util.Scanner;

class votingageexception extends Exception{
    public votingageexception(String message){
    super(message);
    }    
}

class votingsystem{
    public static void checkEligibility(int age) throws votingageexception{
        if(age>=18){
            System.out.println("Your eligible for voting");
        }
        else{
            throw new votingageexception("Underage for voting");
        }
    }
}



public class Assignment4SETA2{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        
        
        try {
            int userAge=sc.nextInt();
            System.out.println("Checking voting eligibility for age: " + userAge);
            votingsystem.checkEligibility(userAge);
        } 
        catch (votingageexception e) {
        System.out.println("caught custom exception:"+e.getMessage());
        
        
        
        }
        catch(InputMismatchException v){
            System.out.println("predefined exception invalid input");
        }


    }

}