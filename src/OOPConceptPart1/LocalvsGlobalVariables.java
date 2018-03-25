package OOPConceptPart1;

public class LocalvsGlobalVariables {

	String name ="Tom";
	int age = 25;
	public static void main(String[] args) {
	
		int i =10;
System.out.println(i);

LocalvsGlobalVariables obj1 =new LocalvsGlobalVariables();
System.out.println(obj1.age + obj1.name);
System.out.println(obj1.sum());
	}
public int sum() {
	int i =50;
	int j = 20;
	int age = 35;
	return i+j+age;
	
}
	
}
