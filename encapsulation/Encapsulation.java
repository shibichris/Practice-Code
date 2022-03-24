package com.ood.concepts.encapsulation;

class Person {

	private double id;
	private String name;

	public Person() {
	
		id = Math.random();
		sayHello();
	}


	private void sayHello() {
		System.out.println("Hello - " + getId());
	}

	public double getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("Tirthal");
System.out.println("Person 1 - " + p1.getId() + " : " + p1.getName());
	}
}