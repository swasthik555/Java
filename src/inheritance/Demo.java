package inheritance;

public class Demo {

	public static void main(String[] args) {
		
		BenzChild b = new BenzChild();
		
		b.carCost = 100;
		b.carModel = "oModel";
		b.startCar();
		b.numberOfGears = 6;
		b.openSunRoof();
		b.stopCar();
		
		

	}

}