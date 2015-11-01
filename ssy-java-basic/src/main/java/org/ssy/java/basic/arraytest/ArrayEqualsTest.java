package org.ssy.java.basic.arraytest;

import java.util.Arrays;

/**
 * @author	Lian
 * @time	2015年10月29日 下午11:02:00
 * @desc	
 */
public class ArrayEqualsTest {
	public static boolean isEquals(int[] a, int[] b) {
		if (a == null || b == null) {
			return false;
		}
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 1, 2, 3 };

		System.out.println(isEquals(a, b));

		System.out.println(Arrays.equals(a, b));
	}
}
