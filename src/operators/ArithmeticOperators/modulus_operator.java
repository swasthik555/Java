package operators.ArithmeticOperators;

public class modulus_operator {

	public static void main(String[] args) {
		System.out.println(20 % 5); //0
		
		//***************
		
		System.out.println(10.23F % 5.12F); 
		
		//*************8
		
		System.out.println(10.23 % 5.12);
		
		//******************
		
		System.out.println('s' % 'd'); //115 % 100 = 15
		
		//********************8
		
		int a = 21;
		int b = 5;
		System.out.println(a % b); //1
		
		//***************
		
		int c = 22;
		int d = 5;
		int e = c%d;
		System.out.println(e); //2
		
		//**************************
		
		System.out.println(3.14 % 2); //double literals
		
		//**********************
		
		System.out.println(3.14 % 1.25F); //double literals
		
		//*************************
		
		System.out.println('s' % 100);  //115%100 = 15

	}

}
