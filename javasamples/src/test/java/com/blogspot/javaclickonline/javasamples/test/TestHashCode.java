package com.blogspot.javaclickonline.javasamples.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestHashCode {

	@Test
	public void testHashCode() {
		
		Person p1 = new Person("suraj");
		Person p2 = new Person("suraj");
		
//		System.out.println(p1.equals(p2));
//		
//		Map<Person, String> personMap = new HashMap<Person, String>();
//		
//		System.out.println(p1.hashCode());
//		personMap.put(p1, p1.getName());
//	
//		p1.setName("Lakshmi");
//		System.out.println(p1.hashCode());
//		
//		System.out.println(personMap.get(p1));
//		
//		p1.setName("suraj");
//		System.out.println(p1.hashCode());
//		System.out.println(personMap.get(p1));
//		
		
		Set<Person> personSet = new HashSet<Person>();
		System.out.println(personSet.add(p1));
		p1.setName("Lakshmi");
		System.out.println(personSet.add(p1));
		
		System.out.println("amy".hashCode());
		System.out.println("amy".hashCode());
		System.out.println("may".hashCode());
	}
}

class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

}
