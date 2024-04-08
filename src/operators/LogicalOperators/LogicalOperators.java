package operators.LogicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;
		
		System.out.println("Logical And Operator (&&)");
		System.out.println(a&&b);//false
		System.out.println(b&&c);//false
		System.out.println(b&&d);//false
		System.out.println(a&&c);//true
		System.out.println("--------------------------);");
		
		System.out.println("Logical Or Operator (||)");
		System.out.println(a||b);//true
		System.out.println(b||c);//true
		System.out.println(b||d);//false
		System.out.println(a||c);//true
		System.out.println("------------------------");
		
		System.out.println("Logical Not operator (!)");
		System.out.println(!a);//false
		System.out.println(!b);//true

	}

}
