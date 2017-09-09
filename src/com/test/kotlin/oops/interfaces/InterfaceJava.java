package com.test.kotlin.oops.interfaces;

public interface InterfaceJava {

	public abstract void getEmployeeDetails();
	
	public abstract void getCompanyDetails();
	
}

class InterfaceJavaImpl implements InterfaceJava {

	@Override
	public void getEmployeeDetails() {
		System.out.println("Fetch employee details from DB!");
	}

	@Override
	public void getCompanyDetails() {
		System.out.println("Fetch company details from DB!");

	}
	
}