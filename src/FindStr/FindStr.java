package FindStr;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述:计算字符串中子串出现的次数 (正则表达式)
 * 题目：计算字符串中子串出现的次数
 * 分析：这里是要用正则表达式
 * @author 闫文强
 * @create 2018-04-01 16:10
 */
public class FindStr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = scanner.next();
		System.out.println("请输入要查找的子字符串");
		String substr = scanner.next();
		//一般方法
		int count = 0;
		int start = 0;
		/*while (str.indexOf(substr, start) >= 0 && start < str.length()) {
			count++;
			start = str.indexOf(substr, start) + str.length();
		}*/

		Pattern p=Pattern.compile(substr,Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(str);
		while (m.find()){
			count++;
		}

		System.out.println(substr + "在" + str + "出现的次数为" + count);
	}
}