package org.ssy.java.basic.collectiontest;

import java.util.ArrayList;

/**
 * @author	Lian
 * @time	2015年11月2日 上午12:03:29
 * @desc	
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));

		Object[] in = list.toArray();
		for (int i = 0; i < in.length; i++) {
			System.out.println(((Integer) in[i]).intValue());
		}
	}
}
