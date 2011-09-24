package com.blogspot.javaclickonline.javasamples.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;


public class SerializationTests {

	@Test
	public void testSerialization() throws Exception {
		
		Employee employee = new Employee("Suraj", 30, 64000);
		Address address = new Address("3005 Warren Way", "Apt# B", "Carmel", "IN", "46033");
		employee.setAddress(address);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("target/oos.txt")));
		oos.writeObject(employee);
		oos.close();
	}
	
	@Test
	public void testDeSerialization() throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("target/oos.txt")));
		Employee employee = (Employee) ois.readObject();
		System.err.println(employee.toString());
	}
}
