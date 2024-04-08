package string_Class;

public class String_Methods {

	public static void main(String[] args) {

// equals() method
// Case sensitive

		String a = "Sanjay";
		String b = "Sanj";
		String c = "Sanj";

		System.out.println(a.equals(b)); // false
		System.out.println(b.equals(c)); // true
		System.out.println("Sheera".equals("Mubasheera"));

		System.out.println("________________________");

// difference between == and equals() method in comparing two strings

		/*
		 * == compare objects.
		 * equals() compare String literals.
		 */

		String d = new String("Suj");
		String e = new String("Suj");
		String f = d;

		System.out.println(d == e); // false
		System.out.println(d == f); // true
		System.out.println(d.equals(e)); // true
		System.out.println(d.equals(f)); // true
		System.out.println("_________________________");
		
// equalsIgnoreCase() method
// Ignore the Case
		
		String g = "Sheera";
		String h = "sheeRa";
		
		System.out.println(g.equals(h)); //  false
		System.out.println(g.equalsIgnoreCase(h)); // true
		
		System.out.println("_________________________");
		
// length() method
// it includes the spaces before, between and after the words will be calculated
		
		String i = "Mubasheera ";
		
		System.out.println(i.length()); // 11
		
		String j = "Sheera Kamireddy";
		
		System.out.println(j.length()); // 16
		
		System.out.println("__________________________");

// difference between length and length() method
		
		int [] k = {2,5,8,3,6,9};
		
		System.out.println("Length if the array is : "+k.length);
		
		String l = "Munavara";
		
		System.out.println("Size of the String literal text is : "+l.length());
		
		System.out.println("______________________");
		
// trim() method
// used to remove the spaces before and after the string text
		
		String m = " Kami reddy ";
		
		System.out.println(m.length());
		
		String n = m.trim();
		
		System.out.println(n+" "+n.length());
		
		System.out.println("____________________");
		
// substring() method
		
		String o = "Mubasheera Munavara";
		
		System.out.println(o.substring(11)); // Munavara
		
		System.out.println(o.substring(4, 10)); //sheera (10-1)
		
		System.out.println("________________________");
		
//indexOf() String method
// used to check whether the provide text is in the paragraph etc.
// returns -1 in case the provided text is not available
		
		String p = "Sheera Kamireddy is a wonderful women Sheera";
		
		System.out.println(p.indexOf("Sheera")); //11
		System.out.println(p.indexOf("Sheera", 6)); // 38
		System.out.println(p.indexOf('p')); // -1
		
		String q = "Mubasheera Munavara is a great women";
		
		System.out.println(q.indexOf('i')); //20
		
		
		String t = findWordCharacter(p, "women");
		System.out.println(t);
		System.out.println("_____________________________");
		
// lastIndexOf() string method
		
		String u = "Sanjay and will be Sheera and Mubasheera";
		
		String z= "hiheyhello";
		System.out.println(z.lastIndexOf("h", 4)); // 2 it start count from y to backward
		
		System.out.println(u.lastIndexOf("and")); //26
		System.out.println(u.lastIndexOf("bonka")); //-1
		System.out.println(u.lastIndexOf("and", 20)); //7 backward search happen

		System.out.println("___________________");
		
// split() string method
		
		String v = "Sheera Munavara-Mubasheera kamireddy";
		
		String[] x = v.split("-");
		
		for(String temp:x) {
			System.out.print(temp); // Sheera MunavaraMubasheera kamireddy
		}
		
		System.out.println();
		System.out.println("_______________________");
		
// concat() String method
		
		String y = "Sanjay";
		String sz = "Mubasheera";
		
		System.out.println(y.concat(sz));
		
		System.out.println("__________________");
		
//using + operator for concatenation
		
		String str1 = "Sanjay";
		String str2 = "Sheera";
		String str3 = "Mubasheera";
		
		System.out.println(str1+" "+str2+" "+str3);
		
		System.out.println("________________________");
		
// isEmpty() string method
		
		String str4 = "Sheera";
		
		String str5 = "";
		
		System.out.println(str4.isEmpty()); // false
		System.out.println(str5.isEmpty()); //true
		
		System.out.println("_________________________");
		
//startsWith() string method 
		
		String str6 = "Mubasheera Munavara";
		
		System.out.println(str6.startsWith("Mu")); //true
		System.out.println(str6.startsWith("Mun")); //false
		System.out.println(str6.startsWith("Mun", 11)); //true
		
		System.out.println("_______________________");
		
// endsWith() string method
		
		String str7 = "Sheera Kamireddy";
		
		System.out.println(str7.endsWith("dy")); //true
		System.out.println(str7.endsWith("ra")); //false
		
		System.out.println("_______________________");
		
// toCharArray() string method
		
		String str8 = "Sheera Kamireddy";
		
		char [] str9 =  str8.toCharArray();
		
		for(char temp:str9) {
			System.out.println(temp);
		}
				
		System.out.println("________________________");
		
// toUpperCase() and toLowerCase() string method
		
		String str10 = "SHEERA KAMIREDDY";
		
		System.out.println(str10.toLowerCase());
		
		String str11 = "mubasheera munavara";
		
		System.out.println(str11.toUpperCase());
		
		System.out.println("_______________________________");
		
// toString() string method
		
		Integer int1 = 4;
		String str12 = int1.toString();
		System.out.println(str12); //4
		
		Byte byt = 1;
		String str13 = byt.toString();
		System.out.println(str13);
		
		Float flo = 3.56F;
		String str14 = flo.toString();
		System.out.println(str14);
		
		Short sho = 78;
		String str15 = sho.toString();
		System.out.println(str15);
		
		Long lon = 1234566778L;
		String str16 = lon.toString();
		System.out.println(str16);
		
		Boolean boo = true;
		String str17 = boo.toString();
		System.out.println(str17);
		
		Character ch = 's';
		String str18 = ch.toString();
		System.out.println(str18);
		
		System.out.println("_____________________");

// valueOf() string method
		
//Explain Later
		
		int co = 9;
		
		String str19 = String.valueOf(co);
		
		System.out.println(str19);
		
		System.out.println("_____________");
		
// charAt() string method
		
		String str20 = "Sanjay Acharya";
		
		System.out.println(str20.charAt(9));
		
		System.out.println("_________________");
		
// replace() string method
		
		String str21 = "Sanjay Acharya";
		
		System.out.println(str21.replace("A", "a"));
		
		System.out.println("______________");
		
		
		
		
		
}
// method for indexOf() 
	public static String findWordCharacter(String r, String s) {
		
		if(r.indexOf(s)!=-1) {
			return "The given text is available";
	
		}else {
			return "The given text is not available";
		}
	}
}