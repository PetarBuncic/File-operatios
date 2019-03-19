package filecomander;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

	
		
		public static  void list( File folder) {
			if(folder.isDirectory()){
				System.out.println(folder.getName() +"  je Direktorijum");
			    for (File fileEntry : folder.listFiles()) {
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
		
		public static void info(File file) throws Exception {
			
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
		public static void copyDirFile(File original, File copy) throws IOException, FileNotFoundException {
		 try {
				if(original.isDirectory()) {
					if(!copy.exists())
						copy.mkdir();
					String [] files=original.list();
					for(int i=0;i<files.length;i++) {
						copyDirFile(new File(original,files[i]),new File(copy,files[i]));
					}
				} 
			
				else {
	
		            InputStream in = new FileInputStream(original);
		            OutputStream out = new FileOutputStream(copy);
	
		            // Copy the bits from instream to outstream
		            byte[] buf = new byte[1024];
		            int len;
		            while ((len = in.read(buf)) > 0) {
		                out.write(buf, 0, len);
		            }
		            in.close();
		            out.close();
		        }
		 } catch(Exception e) {
			 System.out.println("Nije pronadjen fajl");
			 e.printStackTrace();
			 //System.out.println("Nije pronadjen fajl");
		 }
			
	        }
			
		public static void moveDirFile(File source, File destination) throws FileNotFoundException, IOException {
			copyDirFile(source,destination);
			deleteDirFile(source);
			
		}
		public static void deleteDirFile(File file) {
			
			File[] files= file.listFiles();
			if(files!=null)
				for(File f : files)
					deleteDirFile(f);
				file.delete();
		}
				

	}
