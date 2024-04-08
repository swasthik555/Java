package inheritance;



public class BenzChild extends CarParent{
	
	int numberOfGears;
	
	public BenzChild() {
		
		System.out.println("Inside BenzChild constructor");
		
	}
	
	public void openSunRoof() {
		
		System.out.println("Number of Gears : "+numberOfGears);
		
	}

}
