package methods;

public class Method_Returning_Values {

	public static void main(String[] args) {
		int s = sum1(4, 6);
		System.out.println(s); //OR
		//System.out.println(sum1(4,8));

		double w = sub(8.8, 5.6);
		System.out.println(w);

		int r = simple();
		System.out.println(r);
		
		String t = word();
		System.out.println(t); //OR
		//System.out.println(string());

		char y = symbol('s','t');
		System.out.println(y);
	}

	public static int sum1(int d, int e) {
		int sum = d + e;
		return sum; // transfer statement
	}

	public static double sub(double i, double j) {
		return i - j;
	}

	public static int simple() {
		return 5;
	}
	
	public static String word() {
		return "Sanjay";
		
	}
	
	public static char symbol(char z, char x) {
		return (char) (z + x);
	}
}
