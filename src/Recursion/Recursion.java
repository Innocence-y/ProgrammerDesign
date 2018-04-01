package Recursion;

import java.util.Scanner;

/**
 * 描述:求1+2!+3!+...+20!的和。
 * 题目：求1+2!+3!+...+20!的和。
 * @author 闫文强
 * @create 2018-04-01 15:05
 */
public class Recursion {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("你想计算到哪个数的阶乘的和：");
		int num= scanner.nextInt();
		long temp= 0L;
		long sum= 0L;
		for (int i = 1; i <=num ; i++) {
			temp = recursion(i);
			sum += temp;
		}
		System.out.println("计算到"+num+"的阶乘的和是"+sum);
	}

	//计算某个数 num 的阶乘
	public static long recursion(int num){
		if (num>1){
			return num * recursion(num- 1);
		}else {
			return 1;
		}
	}
}