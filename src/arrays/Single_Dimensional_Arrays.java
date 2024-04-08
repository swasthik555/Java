package arrays;

public class Single_Dimensional_Arrays {

	public static void main(String[] args) {
// Declare, Create, Assign and access arrays

		int[] i = new int[5]; // single dimensional array declaration

//assign the value

		i[0] = 6;
		i[1] = 3;
		i[2] = 7;
		i[3] = 9;
		i[4] = 2;

// access or retrieve the assigned values

		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);
		System.out.println("__________________________");

//Shortcut representation of single dimensional array

		int[] j = { 5, 3, 8, 6, 2, 8 };

		System.out.println(j[0]);
		System.out.println(j[1]);
		System.out.println(j[2]);
		System.out.println(j[3]);
		System.out.println(j[4]);
		System.out.println(j[5]);
		System.out.println("_________________________");

//Length of Single dimensional array

		int[] k = { 2, 5, 78, 4, 2, 5, 76, 35, 7 };

//length - predefined variable

		System.out.println("The size of the array is : " + k.length);
		System.out.println("______________________________________");

//for loop with single dimensional array

		int[] l = { 4, 6, 23, 67, 34, 8, 90 };

		System.out.println("The size of the array is : " + l.length);
		System.out.println("____________________________________");

		for (int m = 0; m < l.length; m++) { // 0
			System.out.println(l[m]);
		}
		System.out.println("_________________________");
		
//for-each loop with single dimensional array
		
		int [] q = {1,54,7,3,56,98};
		
		for(int temp:q) {
			
			System.out.println(temp); // 1,54,7,3,56,98
			
		}
		System.out.println("________________________");
		
//Array Index Out of bounds Exception
		
		int[] w = new int[3];
		w[0] = 3;
		w[1] = 56;
		w[2] = 45;
//		w[3] = 6; // array index out of bound exception

	}

}