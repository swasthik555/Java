package logic.pattern;

public class Pattern04 {

	public static void main(String[] args) {
//		        *
//		      * *
//		    * * *
//		  * * * *
//		* * * * *

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
