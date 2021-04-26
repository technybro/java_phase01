package phase1Project;

import java.io.File;
import java.util.Scanner;

public class DeleteFile  {
	 void delete1() {
		 System.out.println("----------you are into delete function of file handling------------");
			Scanner obj = new Scanner(System.in);
			System.out.print("Enter the location of your directory : ");
			String Name1 = obj.nextLine();
			System.out.print("Enter file name that you want to delete: ");
			String Name = obj.nextLine();
			
			File myObj = new File(Name1+"\\" + Name);
			if(myObj.delete()) {
				System.out.println("your File is deleted and name of file is : " + myObj.getName());
			    System.out.println("");
			} else {
				System.out.println("your file does not exist");
				System.out.println("");
			}
			
			System.out.println("");
		    System.out.println("--------------------------------------------------------------");
			System.out.println("You are now in your Home Page");
			System.out.println("");
			Menu obj1=new Menu();
			obj1.MenuMethod();
			
		}
}