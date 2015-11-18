package org.ssy.java.basic.collectiontest;

import java.util.HashMap;

/**
 * @author	Lian
 * @time	2015年11月18日 下午11:52:24
 * @desc	映射--键值对
 */
public class MapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		map.put("a", "aaa");

		// System.out.println(map);
		System.out.println(map.get("a"));
		System.out.println(map.get("e"));
	}
}
