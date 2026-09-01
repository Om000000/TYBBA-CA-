/* Write a java program to accept n city names and display them in ascending order. */

import java.util.Scanner;
import java.util.Arrays;

class SETB1{

public static void main(String args[])
{
int n;
System.out.println("Enter number of cities you want to enter");
Scanner scan=new Scanner(System.in);
  n=scan.nextInt();
  String[] cname=new String[n];
  for(int i=0;i<n;i++){
    cname[i]=scan.next();
    
  }
  Arrays.sort(cname);

  for(int i=0;i<n;i++){
    System.out.println(cname[i]);
    
  }
 




}




}