package flowControl.selectionStatement;

public class Switch_statement_1 {

	public static void main(String[] args) {
		int a = 'r'; // int, string, char only

		switch (a) {
		case 'a':
			System.out.println("inside case 0");
			break;

		case 'b':
			System.out.println("inside case 1");
			break;

		case 'r':
			System.out.println("inside case 2");
			break;
			
		case 'n':
			System.out.println("inside case 3");
			break;
			
		default:

			System.out.println("inside default block");

		}

	}

}
