package arrreverse;

import java.util.Arrays;

/**
 * 描述:数组逆序输出
 *	题目：将一个数组逆序输出。
 *  程序分析：用第一个与最后一个交换。
 * @author 闫文强
 * @create 2018-04-01 13:07
 */
public class ArrReverse {
	/**
	 * 错误写法
	 * @param args
	 */
	/*public static void main(String[] args) {
		int[] arrA = {1,3,44,22,77,99};
		int n=arrA.length;
		int[] arrB= new int[n];
		System.out.println(n);
		for (int i = 0; i < n ; i++) {
			arrB[i] = arrA[n-1];
			n--;
		}
		System.out.println("数组A的逆序输出为："+ Arrays.toString(arrB));

	}*/

	/**
	 * 错误写法
	 * @param args
	 */
	/*public static void main(String[] args) {
		int[] arrA = {1,3,44,22,77,99};
		int[] arrB= new int[arrA.length];
		int n=arrA.length;
		System.out.println(n);
		for (int i = 0; i < n ; i++) {
			arrB[i] = arrA[n-1];
			n--;
		}
		System.out.println("数组A的逆序输出为："+ Arrays.toString(arrB));

	}*/


	/**
	 * 正确写法
	 * @param args
	 */
	public static void main(String[] args) {
		int[]arrA = {1,3,44,22,77,99};
		int[]arrB = new int[arrA.length];
		int n = arrA.length;
		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[n-1];
			n--;
			System.out.println(arrA.length);
			System.out.println(n);
		}
		System.out.println("数组A逆序输出为："+ Arrays.toString(arrB));
	}

}