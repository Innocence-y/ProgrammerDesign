package prismatic;

/**
 * 描述:输出图形，菱形
 *
 * @author 闫文强
 * @create 2018-04-01 14:20
 */

/**
    *
   ***
  *****
 *******
  *****
   ***
    *
 */
public class Prismatic {
	public static void main(String[] args) {
		//上半部分
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= (6-2*i)/2 ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i +1  ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//下半部分
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < i + 1; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < 5 - 2 * i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}