package SumOfOddEven;

import java.util.Scanner;

/**
 * 描述:编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
 * 题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
 * @author 闫文强
 * @create 2018-04-01 15:44
 */
public class SumOfOddEven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n= scanner.nextInt();
		if (n %2==0){
			System.out.println("1/2 + 1/4 + ... + 1/n = "+evenSum(n));
		}else
			System.out.println("1 + 1/3 + ... + 1/n = "+oddSum(n));
	}

	public static float oddSum(int n){
		float sum =0.0f;
		for (float i = 1.0f; i <=n; ) {
			sum+=1/i;
			i+=2;
		}
		return sum;
	}

	public static float evenSum(int n){
		float sum= 0.0f;
		for (float i =2.0f ; i<=n;) {
			sum +=1/i;
			i+=2;
		}
		return sum;
	}
}