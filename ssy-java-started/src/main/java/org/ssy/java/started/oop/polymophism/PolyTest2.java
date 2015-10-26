package org.ssy.java.started.oop.polymophism;

/**
 * @author	Lian
 * @time	2015年10月27日 上午1:14:59
 * @desc	多态: 父类的引用可以指向子类的实例
 */
public class PolyTest2 {
	public static void main(String[] args) {
//		Animal animal = new Cat();
//		Animal animal2 = new Animal();
//
//		animal2 = animal;
//		animal2.sing();

//		Animal animal = new Animal();
//		Animal animal2 = new Cat();
//
//		animal2 = animal;
//		animal2.sing();

//		Cat cat = new Cat();
//		Animal animal = cat;
//		animal.sing();

		// error. ClassCastException
//		Animal animal = new Animal();
//		Cat cat = (Cat)animal;

		// 向上类型转换
//		Cat cat = new Cat();
//		Animal animal = cat;
//		animal.sing();

		// 向下类型转换, 必须使用强制类型转换
		Animal a = new Cat();
		Cat cat = (Cat)a;
		cat.sing();
	}
}

class Animal {
	public void sing() {
		System.out.println("animal is singing");
	}
}

class Dog extends Animal {
	public void sing() {
		System.out.println("Dog is singing");
	}
}

class Cat extends Animal {
	public void sing() {
		System.out.println("Cat is singing");
	}
}
