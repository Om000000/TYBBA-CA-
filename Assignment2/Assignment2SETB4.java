public class Assignment2SETB4{

    public static void main(String[] args) {
        int ni=Integer.parseInt(args[0]);
            Mynumber n=new Mynumber(ni);
            n.isNegative();
            n.isPositive();




    }




}

class Mynumber{
private int num;

public Mynumber(){
    num=0;
}

public Mynumber(int a){
    num=a;
}

public void isNegative(){
    if(num<0){
        System.out.println("The number is negative");
    }
}



public void isPositive(){
    if(num>0){
        System.out.println("The number is positive");
    }
}

}