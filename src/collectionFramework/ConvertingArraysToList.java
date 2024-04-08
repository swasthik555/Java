package collectionFramework;

import java.util.Arrays;
import java.util.List;

public class ConvertingArraysToList {

	public static void main(String[] args) {
		
		String[] s = {"Arun","Varun","Tharun"};
		
		List<String> l = Arrays.asList(s);
		
		System.out.println(l);
		
		System.out.println(l.get(1));
		
	}

}
