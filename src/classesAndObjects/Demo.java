package classesAndObjects;

/* 
 * In java variables and methods should compulsory comes inside a class, else we get a compiler error.
 * Static variable declare inside the static method only, if not we get compiler error.
 * we can't declare static variable inside a non-static method.
 */

public class Demo {

	static int a = 5, b = 8;

	public static void main(String[] args) {
		int c = 7;

		System.out.println("The sum of a, b and c is : " + (a + b + c));

		methodA();
	}

	public static void methodA() {

		System.out.println("Inside methodA");

	}

}