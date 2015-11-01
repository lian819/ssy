package org.ssy.java.basic.arraytest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午11:14:55
 * @desc	冒泡排序
 */
public class BubbleSort {
	public static void bubbleSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

			System.out.println("第" + (i+1) + "次排序");
			for(int k=0; k<a.length; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {6, 3, 4, 2, 7};
		bubbleSort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
