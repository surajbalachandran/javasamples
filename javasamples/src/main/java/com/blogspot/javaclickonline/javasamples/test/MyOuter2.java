package com.blogspot.javaclickonline.javasamples.test;

public class MyOuter2 {

	private String name = "hello my outer2";
	public void doStuff() {
		
		final String x = "Outer2";
		class MyInner2 {
			
			public void seeOuter() {
				
				System.err.println(name);
				System.err.println(x);
			}
		}
		
		MyInner2 inner = new MyInner2();
		inner.seeOuter();
	}
}
