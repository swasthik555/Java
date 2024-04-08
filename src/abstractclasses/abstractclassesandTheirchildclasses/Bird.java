package abstractclasses.abstractclassesandTheirchildclasses;

public abstract class Bird extends Animal{

	@Override
	public void eating() {
		
		System.out.println("Bird is eating");
		
	}

// If i don't want to implement a sleeping method in this child class then i have to make this class as abstract class

}
