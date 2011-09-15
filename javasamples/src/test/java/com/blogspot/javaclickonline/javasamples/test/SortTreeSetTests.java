package com.blogspot.javaclickonline.javasamples.test;

import java.util.TreeSet;

import org.junit.Test;

public class SortTreeSetTests {

	@Test
	public void testSortTreeSets() {
		
		TreeSet<Employee> treeSet = new TreeSet<Employee>(new EmployeeBySalaryComparator());
		Employee emp1 = new Employee("Suraj", 30, 64000.0d);
		Employee emp2 = new Employee("Aarush", 0, 0.0d);
		Employee emp3 = new Employee("Lakshmi", 28, 61000.0d);
		
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		
		for(Employee emp : treeSet) {
			System.err.println(emp);
		}
	}
}
