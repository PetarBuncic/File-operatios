package filecomander;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception  {
		Scanner input=new Scanner(System.in);
		  System.out.println("============================");
		    System.out.println("|   MENU SELECTION DEMO    |");
		    System.out.println("============================");
		    System.out.println("| Options:                 |");
		    System.out.println("|        INFO	           |");
		    System.out.println("|        DELETE            |");
		    System.out.println("|        Exit              |");
		    System.out.println("============================");
		    System.out.println("Select options: ");
		
		int comand=input.nextInt();
			switch(comand) {
		
			case  (1):
				System.out.println("Unesite putanju do fajla/foldera za koji zelite da vidite informacije");
				String filepath=input.nextLine();
				File file= new File(filepath);
				FileComanderTest.info(file);
				break;
			case  (2):
				System.out.println("Unesite putanju do fajla/foldera za koji zelite da izbrisete");
				String filepath1=input.nextLine();
				File file1= new File(filepath1);
				FileComanderTest.deleteDirFile(file1);
				break;
			case  (3):
				System.out.println("Izlazite iz programa");
				break;
			default:
				System.out.println("Komanda koju ste uneli nije prepoznata");	

		}
		
		
	
	
		
		String filepath2=input.nextLine();
		File file1=new File(filepath2);
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
