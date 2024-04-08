package exception.trycatch;

public class ArrayIndexOutOfBoundExceptions {

	public static void main(String[] args) {
		 
		
		try {	
			int [] a = new int [3];
			a[0] = 5;
			a[1] = 3;
			a[2] = 7;
			a[3] = 9;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is Handled");
		}

	}

}
