package logic.pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args){
		
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
		
		
        Scanner sc = new Scanner(System.in);
 
        //Taking rows value from the user
 
        System.out.println("How many rows you want in this pattern?");
 
        int rows = sc.nextInt();
 
        System.out.println("Here is your pattern....!!!");
 
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
        //Close the resources
 
        sc.close();
    }
}


