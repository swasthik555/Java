package interfaces.implementinginterface;

public class AxisBank implements Bank {

	@Override
	public void depositAmount() {

		System.out.println("Depositing Amount into Axis Bank account");

	}

	@Override
	public void withdrawAmount() {

		System.out.println("Withdrawing amount from the axis bank");

	}

	@Override
	public void openFixedDeposit() {

		System.out.println("Open fixed depositing account");

	}

	public void openFlexibleDeposit() {

		System.out.println("Opening flexible fixed deposit from axis bank");

	}

}
