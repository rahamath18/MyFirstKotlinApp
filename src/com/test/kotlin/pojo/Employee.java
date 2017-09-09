package com.test.kotlin.pojo;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private Integer id;
	
	private boolean active;
	
	private List<String> childNames;
	
	public Employee(){}
	

	public Employee(String name, Integer id, boolean active, List<String> childNames) {
		super();
		this.name = name;
		this.id = id;
		this.active = active;
		this.childNames = childNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<String> getChildNames() {
		return childNames;
	}

	public void setChildNames(List<String> childNames) {
		this.childNames = childNames;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.id + ", " + this.active + ", " + this.childNames;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
