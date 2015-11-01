package org.ssy.java.basic.stringtest;

/**
 * @author	Lian
 * @time	2015年10月29日 上午1:35:53
 * @desc	String实例是个长量, 被创建后不可更改
 */
public class StringTest3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = " world";
		String s3 = s1 + s2;

		System.out.println(s3);
	}
}
