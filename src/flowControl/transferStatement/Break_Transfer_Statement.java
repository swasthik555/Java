package flowControl.transferStatement;

public class Break_Transfer_Statement {

	public static void main(String[] args) {
		System.out.println("Break statement inside while Loop Statement");
		int a = 0;
		while (a < 5) {
			System.out.println("While : " + a);
			a++;
			if (a == 4) {
				break;
			}
		}
		// ---------------------------------
		System.out.println("___________________________");
		System.out.println("Break statement inside Switch Statement");

		int b = 0;
		switch (b) {
		case 0:
			System.out.println("Case : 0");
			break;
		case 1:
			System.out.println("Case : 1");
			break;
		case 2:
			System.out.println("Case : 2");
			break;
		default:
			System.out.println("Default");

		}
		System.out.println("___________________________");
		//----------------------------------------
		System.out.println("Break statement inside for-Loop Statement");

		for(int i=0;i<7;i++) {
			System.out.println("Sanjay "+i);
			
			if(i==4) {
			break;
			}
		}
		System.out.println("_____________________________");
		//----------------------------------------------------
		
	}

}
