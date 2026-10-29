


/* Write a Java program to create a text file and write student details into it */
import java.io.File;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException; 

public class Slip11_2
{




public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
File file=new File("hell.txt");
try(FileOutputStream f1=new FileOutputStream(file))
{
PrintWriter p=new PrintWriter(f1);
String student_name="Omkar";
int student_rollno=2;
p.println("Student rollno:"+student_rollno);
p.println("Student name:"+student_name);
p.flush();
System.out.println("Writen successfully");
}
catch(IOException e){
    System.out.println("Error");
}

}
}