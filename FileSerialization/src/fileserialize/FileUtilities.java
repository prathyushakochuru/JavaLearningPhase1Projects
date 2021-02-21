package fileserialize;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileUtilities {
	
	public static void writetoFile(CustomerProducts prod, String filename, String errfilename)
	{
		//try with resources
				try(FileOutputStream fos=new FileOutputStream(filename);
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						){
					oos.writeObject(prod);
					System.out.println("Successfully wrote to the file through serialization!");
				} 
				//writing exception to a file if raised
				catch (IOException ex) {
					System.out.println(ex);
					File f1 = new File(errfilename);
			         
					try {
						if(!f1.exists()) {
				            f1.createNewFile();
				         }

				         FileWriter fileWritter = new FileWriter(f1.getName(),true);
				         BufferedWriter bw = new BufferedWriter(fileWritter);
				         bw.write(ex.getMessage() + " Exception handled");
				         bw.close();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
				}
	}
	
	public static void readFile(String filename)
	{
		try(FileInputStream fis=new FileInputStream(filename);
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			
			CustomerProducts prodr=(CustomerProducts) ois.readObject();
			System.out.println("Redaing the file through deserialization is");
			System.out.println(prodr);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
	
	

}
