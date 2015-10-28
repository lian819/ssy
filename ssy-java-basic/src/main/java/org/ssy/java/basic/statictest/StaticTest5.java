package org.ssy.java.basic.statictest;

/**
 * @author	Lian
 * @time	2015年10月28日 上午12:44:48
 * @desc	不能在一个静态方法里访问一个非静态的成员变量;
 * 			可以在静态方法中访问静态成员变量;
 * 			可以在非静态方法中访问静态成员变量;
 * 
 * 			静态的只能访问静态的, 非静态的可以访问一切
 * 
 * 			不能在静态方法中使用this关键字
 */
public class StaticTest5 {
	public static void main(String[] args) {
		W.chage();
	}
}

class W {
	int a = 10;
	public static void chage() {
		// can't use unstatic attribute in static method
//		a++;
	}
}
