package com.test.kotlin.singleton;

public class JavaSingleton {

private static JavaSingleton mySingleton;
	
	private JavaSingleton() { }
	
	public static synchronized JavaSingleton getInstance() {
		
		if(mySingleton == null)
			mySingleton = new JavaSingleton();
		
		return mySingleton;
	}
	
	public String getName() {
		return "KotlinProg";
	}
	
}