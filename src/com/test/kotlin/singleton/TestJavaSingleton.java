package com.test.kotlin.singleton;

public class TestJavaSingleton {

	public static void main(String[] args) {

		JavaSingleton javaSingleton = JavaSingleton.getInstance();
		
		System.out.println(javaSingleton.getName());
		
		//output: KotlinProg
	}

}
