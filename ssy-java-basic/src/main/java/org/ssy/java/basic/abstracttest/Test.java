package org.ssy.java.basic.abstracttest;

/**
 * @author	Lian
 * @time	2015年10月27日 上午2:22:39
 * @desc	抽象类不能被实例化
 * 			抽象方法有声明, 无实现. 抽象方法需要定义在抽象类中
 * 			如果一个类包含了抽象方法, 这个类 一定是抽象类
 * 			如果某各类是抽象类, 那么该类可以包含具体方法(有声明, 有实现)
 * 			在子类继承父类(抽象类), 那么该子类必须实现父类所有的抽象方法, 否则该子类必须声明为抽象类
 */
public class Test {
	public static void main(String[] args) {
		// T t = new T();
	}
}

abstract class T {
	public abstract void method();

	public void test() {
		System.out.println("test");
	}
}

abstract class R extends T {

	// @Override
	// public void method() {
	// // TODO Auto-generated method stub
	//
	// }

}