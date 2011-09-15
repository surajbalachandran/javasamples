package com.blogspot.javaclickonline.javasamples.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class ListAndArraysTest {

	@Test
	public void testArraysAndList() {
		
		String[] s = {"zero", "one", "two", "three"};
		List<String> sList = Arrays.asList(s);
		sList.set(3, "six");
		s[1] = "four";
		for(String is : s) {
			System.err.println(is);
		}
	}
}
