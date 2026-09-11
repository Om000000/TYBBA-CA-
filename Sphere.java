import java.util.Scanner;
abstract class Shape{
public abstract void calc_area();
public abstract void cal_volume();


}

class Sphere extends Shape{
    Scanner sc=new Scanner(System.in);
    int radius,height;
    Sphere(){
        System.out.println("Enter radius for the sphere:");
        this.radius=sc.nextInt();
        this.radius=sc.nextInt();



    }

    @Override
    public void calc_area(){
        double area=4*Math.PI*Math.pow(radius, 2);
        System.out.println("The area of sphere is:{area}");
    }
    public void cal_volume(){
        double volume=(4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("The volume of sphere is:{volume}");

    }
}