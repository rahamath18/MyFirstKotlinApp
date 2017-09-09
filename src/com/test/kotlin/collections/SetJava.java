package com.test.kotlin.collections;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class SetJava {

	 public static void main(String[] args) {

	        // java.util.Set<Integer> with classic approach
	        Set<Integer> aNumSet = new HashSet<Integer>();
	        aNumSet.add(11);
	        aNumSet.add(12);
	        aNumSet.add(13);
 
	        for (Iterator iterator = aNumSet.iterator(); iterator.hasNext();) {
	            Integer value = (Integer) iterator.next();
	            System.out.println(value);
	        }

	        // java.util.Set<String> with classic approach
	        Set<String> aStrSet = new HashSet<String>();
	        aStrSet.add("John");
	        aStrSet.add("Mathew");
	        aStrSet.add("Gospal");
	        
	        for (String value : aStrSet) {
	            System.out.println(value);
			}

	    }
	}

