package com.demo.coll;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(3);
	l1.add(1,66);
	l1.add(2,12);
	System.out.println("The list l1 is");
	System.out.println(l1);
	l1.remove(0);//type the index here
	System.out.println("The list l1 after deletion is");
	System.out.println(l1);
	List<Integer> l2 = new ArrayList<Integer>();
	l2.addAll(l1);
	System.out.println("The list l2  is");
	System.out.println(l2);
	l2.set(1, 44);
	System.out.println("The updated list l2  is");
	System.out.println(l2);
	l2.add(55);
	l2.add(100);
	
	//printing them 
	for(Integer i : l2) {
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=0;i<l2.size();i++) {
		System.out.print(l2.get(i)+" ");
	}
	

	}

}
