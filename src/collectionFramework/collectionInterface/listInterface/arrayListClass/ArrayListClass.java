package collectionFramework.collectionInterface.listInterface.arrayListClass;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<String> arrl = new ArrayList<>();

// add() method for adding the objects into the ArrayList
// Heterogeneous object (Insert all kind of objects)		
		arrl.add("Sanjay"); // 0
		arrl.add("Sujay"); // 1
		arrl.add("Sheera"); // 2
		arrl.add("Mubasheera"); // 3
		arrl.add("Sanjay"); // 4
//		arrl.add(null); // 5
//		arrl.add(56);
//		arrl.add(true);
//		arrl.add('s');
		
		//System.out.println(arrl);
		
// get(index) method for retrieving the objects from the ArrayList		
		
		//Object obj = arrl.get(0);
		
		//System.out.println(obj);
		
		//System.out.println(arrl.get(1));
		//System.out.println(arrl.get(2));
		//System.out.println(arrl.get(3));
		//System.out.println(arrl.get(4));
		
// size() method for finding the size of the ArrayList
		
		//int sze = arrl.size();
		//System.out.println(sze);
		
//for loop to retrieving the objects from the ArrayList
		
		//for(int i=0;i<arrl.size();i++) {
			//System.out.println(arrl.get(i));
		//}
		
//for-each loop to retrieving the objects from the ArrayList
		
		//for(Object temp : arrl) {
		//System.out.println(temp);
		//}
		
//remove(object) method for removing the objects from the ArrayList
		
		//Object obj1 = arrl.remove(3);
		//System.out.println(arrl);
		
		//arrl.remove("Sujay");
		//System.out.println(arrl);
		
// clear() method to remove all the object from the ArrayList
		
		//arrl.clear();
		//System.out.println(arrl);
		
// isEmpty() method to check the ArrayList is empty or not
		
		//boolean b = arrl.isEmpty();
		//System.out.println(b); // false
		//arrl.clear();
		//System.out.println(arrl.isEmpty()); // true
		
// contains(Object) method to check the object is present or not
		
		//System.out.println(arrl.contains("Mubasheera")); // true
		//System.out.println(arrl.contains("Shobha"));  //false
		
// toArray() method to convert the ArrayList to Array
		
		//Object[] obj = arrl.toArray();
		//System.out.println(obj[2]);
		
// add(index, object) method to add the object at the specified location
		
		//arrl.add(2, "Mary");
		//System.out.println(arrl);
		
// remove(index) method to remove the object at the particular location
		
		//Object re = arrl.remove(8);
		//System.out.println("The object "+re+" removed");
		
// set(index, object) method to replace the object value
		
		//Object sr = arrl.set(8, "Hindu");
		//System.out.println("The object "+sr+" is replaced by Hindu");
		
// indexOf(object) method to retrieve the index value by providing the object 
		
		//int i = arrl.indexOf("Sheera");
		//System.out.println(i); //2
		
// lastIndexOf() method to retrieve the last object of the duplicate objects
		
		//System.out.println(arrl.lastIndexOf("Sanjay")); //4
		
// only able to access the collection interface methods
		
		//Collection<String>  list = new ArrayList<>();
		//list.add("Me");
	//	list.add(2, "Arun"); // Error because add(index, object) is belongs to List Interface

// Collections.sort(arrl) method of utility class to sort the ArrayList by alphabetical ascending order
		
		//Collections.sort(arrl);
		//System.out.println(arrl); // [Mubasheera, Sanjay, Sanjay, Sheera, Sujay]
	
//iterator() method to iterating and retrieving the ArrayList object one by one
//listIterator() method is the advanced version of the iterator() method				
		
		//Iterator<String> itr = arrl.iterator();
		//while(itr.hasNext()) {			
			//System.out.println(itr.next());			
		//}
	
	//----------------------
		
		ListIterator<String> litr = arrl.listIterator();
		litr.next(); //Points the first object
		litr.next(); //Points the second object
		litr.next(); //Points the third object
		litr.next(); //Points the fourth object
		litr.next(); // Points the fifth object
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous()); // Sanjay
		}
		
	
// Storing specific type of objects by specifying the wrapper classes, String, Objects etc.
		
		//ArrayList<String> names = new ArrayList<String>();
		
		//names.add("Sandesh");
		//names.add("Poornima");
		//String str = names.get(1);
		//System.out.println(str);
		//int size = names.size();
		//System.out.println(size);
		//for(int i=0;i<names.size();i++) {
			//System.out.println(names.get(i));
		//}
		//for(String temp :names) {
			//System.out.println(temp);
		//}
		//boolean b = names.remove("Poornima");
		//System.out.println(names);
		
//----------------------------------
		
		//ArrayList<Character> sym = new ArrayList<Character>();
		//System.out.println(sym);
		//sym.add('w');
		//sym.add('s');
		//System.out.println(sym.size());
	
// Like the above we can create a ArrayList for other Wrapper classes
//--------------------------------------------
		

// 
		
		
		
	}

}
