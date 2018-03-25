package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// String to Integer conversion
		String s="100";
	System.out.println(s+20);
	int k= Integer.parseInt(s);
	System.out.println(k+20);
	
	// String to Double conversion
	String t="123.34";
	double d= Double.parseDouble(t);
	System.out.println(d);
	
	// String to Boolean conversion
	String u="True";
	Boolean b=Boolean.parseBoolean(u);
	System.out.println(b);
	
//  Integer to String conversion
	int j=200;
	String s1=String.valueOf(j);
	System.out.println(s1+11);
	
	}

}
