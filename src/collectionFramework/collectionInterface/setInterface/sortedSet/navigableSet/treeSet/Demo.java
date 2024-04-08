package collectionFramework.collectionInterface.setInterface.sortedSet.navigableSet.treeSet;

import java.util.Comparator;

public class Demo implements Comparator {

// Customized sorting for TreeSetClass
	@Override
	public int compare(Object o1, Object o2) {
		
		String i1 = (String)o1;
		
		String i2 = (String)o2;
// Descending order
		//return i2.compareTo(i1);
	
//to get insertion order.
 		//return 1;
		
//to get reverse insertion order
		return -1;
	}

}
