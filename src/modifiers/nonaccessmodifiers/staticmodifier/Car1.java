package modifiers.nonaccessmodifiers.staticmodifier;

public class Car1 {

	int cost; // Instance variable
	int mileage; // instance variable
	static int wheels = 4; // static variable

	// non-static method //object memory
	public void methodX() {

		System.out.println(wheels); // non - static method access all variable
		System.out.println(cost);
		System.out.println(mileage);
		methodY();
		methodZ();
	}

	public static void methodZ() {

	}

	// Static method. //Class memory
	public static void methodY() {

		// Static methods can only access static stuffs.
		// System.out.println(cost); // can't access non-static method
		System.out.println(wheels);// able to access static variable
		methodZ();
		
		//there is a way
		
		Car1 c1 = new Car1();
		
		System.out.println(c1.cost);
		System.out.println(c1.mileage);
		c1.methodX();

	}

}
