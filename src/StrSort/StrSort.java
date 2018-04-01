package StrSort;

import java.util.Arrays;

/**
 * 描述:字符串排序。
 * 主要是字符串的比较，第一个相同，比第二个......（原来数组中有 sort 方法）
 * @author 闫文强
 * @create 2018-04-01 15:55
 */
public class StrSort {
	public static void main(String[] args) {
		String[] strings={"abfds1", "advesd2", "dasfdsa3", "cdsaew1", "abbdsa2", "abbdsa"};
		//直接用了 java 里有的 sort 方法
		Arrays.sort(strings);
		for (String str:strings){
			System.out.println(str);
		}

	}
}