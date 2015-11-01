package org.ssy.java.basic.arraytest;

import java.util.Random;

/**
 * @author	Lian
 * @time	2015年11月1日 下午9:27:53
 * @desc	练习作业: 随机生成50个数字(整数), 每个数字的范围是[10,]50;, 统计每个数字出现的次数以及出现次数最多的数字及其出现的次数.
 * 			最后将每个数字及其出现次数打印出来, 打印时按照 数字的升序排序
 */
public class HomeWork {
	public static void main(String[] args) {
		int[] count = new int[41]; // 定义10-50对应数字出现的次数
		Random random = new Random();

		for (int i = 0; i < 50; i++) {
			int number = random.nextInt(41) + 10;
			System.out.println(number);
			count[number - 10]++;
		}

		// 打印随机数即对应出现的次数
		for (int i = 0; i < count.length; i++) {
			if (0 == count[i]) {
				continue;
			}

			System.out.println((10 + i) + "出现次数: " + count[i]);
		}

		// 找出出现次数最多的数字
		int max = count[0];
		for (int i = 1; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
			}
		}
		System.out.println("出现的最大次数为: " + max);

		// 打印出现次数最大的数字
		System.out.print("出现次数最多的数字为: ");
		for (int i = 0; i < count.length; i++) {
			if (max == count[i]) {
				System.out.print((i + 10) + " ");
			}
		}
	}
}
