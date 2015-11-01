package org.ssy.java.basic.arraytest;

import java.util.Arrays;


/**
 * @author	Lian
 * @time	2015年10月29日 下午11:08:50
 * @desc	数组copy
 */
public class ArrayCopy {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4 };
		int[] b = null;

		b = Arrays.copyOf(a, a.length);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println("************************");

		int[] c = new int[a.length];

		System.arraycopy(a, 0, c, 0, a.length);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
