package nixu;

import java.util.Scanner;

/**
 * 描述:逆序
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字
 * 程序分析：创建一个五位数数的数组，把输入数字的每位数的值赋值到数组里面
 * 把输入 数字从个位起获取，并且每获取一次之后/10，这样就能分别获取十位百位千位了
 * 把数字打印出来就是题目所求了
 *
 * @author 闫文强
 * @create 2018-04-01 12:01
 */
public class NiXu {
	public static void main(String[] args) {
		System.out.println("输入一个数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int arr[] = new int[5];
		int i = 0;
		do {
			arr[i] = num % 10;
			num = num / 10;
			i++;
		} while (num != 0);
		System.out.println("输入的字符串是" + i + "位数");
		System.out.println("逆序输出");
		for (int j = 0; j < i; j++) {
			System.out.println(arr[j] + "");
		}
		scanner.close();
	}

}