package constructor.purposeofconstructor.initializationofvariablewithconstructors;

public class Car {
	
	String carModel;
	int carCost;
	String carColor;
	
	//Parameterized constructors
	public Car(String cM, int cC, String cCol) {
		
		carModel = cM;
		carCost = cC;
		carColor = cCol;
		
		
	}
	
	//method
	public void carDetails() {
		
		System.out.println("Model of the car is : "+carModel);
		System.out.println("Cost of the car is : "+carCost);
		System.out.println("Color of the car is : "+carColor);
		System.out.println("--------------------------------");
	}

}
