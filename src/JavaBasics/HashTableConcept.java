package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h =new Hashtable();
		h.put("A","Test");
		h.put("B","Hello");
		h.put("C","World");
		
		System.out.println(h.size());
		h.put(1,100);
		h.put(2,200);
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("A"));
		h.put(5,"String");
		
		Hashtable<Integer,Integer> h1 =new Hashtable<Integer,Integer>();
		h1.put(1,100);
		Hashtable<Integer,String> h2 =new Hashtable<Integer,String>();
		h2.put(1,"String1");
		

	}

}
