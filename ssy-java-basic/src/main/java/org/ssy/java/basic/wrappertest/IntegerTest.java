package org.ssy.java.basic.wrappertest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午9:30:54
 * @desc	测试包装类
 */
public class IntegerTest {
	public static void main(String[] args) {
		int a = 10;
		Integer integer = new Integer(a);
		int b = integer.intValue();

		System.out.println(integer);
		System.out.println(integer.toString());
		System.out.println(integer.intValue());
		System.out.println(b);
	}
}
