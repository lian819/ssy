package org.ssy.java.started.oop;

/**
 * @author	Lian
 * @time	2015年10月26日 下午11:33:30
 * @desc	
 */
public class ReferenceTest {
	int a = 4;

	public static void main(String[] args) {
		ReferenceTest rt1 = new ReferenceTest();
		ReferenceTest rt2 = new ReferenceTest();
		// rt2 = rt1;
		rt1.a = 5;

		System.out.println(rt1.a);
		System.out.println(rt2.a);
	}
}
