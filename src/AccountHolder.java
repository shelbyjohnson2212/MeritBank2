public class AccountHolder {
	// Class variables
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	CheckingAccount[] checkingArray = new CheckingAccount[0];
	SavingsAccount[] savingsArray = new SavingsAccount[0];
	CDAccount[] cdAccountArray = new CDAccount[0];

/**
 * This constructs account holder's attributes
 * @param first the first name of the account holder
 * @param middle the middle name of the account holder
 * @param last the last name of the account holder
 * @param ssn the social security number of the account holder
 */
	
	public AccountHolder(String first, String middle, String last, String ssn) {
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
		this.ssn = ssn;
	}

/**
 * This method validates that aggregate account balances are less than $250,000.00 
   and add checking account to account holder by taking opening balance as parameter
 * @param openBalance Account holder's initial opening balance
 */


	public void addCheckingAccount(double openBalance) {
		if(getCheckingBalance() + getSavingsBalance() + openBalance >= 250000) {
			System.out.println("Cannot open a new Checking Account because aggregate balance of accounts is to high.");
			return;
		}
		
		CheckingAccount newA = new CheckingAccount(openBalance);
		CheckingAccount[] newCheckingArray = new CheckingAccount[checkingArray.length+1];
		for (int i = 0; i < newCheckingArray.length-1; i++) {
			newCheckingArray[i] = checkingArray[i];
		}
		checkingArray = newCheckingArray;
		checkingArray[checkingArray.length-1] = newA;
	}

/**
 * This method used to add checking account to account holder by validating aggregate balances are less than $250,000.00
 * @param checkingAccount checking account amount
 */
			
	public void addCheckingAccount(CheckingAccount checkingAccount) {
		if(checkingAccount.getBalance() + getCheckingBalance() + getSavingsBalance() >= 250000) {
			System.out.println("Cannot open a new Checking Account because aggregate balance of accounts is to high.");
			return;
		}
			CheckingAccount[] newCheckingArray = new CheckingAccount[checkingArray.length+1];
			for (int i = 0; i < newCheckingArray.length-1; i++) {
			       newCheckingArray[i] = checkingArray[i];
			    }
			checkingArray = newCheckingArray;
			checkingArray[checkingArray.length-1] = checkingAccount;
	}
	
/**
 * This method calculates the aggregate balance of checking accounts
 * @return the total amount of the checking accounts
 */
	
	public double getCheckingBalance() {
		double total = 0.0;
		int i;
		for(i = 0; i < checkingArray.length; i++) {
			total += checkingArray[i].getBalance();
		}
		return total;
	}
/**
 * This method adds savings account to account holder by validating the aggregate balance is less than $250,000.00
 * @param openBalance the initial opening balance of the saving account
 */
	
	public void addSavingsAccount(double openBalance) {
		if(getCheckingBalance() + getSavingsBalance() + openBalance >= 250000) {
			System.out.println("Cannot open a new Savings Account because aggregate balance of accounts is to high.");
			return;
		}
			SavingsAccount newA = new SavingsAccount(openBalance);
			SavingsAccount[] newSavingsArray = new SavingsAccount[savingsArray.length+1];
			for (int i = 0; i < newSavingsArray.length-1; i++) {
				newSavingsArray[i] = savingsArray[i];
			}
			savingsArray = newSavingsArray;
			savingsArray[savingsArray.length-1] = newA;
	}
	
/**
 * This method validates account balance is less than $250,00.00 and adds savings account to account holder 
 * @param savingsAccount the savings account amount
 */
	
	public void addSavingsAccount(SavingsAccount savingsAccount) {
		if(savingsAccount.getBalance() + getCheckingBalance() + getSavingsBalance() >= 250000) {
			System.out.println("Cannot open a new Savings Account because aggregate balance of accounts is to high.");
			return;
		}
			SavingsAccount[] newSavingsArray = new SavingsAccount[savingsArray.length+1];
			for (int i = 0; i < newSavingsArray.length-1; i++) {
			       newSavingsArray[i] = savingsArray[i];
			    }
			savingsArray = newSavingsArray;
			savingsArray[savingsArray.length-1] = savingsAccount;
	}
	
	/**
	 * 
	 * @return savings account
	 */
	
	public SavingsAccount[] getSavingsAccounts() {
		return savingsArray;
	}
	
	/** 
	 * @return the total number of savings accounts
	 */
	
	public int getNumberOfSavingsAccounts() {
		return savingsArray.length;
	}
	/** 
	 * @return the total balance in savings accounts
	 */
	
	public double getSavingsBalance() {
		double total = 0.0;
		for(SavingsAccount balance : savingsArray) {
			total += balance.getBalance();
		}
		return total;

	}

	/**
	 * This method used to add CDAccount to the account holder
	 * @param offering the CDOffering 
	 * @param openBalance the opening balance
	 */
		
	public void addCDAccount(CDOffering offering, double openBalance) {
			CDAccount newA = new CDAccount(offering, openBalance);
			CDAccount[] newCDArray = new CDAccount[cdAccountArray.length+1];
			for (int i = 0; i < newCDArray.length-1; i++) {
				newCDArray[i] = cdAccountArray[i];
			}
			cdAccountArray = newCDArray;
			cdAccountArray[cdAccountArray.length-1] = newA;
	}
	
	public void addCDAccount(CDAccount cdAccount) {
			CDAccount[] newCDArray = new CDAccount[cdAccountArray.length+1];
			for (int i = 0; i < newCDArray.length-1; i++) {
			       newCDArray[i] = cdAccountArray[i];
			    }
			cdAccountArray = newCDArray;
			cdAccountArray[cdAccountArray.length-1] = cdAccount;
	}

	public CDAccount[] getCDAccounts() {
		return cdAccountArray;
	}

	public int getNumberOfCDAccounts() {
		return cdAccountArray.length;
	}

	public double getCDBalance() {
		double total = 0.0;
		for(CDAccount balance : cdAccountArray) {
			total += balance.getBalance();
		}
		return total;
	}

	public double getCombinedBalance() {
		return getCDBalance() + getSavingsBalance() + getCheckingBalance();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first) {
		this.firstName = first;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middle) {
		this.middleName = middle;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String last) {
		this.lastName = last;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount[] getCheckingAccounts() {
		return checkingArray;
	}
	
	public int getNumberOfCheckingAccounts() {
		return checkingArray.length;
	}
}