/* Define a class Student(rollno,name,per). Create n objects of the student class and Display it using 
toString().(Use parameterized constructor)  */
import static java.lang.System.out;
class Student{
    public int rollno;
    public String name;
    public int per;
   public Student(int rno,String n,int p){
    rollno=rno;
    name=n;
    per=p;
    
   }




}

public class Assignment3SETB{
    public static void main(String[] args) {
        
    
   Student s = new Student(2, "Omkar", 75);
    String str=s.toString();
    out.println(str);
}
}