package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading obj =new MethodOverloading();
obj.sum();
System.out.println(obj.sum(5));
System.out.println(obj.sum(10,5));

	}
public void sum() {
	System.out.println("Sum Method  - Zero Param");
}
public int sum(int i) {
	System.out.println("Sum method - 1 param");
	return i;
}
public int sum(int i, int j) {
	System.out.println("Sum method - 2 param");
	return i+j;
	
}
}
