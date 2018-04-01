package stringsort;

/**
 * 描述:字符串排序
 * 题目：字符串排序。
 * 这里要用一个封装的方法：boolean b=string1.compareTo(string2);
 * @author 闫文强
 * @create 2018-04-01 13:58
 */
public class StringSort {
	public static void main(String[] args) {
		String[] str = {"a","b","h","k","y"};
		for (int i = str.length-1; i >=1 ; i--) {
			for (int j = 0; j < i-1; j++) {
				if (str[j].compareTo(str[j+1])<0){
					String temp=str[j];
					str[j]= str[j+1];
					str[j+1] = temp;
				}
			}
		}
		for (String subStr:str) {
			System.out.println(subStr+" ");
		}
	}
}