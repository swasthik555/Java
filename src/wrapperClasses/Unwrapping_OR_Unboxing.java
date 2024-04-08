package wrapperClasses;

public class Unwrapping_OR_Unboxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		Integer a = new Integer(9);
		int b = a.intValue(); // Unwrapping 
		System.out.println(b);
		
		Byte c = new Byte((byte) 4);
		byte d = c.byteValue();
		System.out.println(d);
		
		Short e = new Short((short) 45);
		short f = e.shortValue();
		System.out.println(f);
		
		Boolean g = new Boolean(false);
		boolean h = g.booleanValue();
		System.out.println(h);

		Long i = new Long(457L);
		long j = i.longValue();
		System.out.println(j);
		
		Float k = new Float(5.78F);
		float l = k.floatValue();
		System.out.println(l);
		
		Double m = new Double(5.78);
		double n = m.doubleValue();
		System.out.println(n);
		
		Character o = new Character('s');
		char p = o.charValue();
		System.out.println(p);
		
	}

}
