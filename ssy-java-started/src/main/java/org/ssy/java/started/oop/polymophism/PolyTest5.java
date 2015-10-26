package org.ssy.java.started.oop.polymophism;

/**
 * @author	Lian
 * @time	2015年10月27日 上午2:10:54
 * @desc	
 */
public class PolyTest5 {
	public void run(BMW bmw) {
		bmw.run();
	}
	public void run(QQ qq) {
		qq.run();
	}
	
	public void run(Car car) {
		car.run();
	}
	public static void main(String[] args) {
		PolyTest5 pt5 = new PolyTest5();
		BMW bmw = new BMW();
		pt5.run(bmw);
		QQ qq = new QQ();
		pt5.run(qq);
		
		pt5.run(bmw);
		pt5.run(qq);
		
	}
}

class Car {
	public void run() {
		System.out.println("car is running");
	}
}

class BMW extends Car {
	public void run() {
		System.out.println("bmw is running");
	}
}

class QQ extends Car {
	public void run() {
		System.out.println("qq is running");
	}
}
