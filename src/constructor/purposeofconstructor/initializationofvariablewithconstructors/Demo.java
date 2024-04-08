package constructor.purposeofconstructor.initializationofvariablewithconstructors;

public class Demo {

	public static void main(String[] args) {
		//object
		Car honda = new Car("Honda Brio",450000,"Blue");
		
		honda.carDetails();

		Car benz = new Car("Benz", 4700000, "Red");

		benz.carDetails();

		Car audi = new Car("Audi", 12000000, "White");
	
		audi.carDetails();

	}

}
