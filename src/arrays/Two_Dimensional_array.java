package arrays;

public class Two_Dimensional_array {

	public static void main(String[] args) {

		int[][] a = new int[2][3];

		a[0][0] = 6;
		a[0][1] = 78;
		a[0][2] = 34;

		a[1][0] = 67;
		a[1][1] = 23;
		a[1][2] = 93;

		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println("__________________________");

//Shortcut representation of Two Dimensional array	

		int[][] i = { { 6, 78, 34 }, { 67, 23, 93 } };

		System.out.println(i[0][0]);
		System.out.println(i[0][1]);
		System.out.println(i[0][2]);
		System.out.println(i[1][0]);
		System.out.println(i[1][1]);
		System.out.println(i[1][2]);
		System.out.println("________________________");

//Length of a Two Dimensional array

		int[][] j = { { 1, 2, 3, 6 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// length = predefined variable in java

		System.out.println(j.length); // 3
		System.out.println(j[0].length); // 4
		System.out.println("____________________");

		String[][] k = { { "San", "Mub", "She" }, { "T", "ui", "op" }, { "Sheera", "Mubasheera", "Sanjay", "Sujay" } };
		System.out.println(k.length); // no.ofrows
		System.out.println("The size or length of the third one dimensional array : " + k[2].length); // no.of column
		System.out.println(k[2][0]);
		System.out.println(k[2][1]);
		System.out.println(k[2][2]);

		System.out.println("____________________");

//for loop with a Two Dimensional array

		int[][] l = { { 45, 24, 67 }, { 61, 79, 3, 7 }, { 6, 98, 99 } };

		for (int q = 0; q < l.length; q++) {

			for (int w = 0; w < l[0].length; w++) {
				System.out.print(l[q][w] + " ");
			}
			System.out.println();

		}
		System.out.println("______________________");

// for-each loop with a Two Dimensional array

		int[][] z = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int[] temp1 : z) {
			for (int temp2 : temp1) {

				System.out.print(temp2 + " ");
			}
			System.out.println();
		}

	}
}