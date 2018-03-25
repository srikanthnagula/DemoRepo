package OOPConceptPart1;

public class CallbyReferenceAndCallbyValue {

	int p;
	int q;
	public static void main(String[] args) {
		CallbyReferenceAndCallbyValue obj =new CallbyReferenceAndCallbyValue();
		int x =10;
		int y =20;
		obj.testSum(x,y);//Call by value/ pass by value
		
		obj.p = 50;
		obj.q = 30;
		System.out.println("Before Swap " + obj.p);
		System.out.println("Before Swap " +obj.q);
		obj.swap(obj);
		//after swap
		System.out.println("After Swap " + obj.p);
		System.out.println("After Swap " +obj.q);
	}

	public int testSum(int a, int b) {
		int c=a+b;
	return c;
}
	public void swap(CallbyReferenceAndCallbyValue t) {//Input parameters - > "Class name" and “t” is reference name of the calling object
		int temp;
		temp=t.p;//p is global variable will be initialized in the calling object;
		t.p=t.q;//q is global variable will be initialized in the calling object;
		t.q=temp;
		
		
	}
}
