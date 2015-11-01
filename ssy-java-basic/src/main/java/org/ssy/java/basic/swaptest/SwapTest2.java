package org.ssy.java.basic.swaptest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午10:45:31
 * @desc	
 */
public class SwapTest2 {
	public static void swap(char[] ch) {
		ch[0] = 'B';
	}

	public static void swap(char[] ch, char c) {
		ch[0] = 'B';
		c = 'D';
	}

	public static void main(String[] args) {
		char[] ch = { 'A', 'C' };
		swap(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		System.out.println("*************************");

		char[] ch2 = { 'A', 'C' };
		char c = 'E';
		swap(ch2, c);
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}
		System.out.println(c);
	}
}
