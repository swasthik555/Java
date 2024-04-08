package flowControl.selectionStatement;

public class If_else_statement {

	public static void main(String[] args) {
		int a = 6, b = 8;

		if (a < b) {
			System.out.println("inside if block");
		} else {
			System.out.println("Inside else block");
		}
		System.out.println("--------------------------");

		if (a > b) {
			System.out.println("inside if block");
		} else {
			System.out.println("inside else block");
		}
		System.out.println("-------------------------------");

		System.out.println("Nested if-else statement");

		int c = 6, d = 5;

		if (c >= d) {
			if (a == b) {
				System.out.println("c is equal to d");
			} else {
				System.out.println("c is greater than d");
			}
		} else {
			System.out.println("c is less than b");
		}
		System.out.println("____________________________________");
		
		int e = 5, f=9;
		
		if(e<f) {
			System.out.println("e is less than f");
			}
		else {
			if(e==f) {
				System.out.println("e is equal to f");
			}else {
				System.out.println("e is greater than f");
			}
		}
		
		System.out.println("___________________________________");
		System.out.println("Conditional if else statement");
		
		int g = 6, h=5;
		
		System.out.println((g<h)?"g is less than h": "g is greater than h");
		
		
	}

}
