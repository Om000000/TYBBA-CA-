/* Write a java program to accept ‘n’ integers from the user & store them in an ArrayList collection. 
Display the elements of ArrayList collection in reverse order
 */
import java.util.ArrayList;
import java.util.List;

public class Assignment3SETA5 {
    public static void main(String[] args) {
        List<java.lang.Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        for(int i=a.size()-1;i>=0;i--)
        {
            System.out.println(a.get(i));
        }

        

    }
}
