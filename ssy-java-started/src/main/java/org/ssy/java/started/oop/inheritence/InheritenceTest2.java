package org.ssy.java.started.oop.inheritence;

/**
 * @author	Lian
 * @time	2015年10月27日 上午1:02:28
 * @desc	
 */
public class InheritenceTest2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.run();
	}
}

class Animal {
	public void run() {
		System.out.println("Animal is running!");
	}
}

class Dog extends Animal {
	public void run() {
		System.out.println("Dog is running");
		super.run();
	}
}