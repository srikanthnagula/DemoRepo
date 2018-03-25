package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// Static or Compile time Polymorphism
		BMW b =new BMW();
		b.start();
		b.Refuel();
		b.stop();
		b.theftsafety();
		b.engine();//this method is from great grand parent - 3 levels inherited
		System.out.println("#################");
		Car c =new Car();
		c.start();
		c.stop();
		c.Refuel();
		System.out.println("#################");
		
		//Top casting
		Car C1 =new BMW(); //Child class object can be refered by parent class reference variable - this is called Dynamic or runtime Polymorphism
		C1.start();//Method from BMW will be called 
		C1.stop();
		C1.Refuel();
		
	}

}
