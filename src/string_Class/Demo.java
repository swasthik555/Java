package string_Class;

public class Demo {

	public static void main(String[] args) {
		String str = new String("Sheera"); // actual representation
		String str1 = "Mubasheera"; //Shortcut representation
		String str2 = "Kamireddy";
		String str3 = "Munavara";
		
		System.out.println(str.toUpperCase()+" "+str2.toLowerCase());
		System.out.println(str1.toLowerCase()+" "+str3.toUpperCase());
		
//Strings objects are immutable. (Non-changeable / non-modifiable )
//StringBuffer objects are mutable.
		
		String i = "Sanjay";
		
		i = "Sanjay acharya";
		
		i = "Swasthik";
		
		System.out.println(i); //Swasthik

	}

}
