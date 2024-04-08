package flowControl.selectionStatement;

public class Switch_statement_3 {

	public static void main(String[] args) {
		int a = 5, b=8;
		
		 switch (a+b) {
		case 10:
			System.out.println("inside case 1");
			break;
			
		case 8:
			System.out.println("inside case 2");
			break;
			
		case 14:
			System.out.println("inside case 3");
			break;

		default:
			System.out.println("inside default block");
			break;
		}

	}

}
