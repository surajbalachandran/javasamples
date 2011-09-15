package com.blogspot.javaclickonline.javasamples.test;

import java.util.Comparator;

public class EmployeeByNameComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {

		int result = 0;
		if(null != o1 && null != o2) {
			
			
			result = o2.getName().compareTo(o1.getName());
		}
		return result;
	}
}
