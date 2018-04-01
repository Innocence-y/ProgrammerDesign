package num;

/**
 * 描述:组成三位数
 *	 题目：有1、2、3、4个数字，
 *	 能组成多少个互不相同且无重复数字的三位数？都是多少？
 * @author 闫文强
 * @create 2018-04-01 14:10
 */
public class Three_digitNum {
	public static void main(String[] args) {
		int num;
		int count = 0;
		for (int i = 0; i <=4 ; i++) {
			for (int j = 0; j <=4 ; j++) {
				if (i!=j){
					for (int k = 0; k <=4 ; k++) {
						if (i!=k && j !=k){
							num = i + j*10 + k*100;
							System.out.println(num);
							count++;
						}
					}
				}
			}
		}
		System.out.println("符合要求的三位数共有"+ count + "个");
	}
}