package Quit3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 * 题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 * @author 闫文强
 * @create 2018-04-01 15:36
 */
public class Quit3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入总人数：");
		int num=scanner.nextInt();
		boolean[] man= new boolean[num];
		for (int i = 0; i <man.length ; i++) {
			man[i]=true;
		}

		int t=0, len=man.length;
		while (len>1){
			for (int i = 0; i < man.length; i++) {
				if (man[i]){
					t++;
					if (t==3){
						t=0;  //重置
						man[i] = false; //去掉此人
						len--;  //人数减 1
					}
				}
			}
		}

		System.out.println("最后的情况："+ Arrays.toString(man));
		for (int i = 0; i <man.length ; i++) {
			if (man[i]){//最后留下来的人没有被flase
				System.out.println("原来剩下的数："+(i+1));//i + 1 是因为数组从 0 开始
			}
		}
	}
}