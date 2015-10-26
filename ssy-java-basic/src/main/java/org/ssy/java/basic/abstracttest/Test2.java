package org.ssy.java.basic.abstracttest;

/**
 * @author	Lian
 * @time	2015年10月27日 上午2:37:01
 * @desc	
 */
public class Test2 {
	public static void main(String[] args) {
		Shap t = new Traingel(10, 20);
		System.out.println(t.computeArea());

		Shap r = new Rectangel(10, 20);
		System.out.println(r.computeArea());
	}
}

abstract class Shap {
	// 计算图形面积
	public abstract int computeArea();
}

class Traingel extends Shap{
	int width;
	int height;

	public Traingel(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int computeArea() {
		return this.width * this.height / 2;
	}

}

class Rectangel extends Shap {
	int width;
	int height;

	public Rectangel(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int computeArea() {
		return this.width * this.height;
	}

}
