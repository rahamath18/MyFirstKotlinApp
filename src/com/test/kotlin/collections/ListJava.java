package com.test.kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListJava {

	public static void main(String[] args) {
		
		// java.util.List<Integer> with classic approach
		List<Integer> aNumList = new ArrayList<Integer>();
		aNumList.add(11);
		aNumList.add(12);
		aNumList.add(13);
		
		for (int i = 0; i < aNumList.size(); i++) {
			System.out.println(aNumList.get(i));
		}
		for (Iterator iterator = aNumList.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			System.out.println(value);
		}
		
		
		// java.util.List<String> with classic approach
		List<String> aStrList = new ArrayList<String>();
		aStrList.add("John");
		aStrList.add("Mathew");
		aStrList.add("Gospal");
		
		for (int i = 0; i < aStrList.size(); i++) {
			System.out.println(aStrList.get(i));
		}
		for (Iterator iterator = aStrList.iterator(); iterator.hasNext();) {
			String value = (String) iterator.next();
			System.out.println(value);
		}
		
		
		
		// java.util.List<Integer> with LAMBDA approach
		List<Integer> aNumberList = Arrays.asList(1, 2, 3);
		aNumberList.forEach(System.out::println);
		
		for (Integer value : aNumberList) {
			System.out.println(value);
		}
		
		
		// java.util.List<String> with LAMBDA approach
        List<String> aStringList = Arrays.asList("Apple", "Banana", "Mango");
        aStringList.forEach(System.out::println);
        
        for (String value : aStringList) {
			System.out.println(value);
		}

        
	}

}
