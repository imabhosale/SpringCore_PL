package com.abhi.springcore.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private String name;
	
	private List<String> mob;
	
	private Set<String> address;
	private Map<String, String> course;
	public Emp(String name, List<String> mob, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.mob = mob;
		this.address = address;
		this.course = course;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMob() {
		return mob;
	}
	public void setMob(List<String> mob) {
		this.mob = mob;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	

}
