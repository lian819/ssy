package org.ssy.java.basic.arraytest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午11:38:05
 * @desc	二分查找
 */
public class BinarySerch {
	public static int search(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				return i;
			}
		}
		return -1;
	}

	// 二分查找的条件: 1. 有序
	public static int binarySearch(int[] array, int value) {
		// int length = array.length;
		// int count = length % 2 == 0 ? length / 2 : length / 2 + 1;
		// int medium = array[count];
		// for (int i = 0; i < count; i++) {
		// if (value == medium) {
		// return i;
		// } else {
		// medium = array[count];
		// }
		// }
		//
		// return -1;

		int low = 0;
		int high = array.length - 1;
		int middle;
		while (low <= high) {
			middle = (low + high) / 2;
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i == middle) {
					System.out.print("#");
				}
				System.out.print(" ");
			}
			System.out.println();

			if (array[middle] == value) {
				return middle;
			} else if (value < array[middle]) {
				high = middle - 1;
			} else if (value > array[middle]) {
				low = middle + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 3, 5, 2, 8, 6, 4, 9, 11, 10 };
		int value = 9;
		int index = search(a, value);
		System.out.println(index);

		System.out.println("******************************");

		int[] b = new int[] { 1, 3, 6, 7, 9, 12, 16, 17, 25, 38, 44, 59, 65,
				77, 88, 99, 100 };
		int index2 = binarySearch(b, 99);
		System.out.println(index2);
	}
}
