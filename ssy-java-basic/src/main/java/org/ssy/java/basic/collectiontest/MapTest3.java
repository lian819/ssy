package org.ssy.java.basic.collectiontest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author	Lian
 * @time	2015年11月19日 上午12:12:28
 * @desc	use keySet() method to iterator
 */
public class MapTest3 {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		map.put("e", "ee");

		Set set = map.keySet();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			String value = (String) map.get(key);
			System.out.println(key + "=" + value);

		}
	}
}
