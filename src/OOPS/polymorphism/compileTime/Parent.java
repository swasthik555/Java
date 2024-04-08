package OOPS.polymorphism.compileTime;

public class Parent {
	
// Constructor
	
// Overloading - number of parameters
	
	public Parent(int a, int b) {
		
		
	}
	
public Parent(int a, int b, int c) {
		
		
	}

//Overloading - type of parameters

public Parent(int a, float b) {
	
	
}

//Overloading - order of parameters

public Parent(float a, int b) {
	
	
}
	
	
// Methods

// Overloading - number of parameters

	public void add(int a, int b) {

		System.out.println(a + b);

	}

	public void add(int a, int b, int c) {

		System.out.println(a + b);

	}

// Overloading - type of parameters

	public void add(int a, float b) {

		System.out.println(a + b);

	}

//Overloading - order of parameters

	public void add(float a, int b) {

		System.out.println(a + b);

	}
}
