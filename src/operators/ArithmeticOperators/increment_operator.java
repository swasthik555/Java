package operators.ArithmeticOperators;

public class increment_operator {

	public static void main(String[] args) {
		//prefix increment operator
		int a = 9;
		++a;
		System.out.println(a);
		
		//*********************************
		
		//postfix increment operator
		int b = 8;
		b++;
		System.out.println(b);
		
		//*******************************
		
		//difference of prefix and postfix
		
		int c = 5;
		System.out.println(c); //5
		System.out.println(++c); //6 "first increment the value of c by 1 then print" 
		System.out.println(c); //6
		
		System.out.println("-------------------------------");
		
		int d = 5;
		System.out.println(d); //5
		System.out.println(d++); //5 "first print the value of d then increment"
		System.out.println(d); //6
	
		System.out.println("------------------------------");
		
		int e = 2;
		int f = 3;
		
		int g = ++f;
		int h = e++;
		
		System.out.println(e);//3
		System.out.println(f);//4
		System.out.println(g);//4
		System.out.println(h);//2  
		
		System.out.println("********************************");
		
		char q = 's';
		System.out.println(++q);
		
		System.out.println("__________________________");
		
		double p = 3.5678;
		System.out.println(++p);
		
		System.out.println("_____________________________");
		
		
	}

}
