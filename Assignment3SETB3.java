// Write a Python program to create set difference and a symmetric difference
import java.util.Set;
import java.util.HashSet;

class Assignment3SETB3{
    public static void main(String args[])
    {
        Set<Integer> s=new HashSet<>();

        s.add(5);
        s.add(4);
        s.add(3);
        s.add(9);
        s.add(8);
        s.add(6);
        System.out.println(s);

        Set<Integer> s1=new HashSet<>();
        s1.add(5);
        s1.add(35);
        s1.add(77);
        s1.add(91);
        s1.add(82);
        s1.add(60);

         System.out.println("Before s1: "+s1);
        System.out.println("Before s: "+s);
        s1.removeAll(s);
       


        System.out.println("After: "+s1);


    }







}
