package com.abhi.springcore.refference;

public class A {
	private int x;
	private B ob;
	public A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getob() {
		return ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setob(B ob) {
		this.ob = ob;
	}

}
