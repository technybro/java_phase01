package phase1Project;

import java.util.Scanner;

public class Menu {

	void MenuMethod() {
		
		Scanner Menu = new Scanner(System.in);
		System.out.println("Your Menu Options Are as follows:");
		System.out.println("choose 1=> To Show current file names in root diretory in sorted order");
		System.out.println("choose 2=> To Show options to Create, Delete, Search file");
		System.out.println("choose 3=> To Exit App");
		System.out.print("please Enter a Valid Option: ");
		System.out.println("");
		int menu1 = Menu.nextInt();
		
        switch(menu1) {
		case 1 :
			FileSorting fs=new FileSorting();
			fs.sorting();
			break;
	
		case 2 :
		   FileManagementSystem FMS = new FileManagementSystem();
		   FMS.management();
		   break;
		
		case 3 :
			System.out.println("You Exited the App");
			System.exit(0);
			break;
			
		default:
			System.out.println("CAUTION:");
			System.out.println("        You have entered an invalid menu option ");
			System.out.println("        please Enter Valid Input and try again ");
			System.out.println("        We are redirecting You to our  Home page ");
			System.out.println("");
			System.out.println("-----------------------------------------------------------");
			Menu obj=new Menu();
			obj.MenuMethod();	
		}
	}
}
