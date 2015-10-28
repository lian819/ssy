package org.ssy.java.basic.statictest;

/**
 * @author	Lian
 * @time	2015年10月28日 上午12:28:08
 * @desc	static 修饰静态代码块. 先于构造方法执行. 并且仅执行一次,是在类被加载时, 因为每个类只会被加载一次.
 * 			静态代码块的作用也是完成一些初始化工作. 首先执行静态代码块, 然后执行 构造方法.
 * 			静态代码块在类被加载的时候执行, 而构造方法是生成对象的时候执行; 想要调用某个类来生成对象, 首先
 * 		要将类加载带JVM, 然后由JVM加载这个类来生成对象
 */
public class StaticTest4 {
	public static void main(String[] args) {
//		P p = new P();
//		P p2 = new P();
		new S();
		System.out.println("********************");
		new S();
	}
}

class P {
	// 静态代码块
	static {
		System.out.println("P static block");
	}

	public P() {
		System.out.println("P constructor");
	}
}

class Q extends P {
	static {
		System.out.println("Q static block");
	}

	public Q() {
		System.out.println("Q constructor");
	} 
}

class S extends Q {
	static {
		System.out.println("S static block");
	}

	public S() {
		System.out.println("S constructor");
	} 
}
