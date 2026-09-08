/* Define a class product(pid,pname,price). Write a function to accept the product details, to display 
product details and to calculate total amount. (use array of Objects) */
import java.util.Scanner;
import java.lang.*;
import java.util.InputMismatchException;


class Product{

public int pid;
public String pname;
public int price;

public void Accept(int pi,String pn,int pr){
    this.pid=pi;
    this.pname=pn;
    this.price=pr;

}
public void Display(){
    System.out.println("pid:"+pid);
    System.out.println("Pname:"+pname);
    System.out.println("Price:"+price);
}




}

public class Assignment2SETB2{

public static void main(String[] args) {
    try{
    System.out.println("Enter how many records you want to add");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Product[] products=new Product[n];
    int pid;
    String pname;
    int price;
    for(int i=0;i<products.length;i++){
        products[i]=new Product();
        
        System.out.println("Enter pid");
        pid=sc.nextInt();
        System.out.println("Enter pname");
        pname=sc.next();
        System.out.println("Enter price of p");
        price=sc.nextInt();
        products[i].Accept(pid, pname, price);

    }
    int total=0;
     System.out.println("\n===== DISPLAYING PRODUCTS =====");
    for(Product p:products){
       p.Display();
        total+=p.price;
    }
    System.out.println("The total amount is:"+total);
    sc.close();
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("The Array occured an error");

    }
    catch(InputMismatchException e)
    {
        System.out.println("The Input written is wrong");
        
    }
   

}


}