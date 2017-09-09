package com.test.kotlin.oops.interfaces;

public class TestInterfaceJavaImpl {

	public static void main(String[] args) {
		
		InterfaceJava inter = new InterfaceJavaImpl();
		inter.getEmployeeDetails();
		inter.getCompanyDetails();
		
		/*
		 
		 output:
		 
		 Fetch employee details from DB!
		 Fetch company details from DB!

		 */
	}
}
