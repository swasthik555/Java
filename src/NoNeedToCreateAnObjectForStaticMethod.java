

public class NoNeedToCreateAnObjectForStaticMethod {
	
	// If we create a static method then no need to create a object of the class to call that method
	
	public static void add(long a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a, long b, float c) { 
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		NoNeedToCreateAnObjectForStaticMethod.add(56, 44);
		NoNeedToCreateAnObjectForStaticMethod.add(3, 450, 3.5F);
	}

}
