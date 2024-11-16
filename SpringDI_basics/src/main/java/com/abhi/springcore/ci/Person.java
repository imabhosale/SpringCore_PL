package com.abhi.springcore.ci;

public class Person {
	private String name;
	private int persionId;
	
	private Certi certi;
	
	@Override
	public String toString() {
		return this.name+": "+this.persionId+" "+this.certi.getName();
	}

	public Person(String name,int personId, Certi certi) {
		this.name=name;
		this.persionId=personId;
		this.certi=certi;
	}

}
