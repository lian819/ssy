package org.ssy.java.basic.finaltest;

/**
 * @author	Lian
 * @time	2015年10月27日 下午11:57:00
 * @desc	final修饰一个类时, 表示该类是一个终态类, 即不可被继承
 * 			final修饰一个方法时, 表示该方法时一个终态方法, 不能呗重写
 * 			final修饰一个属性时, 表示该属性是一个终态属性, 不能更改.
 * 				*. 当final修饰一个原生数据类型时, 表示该原生数据类型的值不能发生变化(比如说不能从10变到20)
 * 				*. 当final修饰一个引用类型时, 表示该引用类型不能再指向其他对象了, 但该引用所指向的内容是可以发生变化的
 */
public class FinalTest {
	public static void main(String[] args) {
//		H h = new H();
//		h.output();

		People people = new People();
//		people.age = 20;
//		people.address = new Address();
		people.address.name = "shanghai";
	}
}

/**
 *  final类不能被继承
 */
//final class A {
//	
//}
//
//class B extends A{
//	
//}

/**
 * final方法不能被覆盖
 */
//class G {
//	public final void output() {
//		System.out.println("G");
//	}
//}
//
//class H extends G {
//	public void output() {
//		System.out.println("H");
//	}
//}

/**
 * final属性不可被更改
 */
class People {
	final int age = 10;
	final Address address = new Address();
}

class Address {
	String name = "bejing";
}