package org.ssy.java.basic.stringtest;

/**
 * @author	Lian
 * @time	2015年10月29日 上午1:22:04
 * @desc	
 */
public class EqualsTest {
	public static void main(String[] args) {
		Student stu1 = new Student("zhangsan");
		Student stu2 = new Student("zhangsan");

		System.out.println(stu1 == stu2);
		System.out.println(stu1.equals(stu2));
	}
}

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	// 模仿String.equals()方法
	@Override
	public boolean equals(Object anObject) {
		if(this == anObject) {
			return true;
		}
		if(anObject instanceof Student) {
			Student stu = (Student)anObject;
			if(this.name.equals(stu.name)) {
				return true;
			}
		}
		return false;
	}
}
