package methods;

public class method_Parameterization {

	public static void main(String[] args) {

		System.out.println("Inside main method");
		methodB();
		methodA(56);
		methodC(453, 5.7, false, 's', "Munavara"); // we have to pass the arguments
	}

	public static void methodA(int a) { // Single Parameterized method

		System.out.println("Inside methodA having single parameter value: " + a);

	}

	public static void methodB() {
		System.out.println("Inside methodB having no parameters");
	}

	public static void methodC(int b, double c, boolean d, char e, String f) {

		System.out.println("Inside methodC having multiple parameter values: " + b + " " + c + " " + d + " " + e + " " + f);

	}
}
