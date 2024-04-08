package collectionFramework.collectionInterface.listInterface.linkedListClass;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {

// almost similar method of ArrayList 
		
		LinkedList<Object> link = new LinkedList<>();
		
		link.add("Sanjay"); //0
		link.add("Sujay"); //1
		link.add("Sanjay"); //3
		link.add(2, "9"); //2
		link.add(null);
		
		System.out.println(link ); // [Sanjay, Sujay, 9, Sanjay, null]
		System.out.println(link.get(3)); // Sanjay
		System.out.println(link.get(1)); // Sujay
		
		link.addFirst("Sheera");
		System.out.println(link); // [Sheera, Sanjay, Sujay, 9, Sanjay, null]
		link.addLast("Mubasheera");
		System.out.println(link); // [Sheera, Sanjay, Sujay, 9, Sanjay, null, Mubasheera]
		Object rf = link.removeFirst();
		System.out.println("First Object "+ rf +" got removed." ); // First Object Sheera got removed.
		Object rl = link.removeLast();
		System.out.println("Last Object "+ rl +" got removed."); // Last Object Mubasheera got removed.
		Object gf = link.getFirst();
		System.out.println("First object is "+gf); // First object is Sanjay
		Object gl = link.getLast();
		System.out.println("Last object is "+gl); // Last object is null

// LinkedList and List specific method cannot be access
//only Parent interface(Collection) method can be access 
		//Collection <Object> names = new LinkedList<>();
		//names.addFirst();
		
//LinkedList specific method cannot be access
//Collection and List method can be access.
		//List<Object> obj = new LinkedList<>();
		
	}

}
