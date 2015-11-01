package org.ssy.java.basic.arraytest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午10:29:25
 * @desc	
 */
public class ArrayTest5 {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		int b[][] = new int[2][3];
//		int []c[] = new int[2][3];
		
		// 定义不规则数组
//		int[][] a = new int[3][];
//		a[0] = new int[2];
//		a[1] = new int[3];
//		a[2] = new int[1];
		
//		int[][] a = new int[][3];	// compile error
		
//		int[][] a = new int[]{1,2,3};	// compile error
		
		int[][] a = new int[][]{{1, 2, 3}, {2}, {5, 6, 7, 8}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("*********");
		}
	}
}
