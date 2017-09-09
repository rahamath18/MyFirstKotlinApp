package com.test.kotlin.pojo;

import java.util.Arrays;
import java.util.List;

public class TestPOJO {

	public static void main(String[] args) {
		 
		List<String> childNames = Arrays.asList("child1", "child2");
				
		Employee obj = new Employee("abcd", 1, true, childNames);
	        
		System.out.println(obj);
		
		// output: abcd, 1, true, [child1, child2]
		// refer toString method

	}

}
