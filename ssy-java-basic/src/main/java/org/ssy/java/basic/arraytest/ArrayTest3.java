package org.ssy.java.basic.arraytest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午10:14:48
 * @desc	
 */
public class ArrayTest3 {
public static void main(String[] args) {
	Student[] s = new Student[100];
	for(int i=0; i<100; i++) {
		s[i] = new Student();
//		if(i%2 == 0) {
//			s[i].name = "zhangsan";
//		} else {
//			s[i].name = "lisi";
//		}
		s[i].name = i%2==0 ? "zhangsan" : "lisi";
	}
	
	for(int i=0; i<s.length; i++) {
		System.out.println(s[i].name);
	}
}
}

class Student {
	String name;

	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}
}