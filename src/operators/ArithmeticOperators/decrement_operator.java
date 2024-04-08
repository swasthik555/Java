package operators.ArithmeticOperators;

public class decrement_operator {

	public static void main(String[] args) {
		System.out.println("Prefix decrement operator"); 
		int a = 8;
		 
		 --a;
		 System.out.println(a); //7
		 
		 System.out.println("----------------------------");
		 
		 System.out.println("Postfix decrement operator");
		 
		 int b = 5;
		 b--;
		 System.out.println(b);//4
		 
		 System.out.println("----------------------------");
		 
		 int c =10;
		 System.out.println(c);//10
		 System.out.println(--c);//9
		 System.out.println(c);//9 
		 System.out.println(c--);//9
		 System.out.println(c);//8
		 
		 System.out.println("----------------------------");
		 
		 int d = 8;
		 int e = 3;
		 
		 int f = --e;
		 int g = d--;
		 
		 System.out.println(d);//7
		 System.out.println(e);//2
		 System.out.println(f);//2
		 System.out.println(g);//8
		 
		 System.out.println("----------------------------");
		 
		 char q = 's';
		 System.out.println(--q);
		 
		 System.out.println("----------------------------");
		 
		 double p = 3.5678;
		 System.out.println(--p);
		 
		 System.out.println("----------------------------");
		 
		 
		 
	

	}

}
