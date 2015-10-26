package org.ssy.java.started.primitive;

/**
 * @author	Lian
 * @time	2015年10月26日 上午12:01:55
 * @desc	java中的原生数据类型共有8种:
 * 			1) 字节型: 使用byte表示.		8位
 * 			2) 短整型: 使用short表示.	16位
 * 			3) 整型:   使用int表示.		32位
 * 			4) 长整型: 使用long表示.		64位
 * 			5) 单精度浮点型: 使用float表示.	所谓浮点型, 指的就是小数, 也叫作实数, 比如1.2
 * 			6) 双精度浮点型: 使用double表示. 双精度浮点型表示的数据范围要比单精度浮点型大
 * 			7) 字符型: 使用char表示. 所谓字符, 就是单个的字符表示, 比如字母'a', 或者中午'张'. 外面用单引号包围上.
 * 			8) 布尔型: 使用boolean表示. 布尔类型只有两种可能值, 分别是true与false
 */
public class Variables {
	public static void main(String[] args) {
		// bit 位. 只有0或1

		// byte 字节 8位 数据范围 -128~127
		System.out.println("Max value of Byte : " + Byte.MAX_VALUE);
		System.out.println("Min value of Byte : " + Byte.MIN_VALUE);

		// short 短整型 16位 数据范围 -32768~32767
		System.out.println("\nMax value of Short : " + Short.MAX_VALUE);
		System.out.println("Min value of Short : " + Short.MIN_VALUE);

		// int 整型 32位 数据范围 -2147483648~2147483647
		System.out.println("\nMax value of Integer : " + Integer.MAX_VALUE);
		System.out.println("Min value of Integer : " + Integer.MIN_VALUE);

		// long 长整型 64位 数据范围 -9223372036854775808~ 9223372036854775807
		System.out.println("\nMax value of Long : " + Long.MAX_VALUE);
		System.out.println("Min value of Long : " + Long.MIN_VALUE);
		
		// float 单精度浮点型. 赋值时需要在最后加上f
		System.out.println("\nMax value of Float : " + Float.MAX_VALUE);
		System.out.println("Min value of Float : " + Float.MIN_VALUE);
		float f = 1.2f;
		
		// double 双精度浮点型. 所有浮点类型默认为double
		System.out.println("\nMax value of Double : " + Double.MAX_VALUE);
		System.out.println("Min value of Double : " + Double.MIN_VALUE);
		double d = 1.2;
		System.out.println(d);
		
		// char	字符型
		char a = '张';
		char b = 'B';
		System.out.println(a);
		System.out.println(b);
		
		// boolean	布尔型. 只有true或false两种值
		System.out.println("\nTrue of Boolean: " + Boolean.TRUE);
		System.out.println("False of Boolean: " + Boolean.FALSE);
	}
}
