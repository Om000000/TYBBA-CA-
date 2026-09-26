public class Assignment4SETA1{

public static void main(String args[]){
    if(args.length==0){
        System.out.println("Enter at least one number");
        return;
    }
    int integercounter=0;
    for(String arg:args){
        try{
            Integer.parseInt(arg);
            integercounter++;
        }
        catch(NumberFormatException e){
            System.out.println("Not an integer in the args:"+arg);
        }
    }
            System.out.println("The number of list intergers you enter are:"+integercounter);


}


}