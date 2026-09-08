/* Define a class product(pid,pname,price). Write a function to accept the product details, to display 
product details and to calculate total amount. (use array of Objects) */

public class Product{

public int pid;
public String pname;
public int price;

public void Accept(int pi,String pn,int pr){
    this.pid=pi;
    this.pname=pn;
    this.price=pr;

}
public void Display(){
    IO.println("pid:"+pid);
    IO.println("Pname:"+pname);
    IO.println("Price:"+price);
}




}

public class 