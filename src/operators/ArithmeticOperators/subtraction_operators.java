package operators.ArithmeticOperators;

public class subtraction_operators {

	public static void main(String[] args) {
		int i = 5;
		int j = 3;
		int k = i-j;
		System.out.println(k); //2
		
		//*********************************
		
		System.out.println(5-6); //-1  subtracting integer literals
		
		//**********************************
		
		System.out.println(1.23F - 3.69F); //-2.46 subtracting floating literals
		
		//**********************************
		
		System.out.println(1.23 - 3.69); //-2.46 subtracting decimal literals
		
		//**********************************
		
		System.out.println('s' - 't'); //-1  (115-116) subtracting character literals
		
		//**********************************
		
		int a = 10;
		int b = 25;
		int c = a-b;
		System.out.println(c); // performing subtraction operation on the variables and assigning the result to another variables. 

		//**********************************
		
		int d = 10;
		int e = 25;
		System.out.println((d-e)); //subtracting the values stored in the variables.
		
		//**********************************
		
		int z = 20;
		int x = 4;
		int y;
		y = z-x;
		System.out.println(y); // 24 performing subtraction operation on the variables and assigning the result to another variables
		
		//**********************************
		
		System.out.println(5 - 4.56); // subtracting integer literals with double literals, results are updated to the double literals.
		
		//**********************************
		
		System.out.println(3.56F - 1.34); // subtracting floating literals with decimal literals, results are updated to the double literals.
		
		//**********************************
		
		System.out.println(5 - 's'); //subtraction of integer and character literals.
		
		
	}

}
