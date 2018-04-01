package SortTest;

import java.util.Random;

/**
 * 描述:排序测试
 *
 * @author 闫文强
 * @create 2018-04-01 14:36
 */
public class SortTest {

	/**
	 * 冒泡排序是排序里面最简单的了，但性能也最差，数量小的时候还可以，数量一多，是非常慢的。
	 它的时间复杂度是O（n*n），空间复杂度是O（1）
	 * @param arr
	 */
	public static void bubblesort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr.length-1-i ; j++) {
				if (arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	/**
	 * 选择排序（最慢）
	 选择排序的时间复杂度还有空间复杂度跟冒泡是一样的。
	 */

	public static void selectSort(int[] arr){
		for (int i = 0; i <arr.length ; i++) {
			for (int j = i+1; j <arr.length ; j++) {
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	/**
	 * 插入排序
	 插入排序的时间复杂度也是O(n*n)，空间复杂度也是O(1)。
	 */

	public static void insertSort(int[] arr){
		for (int i = 0; i <arr.length ; i++) {
			for (int j = 0; j <i ; j++) {
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	/**
	 * 快速排序（最快）
	 快速排序通常情况下是最快的
	 平均时间复杂度是 O(NlogN)，最差也是O(N*N)，空间复杂度O(NlogN)
	 */

	/**
	 * 不过快速排序也是付出了内存空间的代价，
	 * 如果数据量过大，会出现StackOverFlow栈溢出异常
	 * @param arr
	 * @param head
	 * @param tail
	 */

	public static void quickSort(int[] arr,int head, int tail){
		int i=head,j=tail;
		if (i > j){
			return;
		}
		int key= arr[i];
		while (i<j) {
			while(i<j && key<=arr[j]){
				j--;
			}
			if(i<j){
				arr[i++]=arr[j];
			}
			while(i<j && key>=arr[i]){
				i++;
			}
			if(i<j){
				arr[j--]=arr[i];
			}
		}
		arr[j]=key;
		quickSort(arr, head, j-1);
		quickSort(arr, j+1, tail);
	}

	//性能测试
	public static int[] getArr(){
		int arr[] =new int[50000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(arr.length)+1;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr1[]=getArr();
		int arr2[]=getArr();
		int arr3[]=getArr();
		int arr4[]=getArr();

		long s1=System.currentTimeMillis();
		bubblesort(arr1);
		long e1=System.currentTimeMillis();
		System.out.println("bubbleSort: "+(e1-s1)+"毫秒");

		long s2=System.currentTimeMillis();
		selectSort(arr2);
		long e2=System.currentTimeMillis();
		System.out.println("selectSort: "+(e2-s2)+"毫秒");

		long s3=System.currentTimeMillis();
		insertSort(arr3);
		long e3=System.currentTimeMillis();
		System.out.println("insertSort: "+(e3-s3)+"毫秒");

		long s4=System.currentTimeMillis();
		quickSort(arr4,0,arr4.length-1);
		long e4=System.currentTimeMillis();
		System.out.println("quickSort: "+(e4-s4)+"毫秒");
	}
}