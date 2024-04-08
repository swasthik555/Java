package modifiers.accessmodifiers.protectedmodifier.packone;

public class ClassB {
	
	public void methodY() {
		
		ClassA aobj = new ClassA();
		
		System.out.println("Value of a is : "+aobj.a);
		
		aobj.methodX();
	}

}
