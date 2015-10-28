package org.ssy.java.basic.interfacetest;

/**
 * @author	Lian
 * @time	2015年10月27日 下午11:04:32
 * @desc	多态: 所谓多态, 就是父类型的引用可以指向子类型的对象, 或者接口类型的应用可以指向实现该接口的类的实例.
 * 		关于接口与实现接口的类的之间强制类型转换方式, 与父类和子类之间的强制转换方式完全一样.
 */
public class InterfaceTest2 {
	public static void main(String[] args) {
		// 多态
//		AA bb = new BB();
		BB bb = new BB();
		AA aa = bb;
		bb.output();
		aa.output();
	}
}

interface AA {
	public void output();
}

class BB implements AA{

	@Override
	public void output() {
		System.out.println("BB");
	}
	
}
