package huiwen;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:回文数
 *	题目：一个5位数，判断它是不是回文数。即12321是回文数，
 *	个位与万位相同，十位与千位相同。
 *  创建一个五位数的数组
 	逐次取位
 	然后判断条件就可以了
 * @author 闫文强
 * @create 2018-04-01 12:16
 */
public class HuiWen {
	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner scanner=new Scanner(System.in);
		int s=scanner.nextInt();
		int arr[] = new int[5];
		int i = 4;
		do {//逐次取位
			arr[i] = s % 10;
			s /= 10;
			i--;
		}while (i >= 0);//这里的结束条件写input！=0也是可以的
		System.out.println(Arrays.toString(arr));
		if (arr[0] == arr[4] && arr[1] == arr[3] ){
			System.out.println("是回文数");
		}else {
			System.out.println("不是回文数");
		}
		scanner.close();
	}
}