package exception.trycatch;

public class First {
	
	public static void main(String[] args) {
		
		System.out.println("Before");
		
		try {
		int a = 10/0; // Exception OR run time error
		}catch(Exception e) {
			System.out.println("exception Handled");
		}
		
		System.out.println("After");
		System.out.println("After");
		System.out.println("After");
		System.out.println("After");
		System.out.println("After");
		
		System.out.println("-----------------------------");
		
System.out.println("Before");
		
		try {
		int a = 10/2; // No Exception
		}catch(Exception e) {
			System.out.println("Exception Handled");
		}
		
		System.out.println("After");
		System.out.println("After");
		System.out.println("After");
		System.out.println("After");
		System.out.println("After");
		
		System.out.println("-----------------------");
		
// variable declared inside the try block and catch block, we can't call outside of the blocks		
		try {
			
			int a = 5; // the scope of this variable is a upto try block itself
			
		}catch (Exception e) {
			
		}
		
	}

}
