package classesAndObjects;

public class Demo1 {

	public static void main(String arg[]) {

		Car maruti = new Car(); // new object will be created for Car class
		Car Honda = new Car(); // second object creation statement
		Car benz = new Car(); // third object creation statement

		maruti.carModel = "Swift VDI ";
		maruti.cost = 800000;
		maruti.color = "white";
		
		maruti.startCar();
		maruti.stopCar();
		maruti.carDetails();

		Honda.carModel = "Brio";
		Honda.cost = 900000;
		Honda.color = "Blue";
		
		Honda.startCar();
		Honda.stopCar();
		Honda.carDetails();

		benz.carModel = "Benz V class";
		benz.cost = 5000000;
		benz.color = "purple";
		
		benz.startCar();
		benz.stopCar();
		benz.carDetails();
	}

}

class Car {

	String carModel;
	int cost;
	String color;

	public void startCar() {

		System.out.println(carModel + "started");
	}

	public void stopCar() {

		System.out.println(carModel + "stopped");
	}

	public void carDetails() {
		System.out.println("The model of the car is : " + carModel);
		System.out.println("The cost of the car is : " + cost);
		System.out.println("The color of the car is : " + color);
		System.out.println("____________________________________");

	}

}

