package JavaBasics;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=10;
int j= i++;
System.out.println(i);
System.out.println(j);

int k=5;
int l=++k;
System.out.println(k);
System.out.println(l);
for(int a=10;a>1;--a) {
	System.out.print(a);
}
while(k >0) {
	System.out.println(k);
	--k;
}
	}
}
