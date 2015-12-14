package org.ssy.java.basic.collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author	Lian
 * @time	2015年11月26日 下午10:07:32
 * @desc	不使用Array实现上次的作业
 */
public class Homework1 {
	public static void main(String[] args) {
		/**
		 * get 50 random numbers, and put them to TreeMap(key is the number,
		 * value is time of the key disappear)
		 */
		Map map = new TreeMap();
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			int number = random.nextInt(40) + 10;
			Integer in = new Integer(number);
			if (map.get(in) == null) {
				map.put(in, new Integer(1));
			} else {
				int value = ((Integer) map.get(in)).intValue();
				map.put(in, new Integer(value + 1));
			}
		}

		// get the time of highest disappear number
		Collection col = map.values();
		Integer maxTime = (Integer) Collections.max(col);
		List list = new ArrayList();

		// loop to output the number and time, and output the values of the
		// maxTime
		Set entrySet = map.entrySet();
		for (Iterator iter = entrySet.iterator(); iter.hasNext();) {
			Map.Entry entry = (Entry) iter.next();
			Integer key = (Integer) entry.getKey();
			Integer value = (Integer) entry.getValue();
			System.out.println("number is : " + key + ", time is : " + value);
			if (value.intValue() == maxTime.intValue()) {
				list.add(key);
			}
		}

		System.out.println("**************************");
		System.out.println("the max_time is : " + maxTime);
		System.out.println("**************************");

		// show the number of max_time
		System.out.print("the numbers is : ");
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Integer number = (Integer) iter.next();
			System.out.print(number + "\t");
		}
	}
}
