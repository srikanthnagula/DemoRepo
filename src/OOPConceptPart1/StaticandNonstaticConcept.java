package OOPConceptPart1;

public class StaticandNonstaticConcept {
String name = "Tom";
static int Age =25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum();
StaticandNonstaticConcept.sum();
System.out.println(Age);
System.out.println(StaticandNonstaticConcept.Age);
StaticandNonstaticConcept obj = new StaticandNonstaticConcept();
System.out.println(obj.name);
obj.sendMail();
	}

	public void sendMail() {
		System.out.println("Send Mail Method");
	}
	public static void sum() {
		System.out.println("Sum Method");
	}
}
