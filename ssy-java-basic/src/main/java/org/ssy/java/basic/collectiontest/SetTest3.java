package org.ssy.java.basic.collectiontest;

import java.util.HashSet;

/**
 * @author	Lian
 * @time	2015年11月3日 上午12:21:55
 * @desc	
 */
public class SetTest3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		Student stu1 = new Student("zhangsan");
		Student stu2 = new Student("zhangsan");

		set.add(stu1);
		set.add(stu2);

		System.out.println(set);
	}
}

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	public int hashCode() {
		return this.name.hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (null != obj && obj instanceof Student) {
			Student s = (Student) obj;
			if (name.equals(s.name)) {
				return true;
			}
		}
		return false;
	}
}
