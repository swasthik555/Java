package operators.RelationalOperators;

public class Relational_Operator {

	public static void main(String[] args) {
		System.out.println("Equal To Opertor (==)");
		int a = 34;
		int b = 20;
		int c = 34;
		
		System.out.println(a==b); //false
		System.out.println(a==c); //true
		System.out.println(b==c); //false
		System.out.println("----------------------");
		
		System.out.println("Not Equal To Operator (!=)");
		System.out.println(a!=b);//true
		System.out.println(a!=c);//false
		System.out.println(b!=c);//true
		System.out.println("---------------------------");
		
		System.out.println("Greater than operator (>)");
		System.out.println(a>b);//true
		System.out.println(a>c);//false
		System.out.println(b>c);//false
		System.out.println("----------------------");
		
		System.out.println("Less than operator (<)");
		System.out.println(a<b);//false
		System.out.println(a<c);//false
		System.out.println(b<c);//true
		System.out.println("-------------------");
		
		System.out.println("Greater than or equal to operator (>=)");
		System.out.println(a>=b);//true
		System.out.println(a>=c);//true
		System.out.println(b>=c);//false
		System.out.println("------------------------------");
		
		System.out.println("Less than or equal to operator (<=)");
		System.out.println(a<=b);//false
		System.out.println(a<=c);//true
		System.out.println(b<=c);//true
		System.out.println("---------------------------");
		
		int x = 9;
		int z = 9;

		long d = 34345L;
		long e = 34346L;
		
		float f = 3.23F;
		float g = 1.25F;
		
		double h = 1.12;
		double i = 2.23;
		
		char j = 's';
		char k = 't';
		
		boolean l = true;
	 	boolean m = false;
		
		System.out.println(x==z);//true
		System.out.println(d!=e);//true
		System.out.println(f>g);//true
		System.out.println(h<i);//true
		System.out.println(j<=k);//true
		System.out.println(l==m);//false
	}

}
