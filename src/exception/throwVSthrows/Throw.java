package exception.throwVSthrows;

public class Throw {

	public static void main(String[] args) throws Exception {
		
		int age = 5;
		if(age<6) {
			throw new Exception("age is less than 6");
		}
		
		if(age>6) {
			System.out.println("age is accepted");
		}

	}

}
