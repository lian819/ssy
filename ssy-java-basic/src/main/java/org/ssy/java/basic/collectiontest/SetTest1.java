package org.ssy.java.basic.collectiontest;

import java.util.HashSet;

/**
 * @author	Lian
 * @time	2015年11月2日 上午1:30:35
 * @desc	Set里的元素不能重复
 */
public class SetTest1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		System.out.println(set.add("a"));
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set.add("a"));
		
		System.out.println(set);
	}
}
