package interfaces.implementinginterface;

public interface Bank {

	String ACCOUNT_TYPE_ONE = "Savings";
	String ACCOUNT_TYPE_TWO = "Current";

	void depositAmount();

	void withdrawAmount();

	void openFixedDeposit();

}
