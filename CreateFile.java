package phase1Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
void Create() {
	System.out.println("---------you are into create function of file handling------------");
	@SuppressWarnings("resource")
	Scanner filename = new Scanner(System.in);
	System.out.println("please write the location,where you want to create file :");
	String s=filename.nextLine();
	System.out.println("please Enter the file name :");
	String name=filename.nextLine();
    File f=new File(s+"\\"+name);
    try
    {
        if(f.createNewFile())
        {
            System.out.println("File successfully created...");
        }
        else
        {
            
        	System.out.println("File already exists...");
        }
    }
    catch(IOException i)
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