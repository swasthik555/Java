package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {

//		FileWriter fw = new FileWriter("xyz.txt");
//		
//		BufferedWriter bw = new BufferedWriter(fw);

//		OR Instead

		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("xyz.txt")));

		bw.write("Hello");
		bw.newLine();
		bw.write("What is your name?");
		bw.newLine();
		bw.write("My name is Sanjay");

		bw.flush();

		bw.close();
//---------------------------------------------------
// bufferedReader

//		File file  = new File("xyz.txt");
//		
//		FileReader fr = new FileReader(file)

//		OR Instead

		BufferedReader br = new BufferedReader(new FileReader(new File("xyz.txt")));

		String str = br.readLine();

		while (str != null) {

			System.out.println(str);

			str = br.readLine();

		}

	}

}
