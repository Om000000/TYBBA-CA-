/* Write a Java program to Copy data of one object to another Object.
 */

class Trycopy{

    public Trycopy(Trycopy origin) {
    this.a=origin.a;
    
    
    }

    public Trycopy() {
    }

    
    
    
    int a;
}


public class Assignment2SETA4 {
    public static void main(String[] args) {
        Trycopy n= new Trycopy();
        n.a=10;
        Trycopy nm= new Trycopy(n);
        
        System.out.println("The copy a is:"+nm.a);

    }



}


