package org.task;

public class B extends A {
	public void loc() {
		System.out.println("Company Location is Coimbatore");
	}
	public void deta() {
		System.out.println("Company details is in ORACLE Database");

	}
	public static void main(String[] args) {
		B b = new B();
		b.loc();
		b.deta();
		A a = new A();
		a.id();
		a.name();
		
	}

}
