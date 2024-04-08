package methodChaining;

import java.util.ArrayList;

public class Sample1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<>();
		
		alist.add(9);
		alist.add(5);
		alist.add(7);
		
		boolean b = alist.iterator().hasNext();
		
		System.out.println(b);
		
		
	}

}
