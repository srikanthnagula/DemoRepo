package JavaBasics;

public class ConstructorConcept {

	//Constructor will not return any variable
	//It will not be static
	//Name must be same as class
	//looks like function, but 
	//3 types of constructors - default constructor(or no arguments), Single Argument, two arguments
	public ConstructorConcept() {
		
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i ) {
		System.out.println("Single parameter Constructor ");
		System.out.println("Value of i -  " + i);
	}
	
	public ConstructorConcept(int i, int j ) {
		System.out.println("Two parameter Constructor " );
		System.out.println("Value of i -  " + i);
		System.out.println("Value of j -  " + j);
	}
	
	public static void main(String[] args) {
		
		
		ConstructorConcept obj1 = new ConstructorConcept();
		ConstructorConcept obj2 = new ConstructorConcept(5);
		ConstructorConcept obj3 = new ConstructorConcept(10,20);
		

		

	}

}
