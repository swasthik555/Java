package flowControl.selectionStatement;

public class Switch_statement_2 {

	public static void main(String[] args) {
		String a = "Sanjay";
		
		 switch (a) {
		case "Sujay":
			System.out.println("inside case 1");
			break;
			
		case "Sanjay":
			System.out.println("inside case 2");
			break;
			
		case "sandesh":
			System.out.println("inside case 3");
			break;

		default:
			System.out.println("inside default block");
			break;
		}

	}

}
