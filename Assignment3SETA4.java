/* Define a class Student with attributes rollno and name. Define default and parameterized constructor. 
Override the toString() method. Keep the count of Objects created. Create objects using 
parameterized constructor and Display the object count after each object is created.
 */

class Student{
    int rollno=0;
    String name="";
    static int objectcount=0;
     @Override public String toString(){
            return "[Name "+name+" Rollno "+rollno+"]";
        }
    Student(){
        System.out.println("Default Constructor called");
        objectcount++;
        System.out.println("No of Object Created:"+objectcount);
        
    }
    Student(int rno,String na)
    {
        this.rollno=rno;
        this.name=na;
        objectcount++;
        System.out.println("No of Object Created:"+objectcount);

        
    }
   
}
public class Assignment3SETA4 {

    public static void main(String[] args) {
        Student s=new Student(1,"Omkar");
        Student s1=new Student(2,"Om");
        System.out.println(s.toString());
        System.out.println(s1.toString());
    }
    
}
