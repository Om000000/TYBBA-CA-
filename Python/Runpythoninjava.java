import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Runpythoninjava {


    public static void main(String args[]){
        try{
           String pythonPath = "C:\\Users\\91883\\AppData\\Local\\Python\\pythoncore-3.14-64\\python.exe"; 
            String scriptPath = "Imagetopng.py";
            
            
            
            ProcessBuilder p=new ProcessBuilder(pythonPath,scriptPath);
            Process process= p.start();
              p.redirectErrorStream(true); 
            BufferedReader reader=new BufferedReader(new InputStreamReader(process.getInputStream()));
            

            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }


    }


}
