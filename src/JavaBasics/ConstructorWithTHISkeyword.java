package JavaBasics;

public class ConstructorWithTHISkeyword {

	String name;
	int age;
	public ConstructorWithTHISkeyword(String name, int age) {
		this.name =name;
		this.age=age;
				
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorWithTHISkeyword obj =new ConstructorWithTHISkeyword("Tom",30);
		
	}

}
