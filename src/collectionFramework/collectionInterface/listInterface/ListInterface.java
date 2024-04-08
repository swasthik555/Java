package collectionFramework.collectionInterface.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	
	public static void main(String[] args) {
		
		// we can use all the methods of list interface as well as collection interface because it is a child of collection interface
		
		
		List<Object> l = new ArrayList<>();
		
		l.listIterator();
		l.get(2);
		l.clear();
		
	
		
	}

}
