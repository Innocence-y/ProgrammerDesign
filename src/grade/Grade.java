package grade;

import java.util.Scanner;

/**
 * 描述:条件嵌套
 *	题目：利用条件运算符的嵌套来完成此题：
 *	学习成绩>=90分的同学用A表示，80-89分之间的用B表示，70-79分之间的用C表示,60-69分之间的用D表示, 60分以下的用E表示。
 *	程序分析：(a>b)?a:b这是条件运算符的基本例子。
 * @author 闫文强
 * @create 2018-04-01 10:30
 */
public class Grade {
	public static void main(String[] args) {
		System.out.println("输入你的分数：");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		String belong = input >= 90 ? "A" : (input >= 80 ? "B" : (input >= 70 ? "C" : (input >= 60 ? "D" : "E")));
		System.out.println(input + "属于" + belong);
		scanner.close();
	}
}