package constructor.purposeofconstructor.initializationofvariablewithoutconstructors;

public class Demo {

	public static void main(String[] args) {
		//object
		Car honda = new Car();
		honda.carModel = "Honda Brio";
		honda.carCost = 450000;
		honda.carColor = "Blue";

		honda.carDetails();

		Car benz = new Car();
		benz.carModel = "Benz Aclass";
		benz.carCost = 4578900;
		benz.carColor = " blue";

		benz.carDetails();

		Car audi = new Car();
		audi.carModel = "audi v8";
		audi.carCost = 450258586;
		audi.carColor = "White";

		audi.carDetails();

	}

}
