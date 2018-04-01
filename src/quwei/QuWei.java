package quwei;

import java.util.Scanner;

/**
 * 描述:取数的位
 * 题目：取一个整数a从右端开始的4～7位。
 * @author 闫文强
 * @create 2018-04-01 13:29
 */
public class QuWei {
	public static void main(String[] args) {
		System.out.println("输入一个整数：");
		Scanner scanner=new Scanner(System.in);
		long num=scanner.nextLong();//获取输入
		String str=Long.toString(num);
		char[] chars=str.toCharArray();
		int n = chars.length;
		System.out.println(n);
		System.out.println(chars[n-7]);
		System.out.println("该整数从右端开始的4-7位为："+chars[n-7]+chars[n-6]+chars[n-5]+chars[n-4]);
		scanner.close();
	}

}