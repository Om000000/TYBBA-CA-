import java.util.Scanner;
abstract class Shape{
public abstract void calc_area();
public abstract void cal_volume();


}

class Sphere extends Shape{
    Scanner sc=new Scanner(System.in);
    double radius;
    Sphere(){
        System.out.println("Enter radius for the sphere:");
        this.radius=sc.nextDouble();
        



    }

    @Override
    public void calc_area(){
        double area=4*Math.PI*Math.pow(radius, 2);
        System.out.println("The area of sphere is:"+area);
    }
    @Override 
    public void cal_volume(){
        double volume=(4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("The volume of sphere is:"+volume);

    }
}

class Cone extends Shape{
    Scanner sc=new Scanner(System.in);
    double area,radius,height,volume;

    
    Cone(){
        System.out.println("Enter radius of cone");
        radius=sc.nextDouble();
        System.out.println("Enter height of cone");
        height=sc.nextDouble();
    }
    @Override
    public void calc_area(){

        double slant_height=Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
        area=(Math.PI*Math.pow(radius, 2))+(Math.PI*radius*slant_height);
        System.out.println("The area of cone is "+area);

    }
    @Override 
    public void cal_volume(){

         volume=(1.0/3.0)*Math.PI*Math.pow(radius,2) *height;
        System.out.println("The volume of volume is"+volume);
        
    }

}

public class Assignment3SETB1{

    public static void main(String[] args) {
        Cone c=new Cone();
        c.calc_area();
        c.cal_volume();

        Sphere s=new Sphere();
        s.calc_area();
        s.cal_volume();

    }
}