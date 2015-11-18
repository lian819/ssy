package org.ssy.java.basic.collectiontest;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author	Lian
 * @time	2015年11月3日 上午12:44:03
 * @desc	
 */
public class IteratorTest {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");

		// Iterator iterator = set.iterator();
		// while(iterator.hasNext()) {
		// System.out.println(iterator.next());
		// }

		for (Iterator iter = set.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
	}
}
