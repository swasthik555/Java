package arrays;

public class Three_Dimensional_array {

	public static void main(String[] args) {

		int[][][] a = new int[2][3][4];

		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 21

		// 12 13 14 22
		// 15 16 17 23
		// 18 19 20 24

		a[0][0][0] = 1;
		a[0][0][1] = 2;
		a[0][0][2] = 3;
		a[0][0][3] = 4;

		a[0][1][0] = 5;
		a[0][1][1] = 6;
		a[0][1][2] = 7;
		a[0][1][3] = 8;

		a[0][2][0] = 17;
		a[0][2][1] = 18;
		a[0][2][2] = 19;
		a[0][2][3] = 20;

		a[1][0][0] = 9;
		a[1][0][1] = 10;
		a[1][0][2] = 11;
		a[1][0][3] = 12;

		a[1][1][0] = 13;
		a[1][1][1] = 14;
		a[1][1][2] = 15;
		a[1][1][3] = 16;

		a[1][2][0] = 21;
		a[1][2][1] = 22;
		a[1][2][2] = 23;
		a[1][2][3] = 24;

		System.out.print(a[0][0][0] + " ");
		System.out.print(a[0][0][1] + " ");
		System.out.print(a[0][0][2] + " ");
		System.out.println(a[0][0][3] + " ");
		System.out.print(a[0][1][0] + " ");
		System.out.print(a[0][1][1] + " ");
		System.out.print(a[0][1][2] + " ");
		System.out.println(a[0][1][3] + " ");
		System.out.print(a[0][2][0] + " ");
		System.out.print(a[0][2][1] + " ");
		System.out.print(a[0][2][2] + " ");
		System.out.println(a[0][2][3] + " ");
		System.out.println();
		System.out.print(a[1][0][0] + " ");
		System.out.print(a[1][0][1] + " ");
		System.out.print(a[1][0][2] + " ");
		System.out.println(a[1][0][3] + " ");
		System.out.print(a[1][1][0] + " ");
		System.out.print(a[1][1][1] + " ");
		System.out.print(a[1][1][2] + " ");
		System.out.println(a[1][1][3] + " ");
		System.out.print(a[1][2][0] + " ");
		System.out.print(a[1][2][1] + " ");
		System.out.print(a[1][2][2] + " ");
		System.out.println(a[1][2][3] + " ");
		System.out.println("________________________");

// Shortcut representation of three dimensional array

		int[][][] i = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } },
				{ { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, { 21, 22, 23, 24 } } };

		System.out.print(i[0][0][0] + " ");
		System.out.print(i[0][0][1] + " ");
		System.out.print(i[0][0][2] + " ");
		System.out.println(i[0][0][3] + " ");
		System.out.print(i[0][1][0] + " ");
		System.out.print(i[0][1][1] + " ");
		System.out.print(i[0][1][2] + " ");
		System.out.println(i[0][1][3] + " ");
		System.out.print(i[0][2][0] + " ");
		System.out.print(i[0][2][1] + " ");
		System.out.print(i[0][2][2] + " ");
		System.out.println(i[0][2][3] + " ");
		System.out.println();
		System.out.print(i[1][0][0] + " ");
		System.out.print(i[1][0][1] + " ");
		System.out.print(i[1][0][2] + " ");
		System.out.println(i[1][0][3] + " ");
		System.out.print(i[1][1][0] + " ");
		System.out.print(i[1][1][1] + " ");
		System.out.print(i[1][1][2] + " ");
		System.out.println(i[1][1][3] + " ");
		System.out.print(i[1][2][0] + " ");
		System.out.print(i[1][2][1] + " ");
		System.out.print(i[1][2][2] + " ");
		System.out.println(i[1][2][3] + " ");
		System.out.println("________________________");

//length of three dimensional array

		int[][][] j = { { { 1, 5, 7, 7 }, { 3, 6, 9, 2 }, { 2, 8, 4, 3 } },
				{ { 3, 6, 9, 2 }, { 2, 8, 4, 2 }, { 1, 5, 7, 3 } } };

		// length - predefined variable in java

		System.out.println("The number of two dimensional arrays in this 3 dimension array are : " + j.length);

		System.out.println(
				"The number of single dimensional arrays in the first two dimension array are : " + j[0].length);

		System.out.println(
				"The number of single dimensional arrays in the second two dimension array are : " + j[1].length);

		System.out.println("the number of values in the first single dimensional array are : " + j[0][0].length);

		System.out.println("________________________________");

// for loop with a three dimensional array

		int[][][] k = { { { 1, 5, 7, 7 }, { 3, 6, 9, 2 }, { 2, 8, 4, 3 } },
				{ { 3, 6, 9, 2 }, { 2, 8, 4, 2 }, { 1, 5, 7, 3 } } };

		for (int q = 0; q < k.length; q++) {
			for (int w = 0; w < k[0].length; w++) {
				for (int e = 0; e < k[0][0].length; e++) {

					System.out.print(k[q][w][e]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("________________________________");
		
// for-each loop with a Three Dimensional array
		
		int [][][] z = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};
		
		for(int[][] temp1:z) {
			for(int[] temp2:temp1) {
				for(int temp3:temp2) {
					System.out.print(temp3+" ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}