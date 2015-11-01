package org.ssy.java.basic.stringtest;

/**
 * @author	Lian
 * @time	2015年10月29日 上午12:52:49
 * @desc	
 */
public class StringTest2 {
	public static void main(String[] args) {
		System.out.println("----------------");

		String str = new String("aaa");
		String str2 = new String("aaa");
		System.out.println(str.equals(str2));

		System.out.println("----------------");

		String str3 = "bbb";
		String str4 = "bbb";
		System.out.println(str3.equals(str4));

		System.out.println("----------------");

		Object object = new Object();
		Object object2 = new Object();
		System.out.println(object.equals(object2));
		System.out.println(object.equals(object));

		System.out.println("----------------");

		String str5 = new String("ccc");
		String str6 = "ccc";
		System.out.println(str5.equals(str6));

		System.out.println("----------------");

		String s = "hello";
		String s1 = "hel";
		String s2 = "lo";
		System.out.println(s == s1 + s2);

		System.out.println("----------------");

		System.out.println(s == "hel" + "lo");
	}
}
