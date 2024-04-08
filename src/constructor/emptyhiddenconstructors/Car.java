package constructor.emptyhiddenconstructors;

public class Car {
	
	String carModel;
	
	//No Constructor
	// Java compiler  - create a constructor internally
	// Hidden and Empty constructor
	// public Car(){}
	
	public void carDetails() {
		
		System.out.println("The model of the car is : "+carModel)
		;
		
	}

}
