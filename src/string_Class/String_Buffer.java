package string_Class;

public class String_Buffer {

	public static void main(String[] args) {
		
// Object is Mutable (modifiable)
		
		StringBuffer a = new StringBuffer("Sheera");
		
		System.out.println(a);
		
		System.out.println("_______________________");
	
		String b = "Munavara";
		b.concat(" ").concat("Mubasheera");
		System.out.println(b); // Munavara
		
		StringBuffer c = new StringBuffer("Sheera");
		c.append(" ").append("Kamireddy");
		System.out.println(c); // Sheera Kamireddy
		
		System.out.println("_______________________");
		
// append() StringBuffer class method
		
		StringBuffer d = new StringBuffer("Mubasheera");
		d.append(" ").append("Munavara");
		System.out.println(d); // Mubasheera Munavara
		
		System.out.println("_____________________");
		
// charAt() StringBuffer class method
		
		StringBuffer e = new StringBuffer("Kamireddy");
		System.out.println(e.charAt(4)); // r
		
		System.out.println("______________");
		
// delete() StringBuffer class method
		
		StringBuffer f = new StringBuffer("Sheera Kamireddy");
		System.out.println(f.delete(7, 11)); // Sheera reddy
		
		System.out.println("________________________");
		
// deleteCharAt() stringBuffer class method
		
		StringBuffer g = new StringBuffer("MubasheeraB");
		System.out.println(g.deleteCharAt(10)); // Mubasheera
		
		System.out.println("___________________________");
		
//  insert() StringBuffer class method
		
		StringBuffer h = new StringBuffer("Sheera");
		System.out.println(h.insert(6, " Kamireddy")); //Sheera Kamireddy
		
		System.out.println("________________________");
		
//  length() StringBuffer class method
		
		StringBuffer i = new StringBuffer("Mubasheera");
		System.out.println(i.length()); //10
		
		System.out.println("__________________");
		
//   indexOf() StringBuffer class method
	
		StringBuffer j = new StringBuffer("Sheera Kamireddy");
		System.out.println(j.indexOf("Kami")); // 7
		System.out.println(j.indexOf("B")); // -1
		System.out.println(j.indexOf("r", 5)); //11
		
		System.out.println("____________________");
		
//	lastIndexOf() StringBuffer class method
// It will searching from the Last
		
		StringBuffer k = new StringBuffer("Sheera Kamireddy");
		System.out.println(k.lastIndexOf("r")); // 11
		System.out.println(k.lastIndexOf("e", 5)); //3

		System.out.println("_____________________");
		
//  replace() StringBuffer class method
		
		StringBuffer l = new StringBuffer("Mubasheerxuyt");
		System.out.println(l.replace(9, 13, "a")); // Mubasheera
		
		System.out.println("___________________________");
		
//  reverse() stringBuffer class method
		
		StringBuffer m = new StringBuffer("sheera");
		System.out.println(m.reverse()); // areehs
		StringBuffer n = new StringBuffer("Mubasheera");
		System.out.println(n.reverse()); //areehsabuM
		
		System.out.println("_____________________");
		
// setCharAt() stringBuffer class method
		
		StringBuffer o = new StringBuffer("Munaivara");
		o.setCharAt(4, '-');
		System.out.println(o); //Muna-vara
		
		System.out.println("_________________-");
		
// setLength() stringBuffer class method
		
		StringBuffer p = new StringBuffer("Sheera");
		p.setLength(5);
		System.out.println(p); //Sheer
		
		System.out.println("____________________");
		
//  subString() stringBuffer class method

		StringBuffer q = new StringBuffer("Sanjay");
		System.out.println(q.substring(3)); // jay
		System.out.println(q.substring(2, 5)); // nja
		
		System.out.println("____________________");
		
// toString() stringBuffer class method
		
		StringBuffer r = new StringBuffer("Acharya");
		String s = r.toString();
		System.out.println(s); // Acharya
		

		
	}

}
