package modifiers.nonaccessmodifiers.staticmodifier;

public class Demo1 {

	public static void main(String[] args) {
		
		Car1 benz = new Car1();
		
		benz.cost = 6700000;
		benz.mileage = 20;
		System.out.println("The number of wheels in the benz is : "+Car1.wheels);
		
		Car1 audi = new Car1();
		
		audi.cost = 3500000;
		audi.mileage = 15;
		System.out.println("The number of wheels in the audi is "+Car1.wheels);

	}

}
