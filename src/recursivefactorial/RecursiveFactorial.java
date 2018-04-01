package recursivefactorial;

import java.util.Scanner;

/**
 * 描述:递归求阶乘
 * 题目：利用递归方法求5!
 * 程序分析：递归公式：f(n)=n*f(n-1)
 * 不断的调用方法，直到最小的值确定
 *
 * @author 闫文强
 * @create 2018-04-01 11:56
 */
public class RecursiveFactorial {
	public static void main(String[] args) {
		System.out.println("输入一个数：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(Fact(n));
	}

	public static int Fact(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i * Fact(i - 1);
		}
	}
}