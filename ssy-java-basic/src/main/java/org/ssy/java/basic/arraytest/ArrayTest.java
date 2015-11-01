package org.ssy.java.basic.arraytest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午9:24:30
 * @desc	数组: 相同类型数据的集合.
 * 			定义数组: 
 * 				* type[] arr = new type[num];
 * 				* type arr[] = new type[]; 
 * 				* type[] arr = {...};
 * 				* type[] arr = new type[]{...};
 */
public class ArrayTest {
	public static void main(String[] args) {
//		int[] a = new int[4];	// 定义int型数组a. 长度为4
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		System.out.println(a[3]);

//		int a[] = new int[2];
//		a[0] = 1;
//		a[1] = 2;
//		System.out.println(a[1]);
		
//		int[] a = {1, 2, 3, 4};
//		System.out.println(a[2]);

//		int[] b = new int[]{1, 2, 4};
//		System.out.println(b[1]);
		
//		int[] a = new int[100];
//		for(int i=0; i<a.length; i++) {
//			a[i] = i + 1;
//		}
//		System.out.println(0);
//		System.out.println(a[98]);

//		a.length = 20;		// 数组的长度不能更改

//		int[] a = new int[4];
//		System.out.println(a[0]);
//		boolean[] b = new boolean[3];
//		System.out.println(b[2]);
		
		// 数组中的数据是连续存放的.
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};
		System.out.println(a.equals(b));

	}
}
