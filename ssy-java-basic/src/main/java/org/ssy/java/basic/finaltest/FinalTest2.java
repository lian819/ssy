package org.ssy.java.basic.finaltest;

/**
 * @author	Lian
 * @time	2015年10月28日 上午12:18:09
 * @desc	final修饰属性时, 该属性必须赋初值; final属性赋初值的方法有两种
 * 				* 声明final类型的成员变量时, 就初始化final属性;
 * 				* 声明final类型的成员变量时不赋初值, 在每个构造函数里为final属性赋初值;
 */
public class FinalTest2 {
	final int a;

	public FinalTest2() {
		a = 0;
	}

	public FinalTest2(int a) {
		this.a = a;
	}
}
