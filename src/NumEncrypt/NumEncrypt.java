package NumEncrypt;

import java.util.Scanner;

/**
 * 描述:数字加密
 * 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用
   和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 分析：拆数字，每位数字加上 5 的和除以 10 的余数替换该数
 * @author 闫文强
 * @create 2018-04-01 16:01
 */
public class NumEncrypt {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个四位整数");
		int num=scanner.nextInt();
		System.out.println("加密后的数据为："+encrypt(num));
	}

	private static int encrypt(int num){
		int a,b,c,d;     //从左到右分别为第一到第四位
		//分解
		a =num/1000;
		b =(num/100)%10;
		c =(num/10)%10;
		d =num%10;
		//取余
		a = (a + 5)%10;
		b = (b + 5)%10;
		c = (c + 5)%10;
		d = (d + 5)%10;
		//交换
		num = d*1000 + c*100 +b*10 + a;
		return num;
	}

}