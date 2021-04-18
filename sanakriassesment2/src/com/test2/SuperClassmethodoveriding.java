package com.test2;
import java.io.IOException;
public class SuperClassmethodoveriding {
	public static void main(String[] args) throws Exception {
		Dog a = new Dog();
		a.bark("WoW_WoW");
	}
}
class Animal {

	public void bark(String Sound) {
		System.out.println("Animal :" + Sound);
	}
}
class Dog extends Animal {

	public void bark(String Sound) {
		System.out.println("Dog:" + Sound);
		super.bark(Sound);

	}
}
