package MatrixSum;

import java.util.Scanner;

/**
 * 描述:求一个3*3矩阵对角线元素之和
 * 题目：求一个3*3矩阵对角线元素之和
 * 分析：用二维数组
 * @author 闫文强
 * @create 2018-04-01 15:14
 */
public class MatrixSum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[][] mat = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3 ; j++) {
				System.out.println("请输入第"+i+"行第"+j+"列的整数");
				mat[i][j]=scanner.nextInt();
			}
		}

		//显示数据
		for (int i = 0; i <3 ; i++) {
			for (int j = 0; j <3 ; j++) {
				System.out.println(mat[i][j]);
				System.out.println();
			}
		}

		//计算对角线元素之和

		int sum1 = mat[0][0] + mat[1][1] + mat[2][2];
		int sum2 = mat[2][0] + mat[1][1] + mat[0][2];
		System.out.println("主对角线上元素和为 " + sum1);
		System.out.println("副对角线上元素和为 " + sum2);
	}
}