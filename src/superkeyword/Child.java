package superkeyword;

public class Child extends Parent{

	int a = 9;
	
	public void methodX() {
		
		System.out.println("Child Class method");

	}
	
	public void methodY() {
		super.methodX();
	}
}
