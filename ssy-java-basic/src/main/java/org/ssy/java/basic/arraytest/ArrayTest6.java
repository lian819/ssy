package org.ssy.java.basic.arraytest;

/**
 * @author	Lian
 * @time	2015年10月29日 下午10:52:40
 * @desc	
 */
public class ArrayTest6 {
	public static void main(String[] args) {
		I[] i = new I[2];
//		i[0] = new I();		// compile error; the Interface I can't be initialized
		i[0] = new C();
		i[1] = new C();
		System.out.println(i.length);
	}
}

interface I {

}

class C implements I {

}
