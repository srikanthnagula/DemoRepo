package JavaBasics;

public class IfelseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
int b=10;
a=a+b;
b=a-b;
a=a-b;
int c=a+b;
System.out.println(a);
System.out.println(b);
if((a>b)&(a<b)) {
	System.out.println(a+ " is bigger value than "+ b +" and "+ c);
}else if(b>c){
	System.out.println(b+ " is bigger value than "+ a +" and "+ c);
}else {
	System.out.println(c+ " is bigger value than "+ b +" and "+ a);
}
	}


}
