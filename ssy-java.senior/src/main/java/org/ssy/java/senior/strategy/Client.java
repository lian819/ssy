package org.ssy.java.senior.strategy;

/**
 * @author	Lian
 * @time	2015年11月26日 下午11:38:22
 * @desc	客户端, 具体执行逻辑算法的类
 */
public class Client {

	public static void main(String[] args) {
		Environment en = new Environment(new AddStrategy());
		System.out.println("add : " + en.calculate(3, 4));

		en.setStrategy(new SubtractStrategy());
		System.out.println("subtract : " + en.calculate(3, 4));

		en.setStrategy(new MultiplyStrategy());
		System.out.println("multiply : " + en.calculate(3, 4));

		en.setStrategy(new DivideStrategy());
		System.out.println("divide : " + en.calculate(3, 4));

	}
}
