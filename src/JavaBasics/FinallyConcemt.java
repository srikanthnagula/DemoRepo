package JavaBasics;


public class FinallyConcemt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//test1();
//test2();
divisio();

	}
public static void test1() {
	try {
		System.out.println("Inside test1 Method");
		throw new RuntimeException("test1");
		} catch  (Exception e) {
			System.out.println("Inside Catch Methd");
		}
	finally
	{
		System.out.println("Inside finally block");
	}
	
	}
public static void test2() {
	try {
		System.out.println("inside test2 Method ");
	}
	finally {
		System.out.println("Finally block in Test2 method ");
	}
}
public static void divisio() {
	int i=10;
	try {
		System.out.println("inside try block in division method ");
		int k =i/0;
	}catch(ArithmeticException e) {
		System.out.println("Inside Catch block - division");
		System.out.println("Divide by Zero Error ");
	}
	finally {
		System.out.println("Execute this code even afterexception");
	}
}
}
