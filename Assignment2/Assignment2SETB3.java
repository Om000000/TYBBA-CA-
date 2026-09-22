import java.util.Scanner;
public class Assignment2SETB3 {
    public static void main(String[] args) {
        int n=0;
        System.out.println("Enter how many objects");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter "+n+" Elements");
        Student[] obj=new Student[n];
        String name;
        int rno;
        double p;
       for(int i=0;i<n;i++){
        System.out.println("Enter "+n+" name,rno,percentage");
        name=sc.nextLine();
        rno=sc.nextInt();
        p=sc.nextDouble();
        sc.nextLine();
        obj[i]=new Student(rno, name, p);        
       }

       System.out.println(obj.toString());
    }

    
}

class Student{
    int rollNo;
    String Name;
    double per;

    public Student(int r,String n,double p) {
    rollNo=r;
    Name=n;
    per=p;

    
    }

    
}

