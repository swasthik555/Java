package inheritance;

public class CarParent {

	String carModel;
	int carCost;
	
	//constructor
	public CarParent() {
		
		System.out.println("Inside CarParent constructor");
		
	}

	public void startCar() {
		
		System.out.println("Car Started ");
		System.out.println("Car Model : "+carModel);
		System.out.println("Car cost : "+carCost);
	}

	public void stopCar() {
		
		System.out.println("Car stopped");
		
	}

}