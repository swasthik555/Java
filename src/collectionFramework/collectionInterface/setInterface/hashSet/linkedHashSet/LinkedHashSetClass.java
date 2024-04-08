package collectionFramework.collectionInterface.setInterface.hashSet.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> hs = new LinkedHashSet<>();
		
		hs.add("Sanjay");
		hs.add("Sujay");
		hs.add("Sanjay"); // duplicates object will be ignored.
		hs.add(null);
		System.out.println(hs.add("Shobha"));  // true
		System.out.println(hs.add("Shobha")); // false
		
		System.out.println(hs);
		
// to retrieve the object use for-each OR Iterator method
		
		for(Object temp:hs) {
			System.out.println(temp);
		}
		
	// OR 
		
		Iterator<Object> itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
