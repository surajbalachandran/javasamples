package com.blogspot.javaclickonline.javasamples.test;

import org.junit.Test;

import com.blogspot.javaclickonline.javasamples.test.MyOuter.MyInner;

public class InnerClassTests {

	@Test
	public void testRegularInnerClass() {
	
		System.err.println("testRegularInnerClass");
		MyOuter outer = new MyOuter();
		MyInner inner = outer.new MyInner();
		inner.seeOuter();
	}
	
	@Test
	public void testRegularInnerClassWithMakeInner() {
		
		System.err.println("testRegularInnerClassWithMakeInner");
		MyOuter outer = new MyOuter();
		outer.makeInner();
	}
	
	@Test
	public void testRegularInnerClassInOneLine() {
		
		System.err.println("testRegularInnerClassInOneLine");
		MyOuter.MyInner myInner = new MyOuter().new MyInner();
		myInner.seeOuter();
	}
	
	@Test
	public void testRegularInnerClassOuterThis() {
		
		System.err.println("testRegularInnerClassOuterThis");
		MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.showThisOuter();
	}
	
	@Test
	public void testStaticNestedClass() {
		
		System.err.println("testStaticNestedClass");
		StaticMyOuter.MyInner myInner = new StaticMyOuter.MyInner();
		myInner.go();
	}
}
