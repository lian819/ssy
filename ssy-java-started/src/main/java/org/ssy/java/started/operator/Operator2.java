package org.ssy.java.started.operator;

/**
 * @author	Lian
 * @time	2015年10月26日 上午1:43:26
 * @desc	关系运算符: >, <, ==, !=, >=, <=, 关系运算的结果是boolean值
 * 			逻辑运算符: 重点讲解两个, 逻辑运算符本身也返回一个boolean值
 * 				1) 逻辑与: 使用&&表示, 只有两个操作符全为真时, 结果才为真
 * 				2) 逻辑或: 使用||表示, 只有两个操作符全为假时, 结果才为假
 * 			关于变量的自增与自减运算
 * 				1)关于int b = a++, 作用是先将a的值赋给b, 然后再让a自增1
 * 				2)关于int b = ++a, 作用是先让a自增1, 然后再将a的值赋给b
 */
public class Operator2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		// relation operator
		boolean flag1 = a > b;
		System.out.println("a>b=" + flag1);

		// logic operator
		boolean flag2 = (a > b) && (c < d);
		System.out.println(flag2);
		boolean flag3 = (a > b) || (c < d);
		System.out.println(flag3);
	}
}
