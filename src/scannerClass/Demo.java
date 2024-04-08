package scannerClass;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = sc.next();
		
		System.out.println("Enter your age : ");
		
		int age = sc.nextInt();
		
		System.out.println("Enter your gender : ");
		
		char gender = sc.next().charAt(0);
		
		System.out.println("Are all the details provided you are correct? Enter true or false : ");
		
		boolean userConfirmation = sc.nextBoolean();
		
		System.out.println("Your name is : "+name);
		
		System.out.println("Your age is : "+age);
		
		System.out.println("Your gender is : "+gender);
		
		System.out.println("Your confirmation of above entered details is : "+userConfirmation);
		
		sc.close();
	}

}
