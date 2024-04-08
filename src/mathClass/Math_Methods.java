package mathClass;

public class Math_Methods {

	public static void main(String[] args) {
		
// max() math class
		
		int a = Math.max(6, 8);
		System.out.println(a); // 8
		
		System.out.println("-------------------");
		
// min() math method
		
		int b = Math.min(5, 7);
		System.out.println(b); //7
		
		System.out.println("--------------------");
		
// random() math method
		
		double c = Math.random();
		System.out.println(c); // returns different decimal values
		// if we want a random value more than 1 then we should convert to int type and multiply by any number 
		
		double d = Math.random();
		
		int e = (int)(d*100);
		System.out.println(e);
		
		System.out.println("---------------------");	

	}

}
