package org.ssy.java.started.oop;


/**
 * @author	Lian
 * @time	2015年10月26日 下午11:38:29
 * @desc	
 */
public class ParamTest {

	public void change(People p1, People p2) {
		p1.name = "lisi";
		p2.name = "wangwu";
	}

	public static void main(String[] args) {
		People p1 = new People();
		p1.name = "zhangsan";

		People p2 = p1;

		ParamTest pt = new ParamTest();
		pt.change(p1, p2);

		System.out.println(p1.name);
	}
}

class People {
	String name;
}
