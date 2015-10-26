package org.ssy.java.started.oop.inheritence;

/**
 * @author	Lian
 * @time	2015年10月27日 上午12:46:52
 * @desc	要想生成子类的对象, 首先需要生成父类的对象, 没有父类的对象就没有子类的对象.
 * 			没有父亲, 就没有孩子
 */
public class Child extends Parent {
	public Child() {
		super(1);
		System.out.println("Child!");
	}

	public static void main(String[] args) {
		Child child = new Child();
	}
}
