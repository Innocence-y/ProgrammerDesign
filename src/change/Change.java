package change;

import java.util.Scanner;

/**
 * 描述:有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 *
 * @author 闫文强
 * @create 2018-04-01 15:28
 */
public class Change {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] num ={14, 32, 5, 42, 36, 80};
		int[] temp= new int[num.length];
		System.out.println("移动前的数组：");
		for (int i = 0; i <num.length ; i++) {
			temp[i] = num[i];
			System.out.println(num[i]+"");
		}
		System.out.println();

		System.out.println("需要向后移动几个位置");
		int n=scanner.nextInt();
		for (int i = 0; i <num.length ; i++) {
			int t= (i + n)% num.length;
			num[t] = temp[i];
		}

		System.out.println("移动后的数组: ");
		for (int i:num){
			System.out.println(i + " ");
		}
	}
}