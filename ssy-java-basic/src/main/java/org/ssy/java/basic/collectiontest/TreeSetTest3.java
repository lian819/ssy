package org.ssy.java.basic.collectiontest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author	Lian
 * @time	2015年11月3日 上午1:07:58
 * @desc	
 */
public class TreeSetTest3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MyComparator());

		set.add("d");
		set.add("c");
		set.add("A");
		set.add("e");
		set.add("f");
		set.add("b");

		for (Iterator iter = set.iterator(); iter.hasNext();) {
			String value = (String) iter.next();
			System.out.println(value);
		}
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;

		return s2.compareTo(s1);
	}

}