package org.ssy.java.senior.strategy;

/**
 * @author	Lian
 * @time	2015年11月26日 下午11:34:09
 * @desc	环境角色, 持有一个策略类的引用, 最终给客户端调用
 */
public class Environment {
	private Strategy strategy;

	public Environment(Strategy strategy) {
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public int calculate(int para1, int para2) {
		return strategy.calculate(para1, para2);
	}
}
