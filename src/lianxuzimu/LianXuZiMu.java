package lianxuzimu;

import java.util.Scanner;

/**
 * 描述:求和
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；
 * 程序分析：关键是计算出每一项的值。
 * 比如获取的数字为：a，出现的项数为：n
 * 总结一下，可以得到一下规律：
 * 1、第一项有一个a,最后一项有n个a
 * 2、 第1和第2项相差2*10，第2和第三项相差2*100，第k和第k+1项相差2*（10的k次方）
 *
 * @author 闫文强
 * @create 2018-04-01 10:58
 */
public class LianXuZiMu {
	public static void main(String[] args) {
		int n = 0, a = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入a的值：");
		a = scanner.nextInt();
		System.out.println("请输入n的值：");
		n = scanner.nextInt();
		int[] arr = new int[n];
		int i = 1;
		arr[0] = a;
		//把每一项的值赋值给数组里面的数
		while (i < n) {
			a = a * 10;
			arr[i] = a + arr[i - 1];
			i++;
		}
		//求和
		int sum = 0;
		for (int s : arr) {
			sum += s;
			if (s == arr[n - 1]) {
				System.out.println(s);
				break;//最后一次只输出结果
			}
			System.out.println(s + "+");
		}
		System.out.println("=" + sum);
	}
}