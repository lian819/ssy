package org.ssy.java.basic.arraytest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午10:20:49
 * @desc	二维数组
 */
public class ArrayTest4 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
//		System.out.println(i instanceof Object);
//		System.out.println(i[0] instanceof Object);
//		System.out.println(i[0] instanceof int[]);
		
		int b = 2;
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = b;
				b += 2;
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
