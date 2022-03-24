package com.ood.concepts.inheritance;
public class Inheritance {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setId(123); 
		dog.sound(); 
	}
}
class Animal {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void sound() {
		System.out.println("By default it is mute");
	}
}
class Dog extends Animal {
	private void bark() {
		System.out.println("Dog '" + getId() + "' is barking");
	}
	@Override
	public void sound() {
		bark();
	}
}