package collectionFramework.mapInterface.Hashtable;

import java.util.Hashtable;

public class HashtableClass {

	public static void main(String[] args) {
		
		Hashtable<Object, Object> h = new Hashtable<>();
		
		h.put(101, "Arun");
		h.put(102, "Varun");
		h.put(103, "Tharun");
		
		System.out.println(h); 
		
		System.out.println(h.get(103));
	}

}
