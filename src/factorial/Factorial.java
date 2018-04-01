package factorial;

/**
 * 描述:阶乘
 *
 * @author 闫文强
 * @create 2018-04-01 11:34
 */
public class Factorial {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += factorial(i);
		}
		System.out.println("" + sum);
	}

	public static int factorial(int i) {
		int mult = 1;
		for (int j = 1; j <= i; j++) {
			mult *= j;
		}
		return mult;
	}
}