package flowControl.iterativeStatement;

public class While_loop {

	public static void main(String[] args) {

		int a = 5, b = 7;

		while (a <= b) {
			System.out.println("sanjay");
			b -= 1;

		}
		
		System.out.println("________________________");
		//----------------------------------------------------------------
		
		int i =3;
		
		while(i>0) {
			System.out.println("Munavara");
			i--;
		}
		System.out.println("_______________________");
		//----------------------------------------------------------------
		
		int j = 0;
		while(j<10) {
			System.out.println("The value of j is "+j);
			++j;
		}
		System.out.println("____________________________");
	
		//----------------------------------------------------------------
		
		System.out.println("Find the mid value of 1 and 11");
		float q = 0.5f;
		float w = 10;
		while(++q<--w) {
			
		}
		System.out.println("Mid value of 1 and 11 is "+q);           //1 2 3 4 5 6 7 8 9 10
		System.out.println("______________________________");        //1-10, 2-9, 3-8, 4-7, 5-6,
	}

}
