package constructor.thiskeywordinconstructor;

public class Car {
	//instance variable
	String carModel;
	int carCost;
	double carMileage;
	
	//constructors
	public Car(String carModel, int carCost, double carMileage) {
		
		this.carModel = carModel; //this keyword highlights a instance variable 
		this.carCost = carCost;
		this.carMileage = carMileage;
		
	}

}
