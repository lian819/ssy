package org.ssy.java.basic.interfacetest;

/**
 * @author	Lian
 * @time	2015年10月27日 下午10:56:02
 * @desc	可以将interface看成特殊的抽象类, 默认不写abstract
 * 			一个类实现了某个接口, 那么该类必须要实现接口中声明的所有方法. 如果该类是个抽象类, 那么久无需实现接口中的方法
 */
public class InterfaceTest {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.output();
		myClass.output2();
		myClass.output3();
	}
}

class MyParent {
	public void output() {
		System.out.println("extends");
	}
}
interface MyInterface {
	public void output2();
}

interface MyInterface2 {
	public void output3();
}
class MyClass extends MyParent implements MyInterface, MyInterface2 {

	@Override
	public void output2() {
		System.out.println("MyInterface");
	}

	@Override
	public void output3() {
		System.out.println("MyInterface2");
	}
}
