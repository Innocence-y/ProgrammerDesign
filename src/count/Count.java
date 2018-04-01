package count;

import java.util.Scanner;

/**
 * 描述:计数
 * 题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
 *  程序分析：

 这里的需要的知识点:

 1、获取一行字符串，nextLine（）

 2、把字符串的每一个字符赋值到一个数值中

 3、对比每一个数值在ASK码的范围，就可以确定它符号的类别

 4、char字符ASK码的范围

 （1）数字0到9： 48~57

 （2）字母A到Z：65到90 a到z：97到122

 （3）空格是32
 * @author 闫文强
 * @create 2018-04-01 9:36
 */
public class Count {
	public static void main(String[] args) {
		int num = 0;
		int letter = 0;
		int space = 0;
		int others = 0;
		System.out.println("请输入一串字符");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		char[] arr=string.toCharArray();
		for (int i = 0; i <arr.length ; i++) {
			if (arr[i]>=48&&arr[i]<=57){
				num++;
			}else if ((arr[i]>=65&&arr[i]<=90)||(arr[i]>=97&&arr[i]<=122)){
				letter++;
			}else if (arr[i] == 32){
				space++;
			}else {
				others++;
			}
		}
		System.out.println("数字："+num+ " ,字母:" +letter+",  空格" + space+" , 其他" + others + ".");
		scanner.close();
	}
}