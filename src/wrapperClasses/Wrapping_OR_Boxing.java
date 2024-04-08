package wrapperClasses;

public class Wrapping_OR_Boxing {

	public static void main(String[] args) {
		 
		 int a = 9;
		 Integer b = Integer.valueOf(a); // Wrapping
		 System.out.println(b);
		 
		 byte c = 3;
		 Byte d = Byte.valueOf(c);
		 System.out.println(d);
		 
		 short e = 5;
		 Short f = Short.valueOf(e);
		 System.out.println(f);
		 
		 long g = 578L;
		 Long h = Long.valueOf(g);
		 System.out.println(h);
		 
		 float i = 5.78F;
		 Float j = Float.valueOf(i);
		 System.out.println(j);
		 
		 double k = 456.76;
		 Double l = Double.valueOf(k);
		 System.out.println(l);
		 
		 boolean m = true;
		 Boolean n = Boolean.valueOf(m);
		 System.out.println(n);
				 
		 char o = 't';
		 Character p = Character.valueOf(o);
		 System.out.println(p);

	}

}
