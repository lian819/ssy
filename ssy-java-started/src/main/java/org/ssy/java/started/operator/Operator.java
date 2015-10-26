package org.ssy.java.started.operator;

/**
 * @author	Lian
 * @time	2015年10月26日 上午1:21:12
 * @desc	运算符的练习
 * 			当有若干个变量参与运算时, 结果取决于类型范围最大的变量
 */
public class Operator {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		int c = a + b;
		int d = a - b;
		int e = a * b;
		System.out.println("a+b=" + c);
		System.out.println("a-b=" + d);
		System.out.println("a*b=" + e);

		// 取整
		int f = b / a;
		int g = a / b;
		System.out.println("b/a=" + f);
		System.out.println("a/b=" + g);
		
		// 精度转换
		double a1 = 1;
		int b1 = 2;
		double c1 = (a1/b1);
		System.out.println(c1);
		
		// 取余
		int a2 = 5;
		int b2 = 3;
		int c2 = a2%b2;
		System.out.println("5%3=" + c2);
	}
}
