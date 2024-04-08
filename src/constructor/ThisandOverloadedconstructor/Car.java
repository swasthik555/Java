package constructor.ThisandOverloadedconstructor;

public class Car {
	
	public Car() {
		
		this(45); //parameter of the 'this' constructor decides which constructor is to be called.		
		System.out.println("Inside Car constructor - No parameter");
	}

	public Car(int x) {
		
		
		this(3,6); //parameter of the 'this' constructor decides which constructor is to be called.
		
		System.out.println("Inside Car constructor - Single parameter : "+x);
	}
	
	public Car(int a, int b) {
		
		System.out.println("Inside Car constructor - Two parameters : "+a+", "+b);
		
		}
}
