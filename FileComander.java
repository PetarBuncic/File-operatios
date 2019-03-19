kage filecomander;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileComanderTest  {

	
		public static void main(String[] args) {
			//Path path= new Path();
			Scanner input=new Scanner(System.in);
			String filepath=input.nextLine();
			File file= new File(filepath);
			String filepath2=input.nextLine();
			File file1=new File(filepath2);
			input.close();
			//final File folder = new File(fn);
			//final FileTime folder1=FileTime.getLastModifiedTime();
			
			//list(folder);
			//info(fn);
			//makeSingleDirectory(file);
			//makeMultipleDirectories(file);
			renameDirFile(file, file1);
			
		}
		public static  void list(final File folder) {
			if(folder.isDirectory()){
				System.out.println(folder.getName() +"  je Direktorijum");
			    for (final File fileEntry : folder.listFiles()) {
			        if (fileEntry.isDirectory()) {
			        	System.out.println("+++"+fileEntry.getName()+" Je Direktorijum");
			        	//list(folder);
			           // listFilesForFolder(fileEntry);
			        } else {
			            System.out.println(fileEntry.getName()+" Je File");
			        }
			    }
			}
			else {
				 System.out.println(folder.getName()+" Je File");
			}
		}
		/*public static void info(final File folder) {
			System.out.println(folder.getName());
			
			System.out.println(folder.getAbsolutePath());
			System.out.println(folder.getTotalSpace());
			System.out.println(folder.getUsableSpace());
			System.out.println(folder.lastModified());
			
			
		}*/
		
		/*Informacije na drugi nacin, kreiramo funkciju koja na iscitava informavije o fileu*/
		
		public static void info(File file) {
			
	        try{
	        BasicFileAttributes atributes = Files.readAttributes(file.toPath(),BasicFileAttributes.class);
	        
	        System.out.printf("File creation time: %s%n", atributes.creationTime());// vreme kreiranja
	        System.out.printf("File last modification time: %s%n", atributes.lastModifiedTime());// vreme kreiranja
	        System.out.printf("File last access  time: %s%n", atributes.lastAccessTime());// vreme kreiranja
	        System.out.printf("File size: %s%n", atributes.size());// vreme kreiranja
	        System.out.printf("File path: %s%n", file.getPath() );// vreme kreiranja
	        System.out.printf("File name %s%n", file.getName() );// vreme kreiranja
	     
	    
	        }catch(Exception e){
	        	e.printStackTrace();
	        }
			
			
		}
		
		
		public static void makeSingleDirectory(File file) {
	        //To create single directory/folder like "D:\\Directory1"
			
	        if (!file.exists()) {
	            if (file.mkdir()) {
	                System.out.println("Directory is created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        }
		}
		   //To create multiple directories/folders like "D:\\Directory2\\Sub2\\Sub-Sub2"
		public static void makeMultipleDirectories(File files) {	
	
	        if (!files.exists()) {
	            if (files.mkdirs()) {
	                System.out.println("Multiple directories are created!");
	            } else {
	                System.out.println("Failed to create multiple directories!");
	            }
	        }

	    }
		public static void renameDirFile(File oldfile,File newfile) {
			
			if (oldfile.exists()) {
		            if (oldfile.renameTo(newfile)) {
		                System.out.println("Name is changed!");
		            } else {
		                System.out.println("Failed to change name!");
		            }
		        }
			
		}
		public static void copyDirFile(String path1, String path2) {
			
					
		}
		public static void moveDirFile(String path1, String path2) {
			
		}
		public static void deleteDirFile(String path) {
			
		}
				

	}
