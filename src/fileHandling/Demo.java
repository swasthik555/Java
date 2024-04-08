package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		/*
		System.out.println("-------------------------");
		
		File file = new File("abc");
		// Creating a folder
		System.out.println(file.mkdir()); // true
		
		
		File file1 = new File(file,"def.txt"); // represented a file at object level but not at the physical file
		
		// create a physical file
		System.out.println(file1.createNewFile()); // true
		
		System.out.println(file.isFile()); // false
		System.out.println(file.isDirectory()); // true
		
		System.out.println(file1.isFile());// true
		System.out.println(file1.isDirectory()); // false
		
		System.out.println(file1.length());
		
		file1.delete();
		*/
		
		File file = new File("abc.txt"); //Represented the file at the object level
		
		FileWriter fw = new FileWriter(file); // For writing into the files // create a file at physical level
		
		fw.write("Hello \n");
		fw.write("How are you? \n");
		fw.write("See you, Bye.");
		
		fw.flush(); // push the text in the file
		
		fw.close(); // Object will be deleted
		
//-------------------------------------------------------
		//perform read operation on the file
		
		FileReader fr = new FileReader(file);
		
		int c = fr.read(); // returns -1 when there is no char left in the text file
		
		while(c!=-1) {
			System.out.println((char)c);
			c=fr.read();
			
		}
		
		fr.close();
	}

}
