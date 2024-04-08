package operators.conditionalOperators;

public class ConditionalOperators {

	public static void main(String[] args) {
		System.out.println("Conditional Operator or Ternery operator");
		System.out.println("----------------------------------------");
		int q, r = 5, w = 7, e = 8;
		
		q = (r<w) ? w:e; // r is lesser than w so q is assigned a value of e that is 8.
		
		System.out.println(q);
		System.out.println("------------------------");
		
		int t = 8, y = 10;
		
		String s = (t<y)? "t is less than y" : "t is not less than y";
		System.out.println(s);
		System.out.println("------------------------");
		
		int u = 10;
		u = (u>20) ? -u : u;
		System.out.println(u);
		
		System.out.println("--------------------------------");
		
		int i = 5, o = 6, p = 7;
		System.out.println(i*o+p);
		System.out.println(i*(o+p));
		System.out.println(5*6+10/2-8%3);
		System.out.println("-----------------------------------");
		
		int d;
		d = 5*6+10/2-8%3;
		System.out.println(d);
		System.out.println("----------------------");
		
		
		System.out.println(10>5 && !(5>6)); //true
		
	}
}