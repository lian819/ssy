package org.ssy.java.basic.collectiontest;

import java.util.HashMap;

/**
 * @author	Lian
 * @time	2015年11月19日 上午12:06:41
 * @desc	
 */
public class MapTest2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		String str = new String("zhangsan");

		map.put("a", str);
		map.put("b", str);

		System.out.println(map);
	}
}
