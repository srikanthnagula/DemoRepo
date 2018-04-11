package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCbank HB = new HDFCbank();
		HB.credit();
		HB.debit();
		HB.loan();
		
		Bank b=new HDFCbank();
		b.credit();
		b.debit();
		b.loan();
	}

}
