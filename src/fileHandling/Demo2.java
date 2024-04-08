package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw= new PrintWriter(new File("mno.txt"));
		
		pw.println("Hello");
		pw.println("What is your name?");
		pw.print("My name is Sanjay.");
		
		pw.flush();
		
		pw.close();
	}

}
