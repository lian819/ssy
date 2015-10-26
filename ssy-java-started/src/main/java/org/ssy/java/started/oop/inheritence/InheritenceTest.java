package org.ssy.java.started.oop.inheritence;

/**
 * @author	Lian
 * @time	2015年10月27日 上午12:56:20
 * @desc	1) 父类有的, 子类也有;
 * 			2) 父类没有的, 子类可以增加;
 * 			3) 父类有的, 子类可以改变;
 */
public class InheritenceTest {
	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple.name);
	}
}

class Fruit {
//	String name = "fruit";
}

class Apple extends Fruit {
	String name = "apple";
}
