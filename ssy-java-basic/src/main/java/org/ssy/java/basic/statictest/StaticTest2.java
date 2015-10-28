package org.ssy.java.basic.statictest;

/**
 * @author	Lian
 * @time	2015年10月27日 下午11:14:53
 * @desc	static关键字: 可以修饰属性; 可以修饰方法; 还可以修饰类.
 * 			static修饰方法: 和修饰属性一样 
 */
public class StaticTest2 {
	public static void main(String[] args) {
		MyStatic2 myStatic2= new MyStatic2();
		myStatic2.output();
		MyStatic2.output();
	}
}

class MyStatic2 {
	public static void output() {
		System.out.println("static method");
	}
}
