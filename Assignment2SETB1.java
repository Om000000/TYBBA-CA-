/* Define a class person(pid,pname,age,gender). Define Default and parameterised constructor. 
Overload the constructor. Accept the 5 person details and display it.(use this keyword.
 */
public class Assignment2SETB1 {
    public static void main(String[] args) {
        Person p=new Person();
        Person p1=new Person(1,"Omkar",25,"Male");
        p1.display();
    }
    



}
class Person{
int pid;
String pname;
int age;
String gender;

    public Person() {
        System.out.println("This is a default constructor");

    }

    public Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    void display(){
        System.out.println("The pid:"+this.pid);
        System.out.println("The Person name:"+this.pname);
        System.out.println("The Person Gender:"+this.gender);
        System.out.println("The Person Age:"+this.age);

    }
    


}
