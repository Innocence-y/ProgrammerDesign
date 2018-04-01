package AvgOfStu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 描述:学生统计
 * 题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，
   况原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
 * @author 闫文强
 * @create 2018-04-01 16:24
 */
public class AvgOfStu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[][] stu=new String[2][6];
		for (int i = 0; i <2 ; i++) {
			System.out.printf("请输入第%d个学生的姓名", i + 1);
			stu[i][0] = in.next();
			for (int j = 2; j < 5; j++) {
				System.out.printf("请输入该同学的第%d门课程成绩", j - 1);
				stu[i][j]=in.next();
			}
		}

		for (int i = 0; i <2 ; i++) {
			int sum=0;
			for (int j = 0; j <5 ; j++) {
				sum+=Integer.parseInt(stu[i][j]);

			}
			stu[i][5] =Float.toString(sum/3);
		}



		try {
			File file=new File("d/study");
			if (file.exists()){
				System.out.println("文件存在");
			}else {
				System.out.println("文件不存在，正在创建......");
				file.createNewFile();
			}

			BufferedWriter output= new BufferedWriter(new FileWriter(file));
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < 6; j++){
					s = stu[i][j] + "\r\t";
					output.write(s);
//                  System.out.print(stu[i][j]);        //被注释的这三行用来格式化输出到控制台（屏幕）
//                  System.out.printf("\t", "");
				}
//              System.out.println();
			}
			output.close();
			System.out.println("数据已写入");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}