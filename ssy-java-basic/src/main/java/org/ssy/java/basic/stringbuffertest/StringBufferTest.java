package org.ssy.java.basic.stringbuffertest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午9:12:22
 * @desc	StringBuffer指向引用的内容可以改变
 */
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
//		buffer.append("hello");
//		buffer.append(" world");
//		buffer.append(" welcome");
		buffer.append("hello").append(" world").append(" welcom").append(100).append(false);
		String result = buffer.toString();
		System.out.println(buffer);
		System.out.println(buffer.toString());
		System.out.println(result);
		
		System.out.println("---------------------------------");

		String s = "a";
		int a =100;
		boolean b = true;
		String str = s + a +b;
		System.out.println(str);
		
		System.out.println("---------------------------------");
		
		System.out.println(100 + 200);
		System.out.println("100" + 200);
		
		System.out.println("---------------------------------");
		
//		System.out.println(true + false);	// compile errro
		System.out.println("true" + false);
	}
}
