package OOPConceptPart1;

public class Car {

	int model;
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car Honda=new Car();
Car Tata =new Car();
Car Mahindra=new Car();
Honda.model=2007;
Honda.wheel=4;

Tata.model=2006;
Tata.wheel=5;

Mahindra.model=2010;
Mahindra.wheel=6;
System.out.println("Before shifting the references");
System.out.println(Honda.model);
System.out.println(Honda.wheel);
System.out.println(Tata.model);
System.out.println(Tata.wheel);
System.out.println(Mahindra.model);
System.out.println(Mahindra.wheel);
System.out.println("After Shifting the references");
Honda=Tata;
Tata=Mahindra;
Mahindra=Honda;
Honda.model=2015;
System.out.println(Honda.model);
Mahindra.model=2020;
System.out.println(Honda.model);
	}

}
