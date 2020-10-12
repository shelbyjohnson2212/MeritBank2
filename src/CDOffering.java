
public class CDOffering {
	double interestRate;
	int terms;
	
	public CDOffering(int terms, double interestRate){
		this.terms = terms;
		this.interestRate = interestRate;
	}

	int getTerm(){
		return terms;
	}
	
	double getInterestRate(){
		return interestRate;
	}

}


