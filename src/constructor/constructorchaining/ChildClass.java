package constructor.constructorchaining;

public class ChildClass extends ParentClass{
	
	public ChildClass() {
		
		System.out.println("Inside Child Class constructor");
	}
	
	public ChildClass(int a) {
		
		System.out.println("Inside single parameterized Child Class constructor");
	}

}
