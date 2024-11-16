package com.abhi.springcore.ci;

public class Certi {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public Certi(String name) {
		super();
		this.name = name;
	}

	
	

}
