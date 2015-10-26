package org.ssy.java.started.flow.control;

/**
 * @author	Lian
 * @time	2015年10月26日 上午2:17:10
 * @desc	for(变量初始化; 条件判断; 步进), 执行过程如下:
 * 			1) 执行变量初始化;
 * 			2) 执行条件判断: 
 * 				如果条件判断为假, 那么退出for循环; 开始执行循环后面的代码;
 * 				如果条件判断为真, 执行for循环里面的代码;
 * 			3) 执行步进;
 * 			4) 重复步骤2. 
 */
public class ForTest {
	public static void main(String[] args) {
		int sum = 0; // 存储相加后的结果
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		int sum2 = 0;
		for (int i = 100; i >= 0; i--) {
			sum2 += i;
		}
		System.out.println(sum2);
	}
}
