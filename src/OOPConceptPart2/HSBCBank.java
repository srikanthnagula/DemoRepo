package OOPConceptPart2;

public class HSBCBank implements USbank, BrazilBank {
// Is a Relationship
	
	//if a class is implementing any interface, then its mandatory to define/override all the methods of interface 
	public void credit() {
		System.out.println("Credit Method");
	}
	public void debit() {
		System.out.println("Debit Method");
	}
	public void transfermethod() {
		System.out.println("Transfer Method");
	}
	public void MutualFund() {
		System.out.println("Mutual Fund - Brazil Specific");
	}
	public void EduLoan() {
		System.out.println("HSBC Education Loan");
	}
	public void Carloan() {
		System.out.println("HSBC Car Loan");
	}
}
