package com.demo.coll;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MAPS
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1,"A");
		m1.put(2,"C");
		m1.put(3,"Aaasdjihfudwhf");
		m1.put(4,"B");
		System.out.println("Printing with Print Stream");
		System.out.println(m1);
		
		System.out.println("Printing with Entry Set");
		
		for(Map.Entry<Integer, String> me: m1.entrySet()) {
			System.out.print(me.getKey()+"-");
			System.out.println(me.getValue());
			
		}
		
		

	}

}
