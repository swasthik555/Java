package interfaces;

public interface Bank {

	String accountType1 = "Savings";
	String accountType2 = "Current";

	public void depositMoney();

	public void withdrawMoney();

	public void transferMoney();

	public void openFixedDeposit();

	public void openRecurringDeposit();

	public void openBankAccount();

	public void closeBankAccount();

	public void calculateInterestAmount();

	public void defineInterestRates();

}