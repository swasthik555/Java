package operators.ArithmeticOperators;

public class addition_operators {

	public static void main(String[] args) {
		int i = 5;
		int j = 3;
		int k = i+j;
		System.out.println(k); //8
		//*********************************
		
		System.out.println(5+6); //11  adding integer literals
		
		//**********************************
		
		System.out.println(1.23F + 3.69F); //4.92 adding floating literals
		
		//**********************************
		
		System.out.println(1.23 + 3.69); //4.92 adding decimal literals
		
		//**********************************
		
		System.out.println('s' + 't'); //231  (115+116) adding character literals
		
		//**********************************
		
		System.out.println("Sanjay" +" "+ "acharya"); // Sanjay acharya  Concatinating the Strings
		
		//**********************************
		
		int a = 10;
		int b = 25;
		int c = a+b;
		System.out.println(c); // performing addition operation on the variables and assigning the result to another variables. 
		
		//**********************************
		
		int d = 10;
		int e = 25;
		System.out.println((d+e)); //adding the values stored in the variables
		
		//**********************************
		
		int z = 20;
		int x = 4;
		int y;
		y = z+x;
		System.out.println(y); // 24 performing addition operation on the variables and assigning the result to another variables
		
		//**********************************
		
		System.out.println(5 + 4.56); // adding integer literals with double literals, results are updated to the double literals.
		
		//**********************************
		
		System.out.println(3.56F + 1.34); // adding floating literals with decimal literals, results are updated to the double literals.
		
		//**********************************
		
		System.out.println(5 + 's'); //addition of integer and character.
		
		//**********************************
		
		System.out.println(5 + "Sanjay"); //adding integer literals with String literals. Concatenation
		
		//**********************************
		
		int u = 5;
		
		String t = u + "Sanjay";
		
		System.out.println(t);
		
		//**********************************
		
		int Q = 5;
		
		System.out.println("Value stored in the variable Q is " + Q);
		
		//**********************************
		
		int p = 8;
		String l = "Sanjay";
		String w = p + l;
		boolean g = true;
		System.out.println("addition of Integer and String is "+w + " answer is " +g );
		
		
		

	}

}
