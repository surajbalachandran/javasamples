package com.blogspot.javaclickonline.javasamples.test;

import org.junit.Test;

public class JavaClassLoader {

	@Test
	public void testClassLoader() {
		
		String bootstrapClasspath = System.getProperty("sun.boot.class.path");
		String extensionsClasspath = System.getProperty("java.ext.dirs");
		String applicationClasspath = System.getProperty("java.class.path");

		System.err.println("BootStrapClasspath: " + bootstrapClasspath);
		System.err.println("ExtensionsClasspath: " + extensionsClasspath);
		System.err.println("ApplicationClasspath: " + applicationClasspath);
		
		System.err.println(Employee.class.getClassLoader());
		System.err.println(String.class.getClassLoader());
	}
}