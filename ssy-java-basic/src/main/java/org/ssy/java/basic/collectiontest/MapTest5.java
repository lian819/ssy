package org.ssy.java.basic.collectiontest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author	Lian
 * @time	2015年11月19日 上午12:47:14
 * @desc	ues Map.Entry to iterator the map
 */
public class MapTest5 {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "dd");
		map.put("d", "dd");
		map.put("e", "ee");

		Set set = map.entrySet();
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			Map.Entry entry = (Entry) iter.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + ":" + value);
		}
	}
}
