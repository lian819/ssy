package org.ssy.java.basic.singleton;

/**
 * @author	Lian
 * @time	2015年10月28日 上午1:26:46
 * @desc	单例模式测试. 一个类只能有一个实例
 */
public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		// 比较两个对象的引用地址
		System.out.println(singleton==singleton2);
	}
}

class Singleton {
	private static Singleton singleton = new Singleton();

	// 私有构造方法, 只能在类内部使用
	private Singleton() {

	}

	// 提供静态方法, 返回单例对象
	public static Singleton getInstance() {
		return singleton;
	}


//	private static Singleton singleton;
//
//	// 私有构造方法, 只能在类内部使用
//	private Singleton() {
//
//	}
//
//	// 提供静态方法, 返回单例对象
//	public static Singleton getInstance() {
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
}
