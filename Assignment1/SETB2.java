/* Write a java program to accept n city names and display them in ascending order. */

import java.util.Scanner;


class SETB2{

public static void main(String args[])
{
int n;
System.out.println("Enter number of nums you want to enter");
Scanner scan=new Scanner(System.in);
  n=scan.nextInt();
  int[] number=new int[n];
  for(int i=0;i<n;i++){
    int num=scan.nextInt();
    int arm=0;
    if(num>0){
    int numm=num;
    int pow=String.valueOf(Math.abs(num)).length();
    while(num>0)
    {int rem=num%10;
    arm+=(int)Math.pow(rem,pow);
    num=num/10;
    }
    if(numm==arm)
    {
      number[i]=numm;
    }

    }
  }

  for(int i=0;i<n;i++){
    System.out.println(number[i]);
    
  }
 




}




}