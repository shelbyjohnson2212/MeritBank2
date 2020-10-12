public class CheckingAccount extends BankAccount {
	public double balance;
	public final double interestRate = 0.0001;
	
	public CheckingAccount(double openingBalance, double interestRate){
		super(openingBalance, interestRate);
	}
	
	public CheckingAccount(long accountNumber, double openingBalance, double interestRate){
		super(accountNumber, openingBalance, interestRate);
		
	}
	
	public CheckingAccount(double openingCheckingBalance) {
		super(openingCheckingBalance);
	}
	/*
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public boolean withdraw(double amount) {
		if(amount < 0 || amount > balance) {
			return false;
		}
		else {
			//sub amount from balance - short hand same as: balance = balance - amount 
			balance -= amount;
		}
		return true;
	}
	
	public boolean deposit(double amount) {
		if(amount < 0) {
		return false;	
		} 
		else { 
			balance += amount;
		}
		return true;
	}
	
	public double futureValue(int years) {
		double futureValue = balance* Math.pow((1+ interestRate),years);
		return futureValue;
	}
	*/
	@Override public String toString() {
		return "Checking Account Balance: " + getBalance() + "\n"
				+ "Interest Rate is: " + getInterestRate() + '\n'
				+ "Future Balance is: " + futureValue(3);
	}
	
}
