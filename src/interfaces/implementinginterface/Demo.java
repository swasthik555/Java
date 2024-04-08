package interfaces.implementinginterface;

public class Demo {
	
	public static void main(String[] args) {
		
		Bank bank = new AxisBank();
		
		bank.depositAmount();
		bank.withdrawAmount();
		bank.openFixedDeposit();
		((AxisBank)bank).openFlexibleDeposit();
		
		
	}

}
