/* Derive a class Square from class Rectangle. Create one more class Circle. Create an interface with 
only one method called area(). Implement this interface in all classes. Include appropriate data 
64 | Page 
 
members and constructors in all classes. Write a java program to accept details of Square, Circle & 
Rectangle and display the area.  */
import java.util.Scanner;
interface Shape{
public void area();
}

class Rectangle implements Shape{
    public Double length;
    public Double breadth;

   public Rectangle(Double l,Double b){
    this.length=l;
    this.breadth=b;
   }
public void area(){
    System.out.println("THE AREA IS "+ (length*breadth));
}

}

class Circle implements Shape{
    public Double radius;
  

   public Circle(Double r){
    this.radius=r;
   }
public void area(){
    System.out.println("THE AREA IS "+ (radius*radius*3.14));
}

}

class Square implements Shape{
    public Double side;

   public Square(Double s){
    this.side=s;
   }
public void area(){
    System.out.println("THE AREA IS "+ (side*side));
}

}

public class Assignment3SETC4{
    public static void main(String args[])
   {
    System.out.println("Enter radius for circle to calculate area");
    Scanner sc=new Scanner(System.in);
    Double radius= sc.nextDouble();
    Circle c=new Circle(radius);
    c.area();

    System.out.println("Enter length,breadth for rectangle to calculate area");
    Double length=sc.nextDouble();
    Double breadth=sc.nextDouble();
    Rectangle r=new Rectangle(length, breadth);
    r.area();

    System.out.println("Enter side for square to calculate area");
    Double side=sc.nextDouble();
    Square s=new Square(side);
    s.area();
}
}