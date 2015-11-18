package org.ssy.java.basic.collectiontest;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author	Lian
 * @time	2015年11月3日 上午1:33:53
 * @desc	使用Collections进行排序
 */
public class CollectionsTest {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();

		list1.add(new Integer(1));
		list1.add(new Integer(-8));
		list1.add(new Integer(9));
		list1.add(new Integer(20));
		list1.add(new Integer(-40));

		// 倒叙
		Comparator comparator = Collections.reverseOrder();
		Collections.sort(list1, comparator);
		for (Iterator iter = list1.iterator(); iter.hasNext();) {
			Integer value = (Integer) iter.next();
			System.out.print(value + " ");
		}

		System.out.println();

		// 打乱顺序
		Collections.shuffle(list1);
		for (Iterator iter = list1.iterator(); iter.hasNext();) {
			Integer value = (Integer) iter.next();
			System.out.print(value + " ");
		}

		System.out.println();

		// max, min
		System.out.println("minimum vlaue : " + Collections.min(list1));
		System.out.println("maximum vlaue : " + Collections.max(list1));
	}
}
