package org.ssy.java.started.flow.control;

/**
 * @author	Lian
 * @time	2015年10月26日 上午2:15:03
 * @desc	while loop
 */
public class WhileTest {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;

		while (a < 100) {
			sum += a;
			a++;
		}

		System.out.println(sum);
	}
}
