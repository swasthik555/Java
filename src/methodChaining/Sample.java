package methodChaining;

public class Sample {

	public static void main(String[] args) {
		
		String str = "Arun Motoori";
		
		String str2 = str.replace(" ", "_");
		
		String str3 = str2.concat(" ");
		
		String str4 = str3.concat("Core Java");
		
		String str5 = str4.replace(" ", "_");
		
		System.out.println(str5);
		
		//-------------------------------------
		
		String st = "Sanjay Acharya";
		
		String st1 = st.replace(" ", "_").concat(" ").concat("Core Java").replace(" ", "_");

		System.out.println(st1);
	}

}
