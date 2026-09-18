/* Construct a Linked List containg name: CPP, Java, Python and PHP. Then extend your program to 
do the following: 
• Display the contents of the List using an iterator 
• Display the contents of the List in reverse order using a ListIterator. 
 */

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment3SETB3 {
public static void main(String args[]){
LinkedList<String> subject=new LinkedList<>();    
subject.add("CPP");
subject.add("Java");
subject.add("Python");
subject.add("PHP");

Iterator<String> it=subject.iterator();
System.out.println("==Original order linked list==");
while(it.hasNext()){
System.out.println(it.next());
}
System.out.println("==Reverse order linked list==");

ListIterator<String> itt=subject.listIterator(subject.size());
while(itt.hasPrevious()){
System.out.println(itt.previous());
}



}

}
