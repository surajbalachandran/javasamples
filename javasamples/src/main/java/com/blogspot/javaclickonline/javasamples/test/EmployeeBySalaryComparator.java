package com.blogspot.javaclickonline.javasamples.test;

import java.util.Comparator;

public class EmployeeBySalaryComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {

		int result = 0;
		if(null != o1 && null != o2) {
			
			
			if(o1.getSalary() > o2.getSalary()) {
				
				result = 1;
			} else if(o2.getSalary() > o1.getSalary()) {
				
				result = -1;
			}
		}
		return result;
	}
}
