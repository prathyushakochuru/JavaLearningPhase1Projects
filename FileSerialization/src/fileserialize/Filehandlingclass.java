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


public class Filehandlingclass {

	public static void main(String[] args) {
		
		CustomerProducts prod = new CustomerProducts(101, "iPhone", "Electronics", 999, "cxxt976uh78987987");
		
		System.out.println("Serializing product class : ");
		System.out.println(prod);
		
		String filename = "ProductsList.txt";
		String errfilename = "/Users/Neena/eclipse-workspace/FileSerialization/errorlogs.txt";
		
		FileUtilities.writetoFile(prod, filename, errfilename);
		
		FileUtilities.readFile(filename);
		

	}

}
