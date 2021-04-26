package phase1Project;

import java.io.File;
import java.util.Scanner;

public class FileNames {
	
	void file1()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the location of directory,to list all files :");
		String s=scan.nextLine();
		File filePath=new File(s);
		String[] contents=filePath.list();
		System.out.println("Names of file in current directory are:");
		System.out.println("");
		for(int i=0;i<contents.length;i++)
			System.out.println(contents[i]);
		
		System.out.println("");
	    System.out.println("--------------------------------------------------------------");
		System.out.println("You are now in your Home Page");
		System.out.println("------------------------------------------------------------");
		Menu obj=new Menu();
		obj.MenuMethod();
		
	}
	

}
