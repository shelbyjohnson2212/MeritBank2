public class SavingsAccount extends BankAccount {
	//don't name variable with a cap letter//
		public double balance;
		public final double interestRate = 0.01;
		
	//constructor method//
		public SavingsAccount(double openingBalance, double interestRate){
			super(openingBalance, interestRate);
		}
		
		public SavingsAccount(double openingSavingsBalance) {
			super(openingSavingsBalance);
		}
		/*
		double getInterestRate(){
			return interestRate;
		}
		
		double getBalance(){
			return balance;
		}
		
		boolean deposit(double amount){
			if(amount < 0) {
				return false;	
				} 
				else { 
					balance += amount;
				}
				return true;
		}
		
		boolean withdraw(double amount){
		//if the amount is less than zero it is false//
			if(amount < 0 || amount > balance) {
				return false;
			}
			else {
				//sub amount from balance - short hand same as: balance = balance - amount 
				balance -= amount;
			}
			return true;
		}
		
		double futureValue(int years){
			double futureValue = balance* Math.pow((1+ interestRate),years);
			return futureValue;
		}
*/
		@Override public String toString(){
			return "Savings Account Balance: " + getBalance() + "\n"
					+ "Interest Rate: " + getInterestRate() + '\n'
					+ "Future Balance: " + futureValue(3);
		} 
}
