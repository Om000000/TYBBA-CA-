/* Construct a Linked List containing name: red, blue, yellow and orange. Then extend your program 
to do the following: 
Display the contents of the List using an iterator 
Display the contents of the List in reverse order using a ListIterator. 
Create another list containing pink & green. Insert the elements of this list between blue & yellow.  */
import java.util.*;
public class Assignment3SETC2 {

public static void main(String args[]){
LinkedList<String> list=new LinkedList<>();
list.add("red");
list.add("blue");
list.add("yellow");
list.add("orange");

Iterator<String> it=list.iterator();
System.out.println("==Normal order list==");
while(it.hasNext()){
    System.out.println(it.next());
}

ListIterator<String> its=list.listIterator(list.size());
System.out.println("==Reverse order list==");
while(its.hasPrevious()){
    System.out.println(its.previous());
}

LinkedList<String> list2=new LinkedList<>();
list2.add("pink");
list2.add("green");

list.addAll(2,list2);
System.out.println("==After Added all of another list==:"+list);

}


}