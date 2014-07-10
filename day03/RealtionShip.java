/*
@Describe:ReationShip关系运算符
@Date:2014/07/10
@Author:GongBiao
*/

import java.util.Scanner;
public class RealtionShip{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas Enter numberA:");

		int numberA = scan.nextInt();

		System.out.println("Pleas Enter numberB:");
		int numberB = scan.nextInt();
		System.out.println("numberA: " + numberA + "  numberB " + numberB);

		boolean flag;
		flag = numberA > numberB;

		System.out.println("flag:" + flag);
		//交换数据
		if (flag){  
			numberA  = numberA  ^ numberB;
			numberB = numberA ^ numberB;
			numberA = numberA ^ numberB;
		}


		System.out.println("numberA: " + numberA + "  numberB" + numberB);

	}

}