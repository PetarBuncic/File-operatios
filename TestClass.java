package filecomander;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestClass {
	
	public static String filepath1;
	public static String filepath2;
	public static File file1,file2;
	
	public static void main(String[] args) throws FileNotFoundException, IOException, Exception  {
		Scanner input=new Scanner(System.in);
			System.out.println("======================================");
		    System.out.println("|        MENU SELECTION DEMO         |");
		    System.out.println("======================================");
		    System.out.println("|   Type command like written below  |");
		    System.out.println("| Options:                           |");
		    System.out.println("|        LIST	                     |");
		    System.out.println("|        INFO	                     |");
		    System.out.println("|        CREATE_DIR	             |");
		    System.out.println("|        RENAME	                     |");
		    System.out.println("|        COPY	                     |");
		    System.out.println("|        MOVE	                     |");
		    System.out.println("|        DELETE                      |");
		    System.out.println("|        Exit                        |");
		    System.out.println("======================================");
		    System.out.println("Select options: ");
		
		String comand=input.nextLine();
			switch(comand) {
		
			case  ("LIST"):
				System.out.println("Unesite putanju do fajla/foldera za koji zelite da vidite informacije");
				filepath1=input.nextLine();
				file1= new File(filepath1);
				FileComander.list(file1);
				break;
			case  ("INFO"):
				System.out.println("Unesite putanju do fajla/foldera za koji zelite da vidite informacije");
				filepath1=input.nextLine();
				file1= new File(filepath1);
				FileComander.info(file1);
				break;
			case  ("CREATE_DIR"):
				System.out.println("Unesite putanju do fajla/foldera za koji zelite da vidite informacije");
				filepath1=input.nextLine();
				file1= new File(filepath1);
				FileComander.makeSingleDirectory(file1);
				break;
			case  ("RENAME"):
				System.out.println("Unesite putanju do fajla/foldera koji zelite da preimenujete");
				filepath1=input.nextLine();
				file1= new File(filepath1);
				System.out.println("Unesite putanju sa novim imenom  fajla/foldera");
				filepath2=input.nextLine();
				file2= new File(filepath2);
				FileComander.renameDirFile(file1, file2);
				break;
			case  ("COPY"):
				System.out.println("Unesite putanju do fajla/foldera za koji zelite da vidite informacije");
				filepath1=input.nextLine();
				file1= new File(filepath1);
				FileComander.info(file1);
				break;
			case  ("MOVE"):
				System.out.println("Unesite putanju do fajla/foldera za koji zelite da vidite informacije");
				filepath1=input.nextLine();
				file1= new File(filepath1);
				FileComander.info(file1);
				break;
			case  ("DELETE"):
				System.out.println("Unesite putanju do fajla/foldera za koji zelite da izbrisete");
				filepath1=input.nextLine();
				file1= new File(filepath1);
				FileComander.deleteDirFile(file1);
				break;
			case  ("EXIT"):
				System.out.println("Izlazite iz programa");
				break;
			default:
				System.out.println("Komanda koju ste uneli nije prepoznata");	

		}
		
		
		//String filepath2=input.nextLine();
		//E:\Pera\AndjelaFile file1=new File(filepath2);
		input.close();
		//final File folder = new File(fn);
		//final FileTime folder1=FileTime.getLastModifiedTime();
		
		//list(folder);
		
		//makeSingleDirectory(file);
		//makeMultipleDirectories(file);
		//renameDirFile(file, file1);
		//deleteDirFile(file);
		//copyDirFile(file, file1);
		//FileComanderTest.moveDirFile(file, file1);
		
	}

}
