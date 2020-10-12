import java.util.Date;
public class CDAccount{
	
	private double balance;
	private long accountNumber;
	CDOffering offerings;
	Date date;
	
	public CDAccount(CDOffering offerings, double balance) {
		this.offerings = offerings;
		this.date = new Date();
		this.balance = balance;
		this.accountNumber = MeritBank.getNextAccountNumber();
	}
		
	public double getBalance(){
		return balance;
	}
	
	java.util.Date getStartDate(){
		return date;
	}
	
	public long getAccountNumber(){
		return accountNumber;
		
	}
	
	int getTerm() {
		return offerings.getTerm();
	}
	
	double getInterestRate() {
		return offerings.getInterestRate();
	}
		
	public double futureValue(){
		double futureValue = balance* Math.pow((1+ getInterestRate()),getTerm());
		return futureValue;
	}

}

