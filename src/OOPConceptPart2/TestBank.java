package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println("Minimum Balance to be maintained - "+USbank.min_bal);
		HSBCBank b =new HSBCBank();
		b.credit();//from US Bank
		b.debit();//from US Bank
		b.Carloan();//from HSBC Bank
		b.EduLoan();//from HSBC Bank
		b.transfermethod();//from US Bank
		b.MutualFund();//from Brazil Bank
		
		//Dynamic polymorphism
		//Child class Object can be referred by parent interface variable
		
		USbank C =new HSBCBank();
		C.credit();
		C.debit();
		C.transfermethod();
	}

}
