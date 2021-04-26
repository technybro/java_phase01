package phase1Project;


import java.io.File;
import java.util.Scanner;

public class FileInfo {
	void info() {

	    Scanner scan1=new Scanner(System.in);
	    System.out.println("Please enter the location of your directory : ");
	    String dirLocation=scan1.nextLine();
	    System.out.println("Please enter the name of file for which you need information :");
	    String fileName=scan1.nextLine();
        File f1=new File(dirLocation+"\\"+fileName);
        if(f1.exists())
        {
        	System.out.println("----------------------FILE INFORMATION--------------------");
            System.out.println("file name : "+f1.getName());
            System.out.println("file location : "+f1.getAbsolutePath());
            System.out.println("file writable ? "+f1.canWrite());
            System.out.println("file readable ? "+f1.canRead());
            System.out.println("file size ? "+f1.length());
            System.out.println("file name : "+f1.getName());
        }
        else
        {
            System.out.println("file does not exists...");
           
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
       
        System.out.println("You are now in your Home Page");
        System.out.println("--------------------------------------------------------------");
    	Menu obj=new Menu();
    	obj.MenuMethod();
	}
}