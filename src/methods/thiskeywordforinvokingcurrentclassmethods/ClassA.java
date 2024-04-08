package methods.thiskeywordforinvokingcurrentclassmethods;

public class ClassA {

	public void methodX() {

		System.out.println("Inside methodX");
		this.methodY();
	}

	public void methodY() {

		System.out.println("Inside methodY");
	}

	public void methodZ() {

		System.out.println("Inside methodZ");
	}
}