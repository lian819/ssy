package org.ssy.java.started.oop.polymophism;

/**
 * @author	Lian
 * @time	2015年10月27日 上午1:14:59
 * @desc	多态: 父类的引用可以指向子类的实例
 */
public class PolyTest {
	public static void main(String[] args) {
		Flower rose = new Rose();
		rose.sing();
		Rose r = (Rose)rose;
		r.sing();
	}
}

class Flower {
	public void sing() {
		System.out.println("flower is singing");
	}
}

class Rose extends Flower {
	public void sing() {
		System.out.println("rose is singing");
	}
}
