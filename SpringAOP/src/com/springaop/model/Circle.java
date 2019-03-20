package com.springaop.model;

import com.springaop.aspect.Loggable;

public class Circle {

	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//throw new RuntimeException();
	}
	
	public String setNameAndreturn(String name) {
		this.name = name;
		return name;
	}
}
