package scannerClass;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number : ");

		int a = sc.nextInt();

		System.out.println("Enter a second number : ");

		int b = sc.nextInt();

		System.out.println("Choose your operator = +, -, *, / : ");

		char op = sc.next().charAt(0);

		switch (op) {

		case '+':
			int c = a + b;
			System.out.println(c);
			break;

		case '-':
			int c1 = a - b;
			System.out.println(c1);
			break;

		case '*':
			int c2 = a * b;
			System.out.println(c2);
			break;

		case '/':
			int c3 = a / b;
			System.out.println(c3);
			break;

		default:
			System.out.println("Entered a wrong operator");
		}

		sc.close();
	}

}
