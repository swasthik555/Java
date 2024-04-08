

import java.util.ArrayList;
import java.util.HashSet;

public class ConverArrayListToHashSet {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("Arun");
		alist.add("Tharun");
		alist.add("Varun");
		alist.add("Arun");
		
		System.out.println(alist);
		
		
		HashSet<String> hset = new HashSet<>(alist);
		
		System.out.println(hset);
		
	}

}
