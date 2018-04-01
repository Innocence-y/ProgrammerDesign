package yanghuisanjiao;

/**
 * 描述:杨辉三角
 * 题目：打印出杨辉三角形
 * 程序分析：
 * 	1、二维数组的使用
 	2、第一列的数都是1
 	3、使用两个for循环，i控制行，j控制列；
 * @author 闫文强
 * @create 2018-04-01 13:38
 */
public class YangHuiSanJiao {
	public static void main(String[] args) {
		int[][] arr=new int[10][10];
		for (int i = 0; i <arr.length ; i++) {
			arr[i][0] = 1;//控制第一列的数等于1
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length ; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];//赋值
			}
		}

		//打印结果
		for (int i = 0; i <arr.length ; i++) {
			for (int k = arr.length-1; k >0; k--) {//空格的控制，为了好看
				System.out.print(" ");
			}
			for (int j = 0; j <arr.length ; j++) {//打印出数组的数字
				if (arr[i][j]!=0){//把没赋值的零去掉
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();//控制换行
		}
	}
}