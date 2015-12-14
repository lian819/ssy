package org.ssy.java.senior.strategy;

/**
 * @author	Lian
 * @time	2015年11月26日 下午11:28:25
 * @desc	策略类的具体实现类, 完成减法运算
 * 			the specific implement class of strategy class, complete substract function
 */
public class MultiplyStrategy implements Strategy {

	@Override
	public int calculate(int para1, int para2) {
		return para1 - para2;
	}

}
