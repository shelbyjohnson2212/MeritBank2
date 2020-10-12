
public class BankAccount {
	double balance;
	double interestRate;
	long accountNumber;
	
	public BankAccount(double openingBalance, double interestRate){
		this.balance = openingBalance;
		this.interestRate = interestRate;
	}
	
	
	public BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	public BankAccount(double openingBalance) {
		this.balance = openingBalance;
	}
	
	
	long getAccountNumber(){
		return accountNumber;
	}
	
	
	double getBalance(){
		return balance;
	}
	
	
	double getInterestRate(){
		return interestRate;
	}
	
	
	public boolean withdraw(double amount) {
		if(amount < 0 || amount > balance) {
		return false;
		}
		else {
			balance -= amount;
		} return true;
	}
	
	boolean deposit(double amount) {
	if(amount < 0) {
		return false;	
		} 
		else { 
			balance += amount;
		} return true;
	}
	
	double futureValue(int years) {
		double futureValue = balance* Math.pow((1+ interestRate), years);
		return futureValue;
	} 
}
