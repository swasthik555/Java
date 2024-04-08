package collectionFramework.collectionInterface.setInterface.sortedSet.navigableSet.treeSet;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
	//	TreeSet<Object> t = new TreeSet<>(new Demo()); // Default sorting order

//		t.add("Arun");
//		t.add("Varun");
//		t.add("Tharun");
//		t.add("Karun");
//		t.add("Sarun");
//		t.add("Tharun");
		
// compareTo() method internally compare to ascending order
//		t.add(9);
//		t.add(1);
//		t.add(7);
//		t.add(3);
//		t.add(25);
//		t.add(13);
//		t.add(8);
		
	//	System.out.println(t);
		
System.out.println("---------------------------------------");

	TreeSet<Object> ts = new TreeSet<Object>();
	
	ts.add(9);
	ts.add(3);
	ts.add(6);
	ts.add(1);
	ts.add(25);
	ts.add(13);
	ts.add(8);
	ts.add(56);
	
	System.out.println("SortedSet methods");
	System.out.println(ts);
	
	System.out.println(ts.first()); // after sorting first object
	
	System.out.println(ts.last()); // after sorting last object
	
	System.out.println(ts.headSet(9)); // after sorting before 9 all numbers are printed.
	
	System.out.println(ts.tailSet(6)); // after sorting after 6 all numbers are printed.
	
	System.out.println(ts.subSet(6, 25)); // after sorting print the in between number from 6 to 25. including 6 and excluding 25
	
	System.out.println("---------------------------------------");
	System.out.println("NavigableSet methods");
	
	System.out.println(ts);
	
	System.out.println(ts.lower(9)); // <9 and find the greatest // 8
	
	System.out.println(ts.higher(9)); // >9 and find the least // 13
	
	System.out.println(ts.floor(10)); // <=10 and find the greatest // 9
	
	System.out.println(ts.ceiling(9)); // >=9 and find the least // 9
	
	System.out.println(ts.descendingSet()); // [56, 25, 13, 9, 8, 6, 3, 1]
	
	System.out.println(ts.pollFirst()); // 1  // this method remove the first object from the array.
	System.out.println(ts); // [3, 6, 8, 9, 13, 25, 56]
	
	System.out.println(ts.pollLast()); // 56 // this method remove the last object from the array.
	System.out.println(ts); // [3, 6, 8, 9, 13, 25]
		
	}

}
