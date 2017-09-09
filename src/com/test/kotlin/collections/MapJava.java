package com.test.kotlin.collections;

import java.util.HashMap;
import java.util.Set;

public class MapJava {
	
	public static void main(String[] args) {
		
		HashMap<String, String> aMap = new HashMap<String, String>();
		aMap.put("name1", "John");
		aMap.put("name2", "Mathew");
		aMap.put("name3", "Gospal");
	    
		Set<String> aKeySet = aMap.keySet();
		for (String key : aKeySet) {
			System.out.println(aMap.get(key));
		}
		
	}

}