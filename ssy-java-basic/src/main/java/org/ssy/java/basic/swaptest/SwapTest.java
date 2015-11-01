package org.ssy.java.basic.swaptest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午10:39:38
 * @desc	Swap 交换
 */
public class SwapTest {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		int x = 3;
		int y = 4;

		SwapTest.swap(x, y);

		System.out.println(x);
		System.out.println(y);

		System.out.println("************************");

		int temp = x;
		x = y;
		y = temp;

		System.out.println(x);
		System.out.println(y);

		System.out.println("************************");

		// 不使用中间变量进行互换
		int a = 3;
		int b = 4;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
	}
}
