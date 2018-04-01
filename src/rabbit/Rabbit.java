package rabbit;

import java.util.Scanner;

/**
 * 描述:菲波那切数列
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后
 * 每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 * 本题有：a[n]=a[n-1]+a[n-1],而第一第二项都知道了，后面的值也可以求得
 * @author 闫文强
 * @create 2018-04-01 9:47
 */
public class Rabbit {
	public static void main(String[] args) {
		System.out.println("输入月份");
		Scanner scanner=new Scanner(System.in);
		int n =scanner.nextInt();
		System.out.println("第"+n+"个月兔子总数为"+fun(n));
	}

	public static int fun(int n){
		if (n==1 || n==2){
			return 1;
		}else {
			return fun(n-1) + fun(n-2);
		}
	}
}