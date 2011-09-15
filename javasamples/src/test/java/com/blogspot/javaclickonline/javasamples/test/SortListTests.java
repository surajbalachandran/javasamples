package com.blogspot.javaclickonline.javasamples.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SortListTests {

	@Test
	public void testSortLists() {
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee("Suraj", 30, 64000.0d);
		Employee emp2 = new Employee("Aarush", 0, 0.0d);
		Employee emp3 = new Employee("Lakshmi", 28, 61000.0d);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		for(Employee emp : employees) {
			System.err.println(emp);
		}
		
		System.err.println("\r\n");
		Collections.sort(employees);
		
		for(Employee emp : employees) {
			System.err.println(emp);
		}
	}
	
	@Test
	public void testSortListsWithNameComparator() {
		
		
		System.err.println("Sort Lists with name comparator...");
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee("Suraj", 30, 64000.0d);
		Employee emp2 = new Employee("Aarush", 0, 0.0d);
		Employee emp3 = new Employee("Lakshmi", 28, 61000.0d);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		for(Employee emp : employees) {
			System.err.println(emp);
		}
		
		System.err.println("\r\n");
		Collections.sort(employees, new EmployeeByNameComparator());
		
		for(Employee emp : employees) {
			System.err.println(emp);
		}
	}
	
	@Test
	public void testSortListsWithSalaryComparator() {
		
		
		System.err.println("Sort Lists with name comparator...");
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee("Suraj", 30, 64000.0d);
		Employee emp2 = new Employee("Aarush", 0, 0.0d);
		Employee emp3 = new Employee("Lakshmi", 28, 61000.0d);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		for(Employee emp : employees) {
			System.err.println(emp);
		}
		
		System.err.println("\r\n");
		Collections.sort(employees, new EmployeeBySalaryComparator());
		
		for(Employee emp : employees) {
			System.err.println(emp);
		}
	}
}
