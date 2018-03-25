package OOPConceptPart1;

public class FunctionsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsinJava obj = new FunctionsinJava();
		obj.Test();
		int x =obj.pqr();
		System.out.println(x);
		String s1 = obj.qa();
		System.out.println(s1);
		int y = obj.division(x,10);
		System.out.println(y);
	}
// non static Methods
	public void Test() {
		System.out.println("Test Method");
	}
	public int pqr() {
		System.out.println("pqr method");
		int a =10;
		int b =20;
		int c =a+b;
		return c;
	}
    public String qa() {
    	System.out.println("QA Method");
    	String s = "Selenium";
    	return s;
    }
    // x and y -> input arguments or parameters
    public int division(int x, int y) {
    	System.out.println("Divsion Method");
    	int d=x/y;
    	return d;
    }
}
