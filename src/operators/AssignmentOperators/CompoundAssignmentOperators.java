package operators.AssignmentOperators;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		/* 
		  += Compound Addition Assignment operator
		  -= Compound Subtraction Assignment operator
		  *= Compound Multiplication Assignment operator
		  /= Compound Division Assignment operator
		  %= Compound Modulus Assignment operator
		*/
		System.out.println("Compound Addition Assignment operator");
		int q = 9;
		q+=5; // q = q + 5;
		System.out.println(q);
		System.out.println("--------------------");
		
		System.out.println("Compound Subtraction Assignment operator");
		int w = 6;
		w-=2; // w = w -2;
		System.out.println(w);
		System.out.println("--------------------");
		
		System.out.println("Compound Multiplication Assignment operator");
		int e = 8;
		e*=2; // e = e * 2;
		System.out.println(e);
		System.out.println("--------------------");
		
		System.out.println("Compound Division Assignment operator");
		int r = 14;
		r/=2; // r = r / 2;
		System.out.println(r);
		System.out.println("--------------------");
		
		System.out.println("Compound Modulus Assignment operator");
		int t = 13;
		t%=8; // t = t % 8;
		System.out.println(t);

	}

}
