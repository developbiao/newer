/*
@Describe:输入两个数第1种方法
*/

import java.util.Scanner;

public class Variable05{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int numA = scan.nextInt();
		System.out.println("请输入二个整数：");
		int numB = scan.nextInt();

		//交换数据

		int  numC = numA;
		numA = numB;
		numB = numC;

		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);

	}
}