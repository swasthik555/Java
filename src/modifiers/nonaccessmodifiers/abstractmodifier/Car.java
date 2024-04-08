package modifiers.nonaccessmodifiers.abstractmodifier;

public abstract class Car {
	
	public void methodX() {
		System.out.println("Inside methodX of Car");
		
	}
	
	public abstract void methodY();
	
	//Class should be specified as abstract
	// method shouldn't have a body
	//child classes of this class is implement the abstract method
	//In child class we don't have to add abstract
	
}
