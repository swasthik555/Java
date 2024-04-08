package flowControl.selectionStatement;

public class if_elseIf_else_statement {

	public static void main(String[] args) {
		int a = 6, b =5, c=4, d = 1, e = 2;

		if (a < b) {
			System.out.println("inside if block");
		} else if (b < c) {
			System.out.println("inside first else if block");
		} else if(c<d){
			System.out.println("inside second else if block");
		}else if (d<e) {
			System.out.println("inside third else if block");
		}else {
			System.out.println("inside else block");
		}
		
		System.out.println("________________________________");

	}

}
