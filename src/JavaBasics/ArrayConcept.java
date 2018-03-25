package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i[] =new int[4];
i[0]=10;
i[1]=20;
i[2]=30;
i[3]=40;
System.out.print(i[2]+i[3]+i[1]+i[0]);
i[1]=i[3]-i[0];
System.out.print(i[1]);
System.out.print(i.length);
int k =i.length;
for(int l=k-1;l>=0;l--) {
	System.out.print(i[l]);
}
while(k>0) {
	System.out.print(i[k-1]);
	k--;
}
double d[] = new double[2];
d[0]=12.45;
d[1]=14.56;
System.out.println(d[0]+d[1]);

boolean b[]=new boolean[2];
b[0]=true;
b[1]=false;
System.out.println(b[0]);
System.out.println(b[1]);

String s[]=new String[2];
s[1]="string 1";
s[0]="string 2";
System.out.println(s[0]+s[1]);

Object ob[]=new Object[4];
ob[0]="Tom";
ob[1]=25;
ob[2]="1/1/1990";
ob[3]='M';
for(int y=0;y<ob.length;y++) {
	System.out.println(ob[y]);
}

	}

}
