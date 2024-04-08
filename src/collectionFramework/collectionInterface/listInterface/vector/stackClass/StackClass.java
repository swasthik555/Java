package collectionFramework.collectionInterface.listInterface.vector.stackClass;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {

		Stack<Object> st = new Stack<>();
		
		st.push("pentagon");
		st.push("sapient");
		st.push("golden");
		st.push("sachs");
		st.push(null);
		
		System.out.println(st);
		
		System.out.println(st.pop()); // Retrieve the last dropped element and remove it
		
		System.out.println(st);
		
		System.out.println(st.peek()); // Retrieve the top element but won't remove it.
		
		System.out.println(st);
		
		System.out.println(st.empty()); // false
		
		System.out.println(st.search("sapient")); // 3
		System.out.println(st.search("pentagon")); // 4
		System.out.println(st.search(null)); // -1
		
		
	}

}
