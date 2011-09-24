package com.blogspot.javaclickonline.javasamples.test;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Employee implements Serializable, Comparable<Employee> {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private double salary;
	private transient Address address;
	
	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	public int compareTo(Employee o) {
		
		int result = 0;
		if(null != o) {
			
			
			if(o.getAge() > this.age) {
				
				result = 1;
			} else if(this.age > o.getAge()) {
				
				result = -1;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {

		return ToStringBuilder.reflectionToString(this);
	}
}
