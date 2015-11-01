package org.ssy.java.basic.collectiontest;

import java.util.LinkedList;

/**
 * @author	Lian
 * @time	2015年11月2日 上午12:35:37
 * @desc	
 */
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("F");
		list.add("E");
		list.add("D");
		list.add("C");
		list.add("B");
		
		list.addLast("A");
		list.addFirst("G");
		list.add(1, "F2");
		
		System.out.println("最初的集合: " + list);
		
		list.remove("F");
		list.remove(2);
		
		System.out.println("变化之后的集合: " + list);
		
		Object value = list.get(2);
		list.set(2, (String)value + "changed");
		System.out.println("最后的集合: " + list);
	}
}
