package shuixianhua;

/**
 * 描述:水仙花
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 * @author 闫文强
 * @create 2018-04-01 10:01
 */
public class ShuiXianhua {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 100; i < 1000; i++) {
			int bite =i % 10;//个位
			int ten = i /10 % 10;//十位
			int hundred = i / 100;//百位
			if ((bite*bite*bite+ten*ten*ten+hundred*hundred*hundred)==i){
				System.out.println(i+"");
				sum++;
			}
		}
		System.out.println("总数："+sum);
	}
}