package interfaces.interfaceandMethodBody;

public interface Bank {
	
	void methodA(); // by default abstract and public
	
	static void methodB() {
		
		System.out.println("Inside static methodB of bank interface");
		
	}
	
	default void methodC() {
		
		System.out.println("Inside default methodC of bank interface");
		
	}

}
