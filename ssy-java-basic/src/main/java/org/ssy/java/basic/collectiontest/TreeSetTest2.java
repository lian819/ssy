package org.ssy.java.basic.collectiontest;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author	Lian
 * @time	2015年11月3日 上午12:52:15
 * @desc	以分数倒叙显示
 */
public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MyComparator2());

		Person p1 = new Person(10);
		Person p2 = new Person(20);
		Person p3 = new Person(30);
		Person p4 = new Person(40);

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		System.out.println(set);
	}
}

class Person {
	int score;

	public Person(int score) {
		this.score = score;
	}

	public String toString() {
		return String.valueOf(this.score);
	}
}

class MyComparator2 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		return p2.score - p1.score;
	}
}
