package logic.pattern;

public class Pattern05 {

	public static void main(String[] args) {

//		* * * * *
//		  * * * *
//		    * * *
//		      * *
//		        *
		int i;
		int j;
		int k;

		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			} 
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}

//* * * * *
//* * * *
//* * *
//* *
//*