package collectionFramework.mapInterface.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		h.put(101, "Arun");
		h.put(102, "Varun");
		h.put(103, "Tharun");
		h.put(104, "Arun");
		
		System.out.println(h); // {101=Arun, 102=Varun, 103=Tharun, 104=Arun}
	
		h.put(103, "Sarun");
		
		System.out.println(h);
		
		System.out.println(h.get(103)); // Sarun
		
		System.out.println(h.get(102)); // Varun
		
		System.out.println(h.get(105)); // null
		
		Object r = h.remove(104);
		System.out.println(r + " Got removed"); // Arun Got removed
		
		System.out.println(h); // {101=Arun, 102=Varun, 103=Sarun}
		
		System.out.println(h.containsKey(103)); // true
		System.out.println(h.containsKey(104)); // false
		
		System.out.println(h.containsValue("Sarun")); // true
		System.out.println(h.containsValue("Sanjay")); // false
		
		System.out.println(h.isEmpty()); // false
		
		//System.out.println(h);
		
		//h.clear();
		
		System.out.println(h); // {}
		
		System.out.println(h.keySet()); // [101, 102, 103] // return in the form of Set
		
		System.out.println(h.values()); // [Arun, Varun, Sarun] // return in the form of Collection
		
		
		 Set s = h.entrySet();
		
		System.out.println(s);
		System.out.println("-----------");
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry e = (Map.Entry)itr.next();
			
			System.out.println(e.getKey()); //101 , 102 , 103 
			System.out.println(e.getValue()); // Arun , Varun , Sarun
			System.out.println("-------------");
			
			if(e.getKey().equals(101)) {
				e.setValue("Motoori");
			}
		}
		System.out.println(h);
	}

}
