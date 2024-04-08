package wrapperClasses;

public class AutoBoxing {

	public static void main(String[] args) {
		System.out.println("Manual way");
		
		int a = 9;
		Integer b = Integer.valueOf(a);
		System.out.println(b);
		
		System.out.println("Automatic");
		
		int c = 7;
		Integer d = c;
		System.out.println(d);
		
		byte e = 2;
		Byte f = e;
		System.out.println(f);
		
		short g = 45;
		Short h = g;
		System.out.println(h);
		
		boolean i = true;
		Boolean j = i;
		System.out.println(j);
		
		float k = 3.67F;
		Float l = k;
		System.out.println(l);
		
		double m = 45.78;
		Double n = m;
		System.out.println(n);
		
		char o = 'e';
		Character p = o;
		System.out.println(p);
		
		long q = 5678L;
		Long r = q;
		System.out.println(r);

	}

}
