package sushu100;

/**
 * 描述:100以内素数
 * 题目：求100之内的素数
 * 素数的判断方法：这个数除以2到比它本身少1的数都不能整除，那么这个数就是素数了！
 * @author 闫文强
 * @create 2018-04-01 12:25
 */
public class SuShu {
	public static void main(String[] args) {
		int sum= 0;
		for (int i = 2; i < 100 ; i++) {
			if (isRight(i)){
				System.out.print(i+",");
				sum ++;
			}
		}
		System.out.println("一共有素数"+sum+"个");
	}
	//判断该数是不是素数
	public static boolean isRight(int i){
		for (int j = 2; j <= Math.sqrt(i) ; j++) {
			if (i % j == 0){
				//不是素数的话，马上返回false
				return false;
			}
		}
		return true;
	}
}