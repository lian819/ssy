package org.ssy.java.basic.objecttest;

/**
 * @author	Lian
 * @time	2015年10月29日 上午12:25:20
 * @desc	java.lang.Object无需导入. 会自动导入
 * 			当打印引用的时候, 实际上会打印出引用所指对象的toString()方法的返回值, 以为每个类都直接或间接继承自Object, 因此每个类都有toString()方法
 */
public class ObjectTest {
	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object);
		System.out.println(object.toString());

		String str = "aaa";
		System.out.println(str);
		System.out.println(str.toString());

		Student stu = new Student();
		System.out.println(stu);
		System.out.println(stu.toString());
	}
}

class Student {
	public String toString() {
		return "hello";
	}
}
