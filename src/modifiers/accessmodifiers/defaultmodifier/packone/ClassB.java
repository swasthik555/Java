package modifiers.accessmodifiers.defaultmodifier.packone;

public class ClassB {
	
	public void methodB() {
		ClassA aobj = new ClassA();
		
		System.out.println("The value of a is "+aobj.a);
		
		aobj.methodA();
		
		
	}

}
