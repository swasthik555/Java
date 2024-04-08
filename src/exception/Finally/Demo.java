package exception.Finally;

public class Demo {

	public static void main(String[] args) {

		int q = 10, w = 0;

		try {
			
			System.out.println("Inside try block");
			int e = q / w;
			
		} catch (Exception e) {
			
			System.out.println("Exception got handled, Inside catch block");
			
		}finally {
			System.out.println("This finally block will be executed irrespective of any exception in try block");
		}
		System.out.println("End of the program");

	}

}
