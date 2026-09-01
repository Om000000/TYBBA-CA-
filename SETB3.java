/*  Write a java program to search given name into the array, if it is found then display its index 
otherwise display appropriate message. */

import java.util.Scanner;
import java.util.Arrays;
class SETB3{
public static void main(String[] args) {
int n=0;
System.out.println("Enter num of name you want to enter");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
String[] names =new String[n];
for(int i=0;i<n;i++)
{
names[i]=scan.next();


}
System.out.println("Which name you want to find:");
String name=scan.next();
int found=0;
for(int i=0;i<n;i++){

if(names[i].equals(name))
{
    System.out.println("YOUR NAME IS FOUND ON INDEX:"+i);
    found++;
    break;
}

}

if(found==0)
{
    System.out.println("Sorry no name found in the array");
}
scan.close();
}

}