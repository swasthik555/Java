package methods.thiskeywordforreturningthecurrentclassinstance;

public class ClassA {
	
	int a,b;
	
	public ClassA() {
		
		a = 3;
		b = 6;
		
	}
	
	public void displayDetails() {
		
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b );
	}
	
	public ClassA returnCurrentClassObject() {
		
		return this;  // instance or object of the current class is returned
	}

}
