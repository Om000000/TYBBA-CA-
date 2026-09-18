import java.util.ArrayList;
public class javapgm {
public static void main(String[] args) {
    ArrayList<String> a=new ArrayList<>();
    a.add("Omkar");
    ArrayList<String> b=new ArrayList<>();
    b.add("Swapnil");
    a.addAll(b);
    System.out.println(a); /* [Omkar,Swapnil] */
    System.out.println(a.indexOf("Omkar"));  /* 0 */
    System.out.println(a.equals(b)); /* false */
    System.out.println(a.get(0));
    System.out.println(a.isEmpty()); /* false */
    System.out.println(a.size()); /* 2 */
    a.addFirst("Sakshi");
    System.out.println(a); /* [Sakshi,Omkar,Swapnil] */
    System.out.println(a.contains("Omkar")); /* true */
    a.removeAll(b);
    System.out.println(a); /* [Sakshi,Omkar] */

    
    

    
}
    


}
