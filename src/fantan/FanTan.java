package fantan;

import java.util.Scanner;

/**
 * 描述:小球反弹
 * 题目：一球从h米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
 * 程序分析：反弹的高度:(1/2)的n次方*h
 * 经过的距离：这个可以总结得到：第一次落地经过：h,第二次落地经过：h+(h/2)*2,
 * 第三次落地经过：h+(h/2)*2+(h/2/2)*2
 * 那么第n次落地经过：  h+(h/2)*2+(h/2/2)*2 +...+h/(2的n-1次方)*2
 *
 * @author 闫文强
 * @create 2018-04-01 11:23
 */
public class FanTan {
	public static void main(String[] args) {
		System.out.println("请输入小球下落的高度和落地的次数：");
		Scanner scanner = new Scanner(System.in);
		float h = scanner.nextFloat();
		float n = scanner.nextFloat();
		//float h=100,n=3;
		//经过的路径总和
		float sum = h;
		h /= 2;//第一次下落是在最高点，sum中不会有两倍的h，所以写在外面，循环从第二次开始
		for (int i = 2; i <= n; i++) {
			//经过的距离的总和
			sum += h * 2;
			//第N次反弹的高度为
			h /= 2;
		}
		System.out.println("在" + 100 + "米，经过" + n + "次后，能反弹：" + h + "米，经过的距离：" + sum);
		scanner.close();
	}
}