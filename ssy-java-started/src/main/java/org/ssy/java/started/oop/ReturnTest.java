package org.ssy.java.started.oop;

/**
 * @author	Lian
 * @time	2015年10月26日 下午11:17:17
 * @desc	
 */
public class ReturnTest {
	public void method(int a) {
		if (a < 3) {
			System.out.println(++a);
			return;		// 遇到return, 方法返回
		}

		System.out.println(++a);
	}

	public static void main(String[] args) {
		ReturnTest test = new ReturnTest();
		test.method(2);
	}
}
