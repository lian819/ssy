package org.ssy.java.basic.collectiontest;

import java.util.TreeSet;

/**
 * @author	Lian
 * @time	2015年11月3日 上午12:50:24
 * @desc	有序的set
 */
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		set.add("a");
		set.add("e");
		set.add("d");
		set.add("c");
		set.add("f");

		System.out.println(set);
	}
}
