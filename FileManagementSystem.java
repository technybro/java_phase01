package phase1Project;

import java.util.Scanner;
import java.util.jar.JarFile;

@SuppressWarnings("unused")
public class FileManagementSystem {
	
	void management()
	
	{
	System.out.println("=============================================================");
	System.out.println("---------Welcome to your Buisness level operation------------");
	//making menu options for buisness level operation
	Scanner scan=new Scanner(System.in);
	System.out.println("Your File Management Options Are as Follows: ");
	System.out.println("choose 1=> To Create User specified file ");
	System.out.println("choose 2=> To Delete user specified file");
	System.out.println("choose 3=> To find information of user specified file");
	System.out.println("choose 4=> To List All user specified files");
	System.out.println("choose 5=> To write user specified file");
	System.out.println("choose 6=> To read user specified file");
	int b=0;
	System.out.println("enter your choice of file management system :");
	b=scan.nextInt();
	switch(b)
	{
	case 1:
		//this case will create new file in entered location
		CreateFile c1 = new CreateFile();
		c1.Create();
		break;
	
	case 2:
		//this case will delete the file 
		DeleteFile df=new DeleteFile();
		df.delete1();
		break;
		
	case 3:
		//this will generate all possible information of the file
		FileInfo fi=new FileInfo();
		fi.info();
		break;
		
	case 4 :
		//this will generate list of files present in location
		FileNames fn=new FileNames();
		fn.file1();
		break;
		
	case 5:
		//this will allow user to write a file
		WriteFile wf=new WriteFile();
		wf.write();
		break;
		
	case 6:
		//this will allow user to read file
		ReadFile rf1=new ReadFile();
		rf1.read();
		break;
		
		
	default:
		//user entered the invalid option
		//redirecting user to home page
		System.out.println("You have not choosed correct option");
		System.out.println("we are redirecting you to home page:");	
		Menu obj=new Menu();
		obj.MenuMethod();	
	}

	}
}
