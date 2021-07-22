package com.demo.coll;
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo2 {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>(); 
		s1.add("HELLO");
		s1.add("5664");
		s1.add("Friends");
		s1.add("welcome");
		s1.add("Friends");
		s1.add("zz");
		for(String s : s1) {
			System.out.print(s+" ");
		}
		Set<Integer> s2 = new HashSet<Integer>();
		s2.addAll(Arrays.asList(new Integer[]  {1,3,66,41}));
		for(Integer s : s2) {
			System.out.print(s+" ");
		}
		Set<Integer> s3 = new HashSet<Integer>();  
        s3.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));  
        
        //intersection
        s2.retainAll(s3);
        System.out.println();
        System.out.println(s2);
        // difference
        
        s2.removeAll(s3);
        System.out.println(s2);
        //LINKED HASH SET
        
          Set<String> s4 = new LinkedHashSet<String>();
        s4.addAll(s1);
        for(String s : s4) {
        	System.out.println(s);
        }
        Set<String> s5 = new LinkedHashSet<String>();
        s5.add("HELLO");
		s5.add("5664");
		s5.add("Friends");
		s5.add("welcome");
		s5.add("Friends");
		s5.add("zz");
       //System.out.println(s5);
        for(String s : s5) {
        	System.out.println(s);
        }
        
        //TREE SET
        //ASCENDING
        Set<String> s6 = new TreeSet<String>();
        s6.add("HELLO");
		s6.add("5664");
		s6.add("Friends");
		s6.add("welcome");
		s6.add("Friends");
		s6.add("zz");
       //System.out.println(s5);
        for(String s : s6) {
        	System.out.print(s+" ,");
        }System.out.println();
        }
        
	}

