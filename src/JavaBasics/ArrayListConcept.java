package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		
		ar.add("Tom");//3
		ar.add("123.45");//4
		
		System.out.println(ar.size());
		
		ar.add('c');//5
		ar.add("Hello");//6
		
		
		ar.remove(6); //Deletes above value
		
		System.out.println(ar.get(4));
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
			
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(12);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("ass12");
	}

}
