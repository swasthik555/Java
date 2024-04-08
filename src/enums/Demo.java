package enums;

public class Demo {

	public static void main(String[] args) {
		
//		System.out.println(Color.GREEN);
//		System.out.println(Color.RED);
//		System.out.println(Color.BLACK);
//		System.out.println(Color.WHITE);
//		System.out.println(Color.PURPLE);
//		System.out.println(Color.ORANGE);
//		System.out.println(Color.BLUE);
//		System.out.println(Color.YELLOW);
		
//-----------------------------------------
		
//		Color c = Color.BLUE;
//		
//		switch(c) {
//		
//		case GREEN:
//			System.out.println("GREEN feels like oxygen");
//			break;
//		case BLUE:
//			System.out.println("Blue feels like cool");
//			break;
//		case RED:
//			System.out.println("RED feels like danger");
//			break;
//		case ORANGE:
//			System.out.println("Orange feels like sunset");
//			break;
//		case YELLOW	:
//			System.out.println("YELLOW feels like banana");
//			break;
//		default:
//			System.out.println("Provided constant is not match.");
		
//	}
		
//--------------------------------------
		
		System.out.println(Color.BLACK.ordinal()); // 7 // ordinal means returns the index value of the constants
		
		Color[] color = Color.values();
		
		for(Color x : color) {
			System.out.println(x); //GREEN BLUE RED WHITE PURPLE YELLOW ORANGE BLACK
		}
		
		
	}

}
