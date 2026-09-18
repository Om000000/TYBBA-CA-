class Methodoverloadingandoverridingg {
    
    public void display(){
        System.out.println("Parent class medthod(to be overriden)"); /* Method overridding */
    }
    public int add(int a){
        return a+1;                    /* Method overloading */
    }
    public int add(int a,int b){        /* Method overloading */
        return a+b;
    }
    
    

}
class overridding extends Methodoverloadingandoverridingg{
    public void display(){
        System.out.println("Method overriden by the child class");
    }
}

public class Methodoverloadingandoverriding {
    public static void main(String args[]){
        Methodoverloadingandoverridingg o=new overridding();
        o.display();
        System.out.println(o.add(5));
        System.out.println(o.add(5,6));


    }

}
