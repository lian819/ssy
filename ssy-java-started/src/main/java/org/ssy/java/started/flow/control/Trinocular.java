package org.ssy.java.started.flow.control;

/**
 * @author	Lian
 * @time	2015年10月26日 上午2:01:48
 * @desc	三目运算符
 */
public class Trinocular {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		int e = a > b ? c : d;
		System.out.println(e);
	}
}
