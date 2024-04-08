

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseOfWhileLoopInsteadOfForLoop {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Arun.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!=null) {
			
			System.out.println(line);
			line = br.readLine();
			
		}
		
//		for(;line!=null;) {
//			System.out.println(line);
//			line =br.readLine();
//			
//		}
		
	}

}
