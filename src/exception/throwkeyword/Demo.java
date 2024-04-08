package exception.throwkeyword;

public class Demo {

	public static void main(String[] args) {

		int age = 5;

		try {

			if (age < 6) {
				throw new Exception("Your age is less than 6.");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		if (age >= 6) {

			System.out.println("Welcome to our channel");
		}
	}
}
