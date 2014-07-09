/*
@Describe:用户输入一个三位正整数，程序取出个位、十位和百位上的数，对它们求和
*/

import java.util.Scanner;
public class ArithWork{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个三位数的整数：");

		int num = scan.nextInt();

		//取出num百位上的数
		 int a = num / 100 % 10;

		//取出num十位上的数
		 int b = num / 10 % 10;

		//取出个位上的数
		int c = num % 10;

		System.out.println("百位：" + a);
		System.out.println("十位：" + b);
		System.out.println("个位：" + c);


	}	
}