package org.ssy.java.basic.statictest;

/**
 * @author	Lian
 * @time	2015年10月27日 下午11:14:53
 * @desc	static关键字: 可以修饰属性; 可以修饰方法; 还可以修饰类.
 * 			static修饰属性: 
 * 				* 无论一个类生成多少个对象, 所有这些对象共同使用唯一一份静态的成员变量; 一个对象对该静态成员变量进行修改,
 * 				    其他对象的静态成员变量也会随之修改;
 * 				* 如果一个成员变量是static的, 那么我们可以通过 类名.成员变量 的方式来使用它(推荐使用这种方式);
 */
public class StaticTest {
	public static void main(String[] args) {
//		MyStatic myStatic = new MyStatic();
//		MyStatic myStatic2 = new MyStatic();
//
//		myStatic.a = 10;
//		System.out.println(myStatic2.a);
		
		MyStatic myStatic = new MyStatic();
		MyStatic.a = 10;
		System.out.println(myStatic.a);
	}
}

class MyStatic {
	static int a;
}
