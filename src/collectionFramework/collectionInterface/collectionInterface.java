package collectionFramework.collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class collectionInterface {
	
	public static void main(String[] args) {
		
		// we can use all the methods of list interface as well as collection interface.
		
		
		Collection<Object> l = new ArrayList<Object>();
		
		l.add(l);
		l.addAll(l);
		l.contains(l);
		l.clear();
		l.remove(l);
		l.iterator();
	
		
	}

}
