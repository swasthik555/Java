package collectionFramework.collectionInterface.setInterface.sortedSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {

	public static void main(String[] args) {
	
// Cannot create a object of the sortedSet.
// create an object for the child/grand child object and assign that to sortedSet interface.
		
		SortedSet<Object> s = new TreeSet<>();
		
		s.add("Arun");
		s.add("Varun");
		s.add("Tharun");
		s.add("Ramesh");
		s.add("Suresh");
		s.add("Arun");
//		s.add(null); // nullpointerexception
//		s.add(3); // nullpointerexception
		
		System.out.println(s);
		
		Object f = s.first();
		
		System.out.println("First object is : "+f);
		
		Object l = s.last();
		
		System.out.println("Last object is : "+l);
		
		SortedSet<Object> h = s.headSet(l);
		
		System.out.println(h);
		
		Comparator<Object> c = s.comparator();
		
		System.out.println(c);
		
		Comparator<Object> co = s.comparator();
		
		System.out.println(co);
		
		System.out.println(s.tailSet("Varun"));
		
		
	}

}
