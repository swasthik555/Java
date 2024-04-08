package exception.multiplecatchblocks;

public class Demo {
	
	public static void main(String[] args) {
		
		try {
//			int [] x= new int[2];
//			x[0] = 4;
//			
//			int y = 10/0;
			
			String str = "Sanjay";
			str.charAt(55);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Handled");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOf Bound is Handled");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBounds is Handled");
		}
		catch (Exception e) {
			System.out.println("Exception is Handled");
		}catch (Throwable e) {
			System.out.println("Error got handled");
		}
		
	}

}
