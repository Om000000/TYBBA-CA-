import java.util.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collection;

class Student{
int rno,age;
String name;
public Student(int r,String n,int a){
this.rno=r;
this.age=a;
this.name=n;
}


}


class SortByAge implements Comparator<Student>{

@Override 
public int compare(Student a,Student b){
    return a.age-b.age;
} 

public boolean equals(Object obj)
{
    if(obj instanceof SortByAge){
        return true;
    }
    else{
        return false;
    }
}

}

public class demo{
public static void main(String args[])
{
        @SuppressWarnings({"unchecked","rawtype"})

LinkedList<Student> stud=new LinkedList();
stud.add(new Student(101,"Omkar",22));
stud.add(new Student(102,"Sanket",20));
stud.add(new Student(103,"Om",21));
stud.add(new Student(104,"Ashish",23));
stud.add(new Student(105,"Aakanksha",25));

SortByAge s1=new SortByAge();
SortByAge s2=new SortByAge();

System.out.println(s1.equals(s2));
Collections.sort(stud,new SortByAge());
for(Student s:stud)
{
    System.out.println(s.rno+"\t"+s.name+"\t"+s.age+"\t");


}


}
}