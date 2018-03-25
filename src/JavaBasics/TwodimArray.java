package JavaBasics;

public class TwodimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[] [] =new String [4][3];
System.out.println("Total Number of Rows " + s.length);
System.out.println("Total Number of Columns "+s[0].length);
s[0][0]= "Tom1";
s[0][1]="Tom2";
s[0][2]="Tom3";
s[1][0]= "Mad1";
s[1][1]="Mad2";
s[1][2]="Mad3";
s[2][0]= "Crap1";
s[2][1]="Crap2";
s[2][2]="Crap3";
s[3][0]= "Junk1";
s[3][1]="Junk2";
s[3][2]="Junk3";

System.err.println(s[1][2]);
for(int i=0;i<s.length;i++) {
	for(int j=0;j<s[0].length;j++) {
		System.out.println(s[i][j]);
	}
}
	}

}
