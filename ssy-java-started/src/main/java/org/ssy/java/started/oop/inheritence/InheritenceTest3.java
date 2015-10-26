package org.ssy.java.started.oop.inheritence;

/**
 * @author	Lian
 * @time	2015年10月27日 上午1:12:17
 * @desc	多重继承是同样的道理
 */
public class InheritenceTest3 {
	public static void main(String[] args) {
		Son son = new Son();
	}
}

class Grandpa {
	public Grandpa() {
		System.out.println("Grandpa");
	}
}

class Father extends Grandpa{
	public Father() {
		System.out.println("Father");
	}
}

class Son extends Father {
	public Son() {
		System.out.println("Son");
	}
}
