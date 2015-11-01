package org.ssy.java.basic.collectiontest;

import java.util.ArrayList;

/**
 * @author	Lian
 * @time	2015年11月1日 下午11:58:46
 * @desc	
 */
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("hello");
		list.add(new Integer(2));

		String str = (String) list.get(0);
		Integer in = (Integer) list.get(1);

		System.out.println(str);
		System.out.println(in);
	}
}
