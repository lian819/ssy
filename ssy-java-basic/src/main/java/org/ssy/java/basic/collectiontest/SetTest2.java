package org.ssy.java.basic.collectiontest;

import java.util.HashSet;

/**
 * @author	Lian
 * @time	2015年11月2日 上午1:33:02
 * @desc	
 */
public class SetTest2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

//		set.add(new People("zhangsan"));
//		set.add(new People("lisi"));
//		set.add(new People("zhangsan"));
		
//		People p1 = new People("zhangsan");
//		set.add(p1);
//		set.add(p1);
		
		String str1 = new String("a");
		String str2 = new String("a");
		set.add(str1);
		set.add(str2);
		
		System.out.println(set);
	}
}

class People {
	String name;

	public People(String name) {
		this.name = name;
	}
}
