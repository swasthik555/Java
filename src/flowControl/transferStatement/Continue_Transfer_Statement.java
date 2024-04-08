package flowControl.transferStatement;

public class Continue_Transfer_Statement {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println("The value of i is : " + i);

		}
		System.out.println("________________________________");
//------------------------------------------------

		int j = 0;
		while (j < 10) {

			if (j == 4) {
				j++;
				continue;
			}
			System.out.println("The Value of J is : " + j);
			j++;
		}
		System.out.println("________________________________");
//----------------------------------------------------

		for (int k = 0; k < 10; k++) {
			if (k % 2 == 0) {
				continue;
			}
			System.out.println(k);
		}
		System.out.println("________________________________");
//----------------------------------------------------

		int l = 0;
		do {
			if(l==7) {
				l++;
				continue;
			}
			System.out.println(l);
			l++;
		}while(l<10);
		
		System.out.println("_______________________________");
//-----------------------------------------------------------		
		
	}

}
