package AbstractionConcept;

public abstract class Bank {
	
	//This is Partial Abstraction  - only 1 method is abstract and rest all are defined
	//Hiding the implementation logic is called Abstraction.
	//Abstract class can have abstract method as well as normal or non abstract method also.
	
	public abstract void loan(); 	// Abstract method , does not have a method body.

	public void credit() {
		System.out.println("Bank credit card -  ");
	}

	public void debit() {
		System.out.println("Bank  Debit card - ");
	}
}
