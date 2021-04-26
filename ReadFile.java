package phase1Project;

import java.io.*;
import java.util.Scanner;
class ReadFile
{
    void read() {
       
       try
       {
    	   Scanner scan=new Scanner(System.in);
    	   
    	System.out.println("You are ready to read Your file :");
       	System.out.println("please write location of file to which you want to read :");
       	String directory=scan.nextLine();
       	System.out.println("please write name of file to read :");
       	String name=scan.nextLine();
    	   
           FileReader f3 = new FileReader(directory+"\\"+name);
           try
           {
            int i;
            while((i=f3.read())!=-1)
            {
                System.out.print((char)i);
            }
            System.out.println("");
            
           }
           finally {
               f3.close();
           }
       }
       catch(IOException e)
       {
           System.out.println("Exception Handelled...");
       }
       System.out.println("");
       System.out.println("--------------------------------------------------------------");
       System.out.println("You are now in your Home Page");
       System.out.println("--------------------------------------------------------------");
   	   Menu obj=new Menu();
   	   obj.MenuMethod();
       
    }
}