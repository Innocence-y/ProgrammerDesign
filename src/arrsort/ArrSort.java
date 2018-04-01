package arrsort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:已经排好序的数组插入一个数
 *	题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 *程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
 1、创建两个数组，如果插入的数字比数组最后一个都大，那么插入的数放在新数组最后就可以
 2、如果插入的不是最大，那么和数组前面的数逐一比较，比较到比插入的数大就break
 *  比如第i个符合条件，那么arrB[i-1]=arrA[i-1],arrB[i]=num,arrB[i+1]=arrA[i]
 * @author 闫文强
 * @create 2018-04-01 12:35
 */
public class ArrSort {
	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int[] arrA={3,5,15,36,84,99};
		int[] arrB=new int[arrA.length+1];
		//如果插入的数字比数组最后一个都大，那么插入的数放在新数组最后就可以
		if (num>arrA[arrA.length-1]){
			for (int i = 0; i < arrA.length; i++) {
				arrB[i] = arrA[i];
			}
		arrB[arrB.length-1]=num;
	}
	//如果插入的不是最大，那么和数组前面的数逐一比较，比较到比插入的数大就break
	else {
			for (int i = 0; i <arrA.length ; i++) {
				if (num<arrA[i]){
					for (int j = 0; j < i; j++) {
						arrB[j] = arrA[j];
					}
					arrB[i]=num;
					for (int j = i; j <arrA.length ; j++) {
						arrB[j+1]= arrA[j];
					}
					break;//这个很重要
				}
			}
		}
		System.out.println("插入一个数后的数组为："+ Arrays.toString(arrB));
		scanner.close();
	}
}