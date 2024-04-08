package methods;

public class Method_Calling {

	 static int a = 5, b = 6, c = 8;

	public static void main(String[] args) {

		c = a + b;
		System.out.println("The sum of a and b is = " + c);
		methodA();// method calling statement
		//methodB();// method calling statement
	}

	public static void methodA() {

		System.out.println("Inside methodA");
		methodB();// method calling statement. methodB() calling from methodA(). non main() method calling.
 
	}

	public static void methodB() {

		System.out.println("Inside methodB");
	}

}
