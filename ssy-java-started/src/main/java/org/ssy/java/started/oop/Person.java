package org.ssy.java.started.oop;

/**
 * @author	Lian
 * @time	2015年10月26日 上午2:56:45
 * @desc	定义类的属性
 */
public class Person {
	int age = 20;

	public void change(Person person) {
		person = new Person();
		person.age = 30;
	}

	public static void main(String[] args) {
		Person person = new Person();
		int age = person.age;
		System.out.println(age);

		person.change(person);
		int age2 = person.age;
		System.out.println(age2);
	}
}
