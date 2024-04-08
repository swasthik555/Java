package flowControl.iterativeStatement;

import java.util.Scanner;

public class PracticeWhileLoop {

	public static void main(String[] args) {
		 
		int i = 1;
		while (i<6) {
			System.out.println("Sanjay");
			++i;
		}
		System.out.println("____________________");
		
		int j =1, sum = 0;
		while(j<=10) {
			sum = sum+j;
			j++;
	}
		System.out.println("Sum of 1 to 10 is "+sum);
		System.out.println("_________________________");
		
		try (Scanner s = new Scanner(System.in)) {
			int n =s.nextInt();
			while(n<1 || n >10) {
				System.out.println(n+"is not between 1 and 10. try again");
				n=s.nextInt();
				
			}
			System.out.println(n+ "is betweem 1 and 10. Thank you");
		}
}
}
