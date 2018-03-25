package JavaBasics;

public class B extends A {
public B(){
	super();
	System.out.println("Child class Constructor");
}

public B(int i ){
	super(10);
	System.out.println("Child class Constructor with 1 Parameter " + i);
}

public B(int i, int j){
	super(40, 30);
	System.out.println("Child class Constructor with 2 Parameters" +i);
	System.out.println("Child class Constructor with 2 Parameters" +j);
}

	public static void main (String args[]) {
		
		B obj1 = new B();
		B obj2 = new B(99);
		B obj3 = new B(79,89);
	}
}
