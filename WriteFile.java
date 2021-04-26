package phase1Project;
import java.io.*;
import java.util.Scanner;

public class WriteFile {

    void write() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("You are ready to write in Your file :");
    	System.out.println("please write location of file to which you want to write :");
    	String directory=scan.nextLine();
    	System.out.println("please write name of file to write :");
    	String name=scan.nextLine();
      
       try
       {
    	   
           FileWriter f2=new FileWriter(directory+"\\"+name);
           try
           {
        	   System.out.println("Start writing your file :");
        	   String s1=scan.nextLine();
               f2.write(s1);
           
           }
           finally
           {
               f2.close();
           }
           System.out.println("Data wrote successfully...");
        }
        catch(IOException e)
        {
            System.out.println("Exception :"+e);
        }
       System.out.println("");
       System.out.println("--------------------------------------------------------------");
       System.out.println("You are now in your Home Page");
       System.out.println("--------------------------------------------------------------");
   	   Menu obj=new Menu();
   	   obj.MenuMethod();
    }
}
