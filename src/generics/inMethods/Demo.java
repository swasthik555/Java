package generics.inMethods;

public class Demo {

	public static void main(String[] args) {
		
		ClassA<Integer> cls = new ClassA<>();
		
		cls.a = 9;
		
		cls.methodA();
		
		sampleMethod(cls);
	}
	
	public static void sampleMethod(ClassA<Integer> c) {
		System.out.println(c.a);
		
		
		
	}

}
