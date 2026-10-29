/* Write a java program to display the files having extension .txt from a given 
directory
 */

import java.io.File;
public class slip9{
    public static void main(String args[]){
        File folder=new File("C:/Users/91883/Desktop/java/Sli");
        File[] filelist=folder.listFiles();
        if(filelist!=null){
            for(File fold : filelist){
                if(fold.isFile() && fold.getName().endsWith(".txt"))
                {
                    System.out.println("File name ass txt:"+fold.getName());
                }
            }
        }






    }



}