package com.blogspot.javaclickonline.javasamples.test;

public class MyOuter {

	private int x = 7;
	
	public void makeInner() {
		
		MyInner myInner = new MyInner();
		myInner.seeOuter();
	}
	
	class MyInner {
		
		public void seeOuter() {
			
			System.err.println(x);
		}
		public void showThisOuter() {
			
			System.err.println("Inner class reference: " + this);
			System.err.println("Outer class reference: " + MyOuter.this);
		}
	}
}
