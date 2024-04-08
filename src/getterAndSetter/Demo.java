package getterAndSetter;

public class Demo {

	public static void main(String[] args) {

		Car c = new Car();

		c.setCost(1000);
		c.setColor("Red");
		c.setModel("Benz");
		
		System.out.println("The cost of the car is : "+c.getCost());
		System.out.println("The color of the car is : "+c.getColor());
		System.out.println("The model of the car is : "+c.getModel());
		
	}

}
