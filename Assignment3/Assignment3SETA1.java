/* Write a java program to calculate
 area of Cylinder and Circle.Use super keyword  */






import java.util.Scanner;
class Area{
    Area(int radius){
        System.out.println("The area of circle is:"+3.14*radius*radius);

    }
    Area(int height,int radius)
    {
        System.out.println("The area of cyllander is:"+2*3.14*radius*(radius+height));
    }
}

class Circle extends Area {
    
   Circle(int radius){
    super(radius);
   }
}

class Cylinder extends Area{

    Cylinder(int height,int radius){
        super(height,radius);
    }
    
}

class Assignment3SETA1{
    public static void main(String[] args) {
        System.out.println("Enter which shape you want to enter 1.Circle 2.Cyillander");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int radius=1;
        int height=1;
        switch(choice){
            case 1:
                System.out.println("Enter the radius for circle");
                radius=sc.nextInt();
                Circle r=new Circle(radius);
                break;
            case 2:
                System.out.println("Enter the height and radius for cyllander");
                radius=sc.nextInt();
                radius=sc.nextInt();
                height=sc.nextInt();
                Cylinder c=new Cylinder(height,radius);
                break;

            default:
                System.out.println("Invalid choice");


        }

    }
}