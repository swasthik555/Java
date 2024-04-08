package collectionFramework.collectionInterface.setInterface.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<Object> h = new HashSet<>();
		
	    h.add("Arun"); // boolean object
		h.add("Varun");
		h.add("Tharun");
		h.add(9);
		h.add(3.56);
		h.add(true);
		h.add(null);
		h.add('s');
		h.add("Arun"); //false  //Ignored //but this object won't be inserted
		
		System.out.println(h);
		
		
// to retrieve the object use for-each OR Iterator method
		
		for(Object temp:h) {
			System.out.println(temp);
		}
		
		//OR
		
		 Iterator<Object> itr = h.iterator();
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
//
		
		
		
		
		
	}

}