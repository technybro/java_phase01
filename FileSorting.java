package phase1Project;

import java.util.*;
import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class FileSorting
{
	void sorting()
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Please enter the location of directory,to sort all files :");
	String FileDir=scan.nextLine();
	File f=new File(FileDir);
	ArrayList<String>sorted = new ArrayList();
	String names[]=f.list();
	for(int i=0;i<names.length;i++)
	{
		sorted.add(names[i]);
	}
	System.out.println("");
	System.out.print("your sorted list of files => "+sorted.stream().sorted().collect(Collectors.toList()));
	System.out.println("");
    System.out.println("--------------------------------------------------------------");
	System.out.println("You are now in your Home Page");
	System.out.println("--------------------------------------------------------------");
	Menu obj=new Menu();
	obj.MenuMethod();
	
}

}
