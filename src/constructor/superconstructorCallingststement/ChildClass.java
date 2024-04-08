package constructor.superconstructorCallingststement;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		
		super(7,56);
		
		System.out.println("Inside Child Class constructor");
	
	}
	
	public ChildClass(int c) {
		
		System.out.println("Inside Child Class constructor having the value as "+c);
	}

}
