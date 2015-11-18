package org.ssy.java.basic.collectiontest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author	Lian
 * @time	2015年11月19日 上午12:21:06
 * @desc	打印传输参数的名称及出现的次数
 */
public class MapTest4 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		for (int i = 0; i < args.length; i++) {
			// if(map.containsKey(args[i])) {
			// int value = (int) map.get(args[i]);
			// map.put(args[i], ++value);
			// } else {
			// map.put(args[i], 1);
			// }
			if (map.get(args[i]) == null) {
				map.put(args[i], new Integer(1));
			} else {
				Integer in = (Integer) map.get(args[i]);
				in = new Integer(in.intValue() + 1);
				map.put(args[i], in);
			}
		}

		// System.out.println(map);
		Set set = map.keySet();
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			Integer value = (Integer) map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
