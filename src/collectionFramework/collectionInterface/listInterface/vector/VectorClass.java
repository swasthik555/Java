package collectionFramework.collectionInterface.listInterface.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		
		v.add("Sanjay");
		v.add("Sujay");
		
		System.out.println(v);
		Object gt = v.get(1);
		System.out.println(gt);
		v.add(1, "Shobha");
		System.out.println(v);
		v.addElement(true);
		v.addElement(3.56);
		v.addElement(null);
		
		System.out.println(v.elementAt(2));
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.removeElementAt(3);
		System.out.println(v);
//		v.removeAll(v);
//		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.size());
		v.removeElement("Sanjay"); // remove the first element
		System.out.println(v);
		
		Enumeration<Object> en = v.elements();
		
		while(en.hasMoreElements()) { //true 3 objects are there
			System.out.println(en.nextElement());
		}
		
		
		
		
	}

}
