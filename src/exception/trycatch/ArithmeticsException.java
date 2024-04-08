package exception.trycatch;

public class ArithmeticsException {

	public static void main(String[] args) {
		
		try {
			int a = 10/0; // Exception - ArithmeticException
		}catch(ArithmeticException e){
			
			System.out.println("Arithmetic Exception Handled");
		
		}

	}

}
