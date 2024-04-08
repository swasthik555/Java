package wrapperClasses;

public class AutoUnboxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
//	Manual way
		
		Integer a = new Integer(4);
		int b = a.intValue();
		System.out.println(b);
		
//	Automatic
		
		Integer c = new Integer(9);
		int d = c;
		System.out.println(d);
		
		Short e = new Short((short) 45);
		short f = e;
		System.out.println(f);
		
		Byte g = new Byte((byte)3);
		byte h = g;
		System.out.println(h);
		
		Long i = new Long(567L);
		long j = i;
		System.out.println(j);
		
		Double k = new Double(4.56);
		double l = k;
		System.out.println(l);
		
		Float m = new Float(5.67F);
		float n = m;
		System.out.println(n);
		
		Character o = new Character('r');
		char p = o;
		System.out.println(p);
		
		Boolean q = new Boolean(false);
		boolean r = q;
		System.out.println(r);
		
	}

}
