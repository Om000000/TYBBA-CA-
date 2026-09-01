class Area{
    void area(double radius)
    {
        double area=3.14*radius*radius;
        System.out.println("The area is: "+area);
    }
    void area(double len,double bre){
        double area=len*bre;
        System.out.println("The area of Rectagle is: "+area);
    }
    void area(int base, int height){
     int area= base * height/2;
     System.out.println("The area of Triangle is: "+area);
    }

}





class Assignment2SETA3{
    
public static void main(String[] args) {
    Area a=new Area();
    a.area(5);
    a.area(5.5,5.5);
    a.area(5,4);
}




}