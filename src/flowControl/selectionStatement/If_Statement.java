package flowControl.selectionStatement;

public class If_Statement {

	public static void main(String[] args) {
		System.out.println("Before if block");

		if (true) {
			System.out.println("Inside if block");
		}
		System.out.println("after if block");
		System.out.println("---------------------------");

		int a = 6, b = 3;
		if (a < b) {
			System.out.println("a is less than b");
		}
		System.out.println("a is more than b");
		System.out.println("----------------------------");

		if (a > b || 3 > 9) {
			System.out.println("Inside if block");
		}
		System.out.println("Out of if block");
	}

}
