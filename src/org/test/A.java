package org.test;

public class A {
	  static int id=100;
	public static void m1() {
	System.out.println(id);	
	System.out.println(id);	
	System.out.println(id);	
	System.out.println(id);	
	
	System.out.println("new check");
	}
	private static void m2() {
		m1();
		
	}
	
}
