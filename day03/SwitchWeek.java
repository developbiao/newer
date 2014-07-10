/*
Switch练习02
*/

import java.util.Scanner;
public class SwitchWeek{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入1-7之间的整数：");
		int week = scan.nextInt();

		switch(week){
			default: System.out.println("回到地球去吧！");
			case 1: System.out.println("星期一");
				break;
			case 2: System.out.println("星期二");
				break;
			case 3: System.out.println("星期三");
				break;
			case 4: System.out.println("星期四");
				return;	//这里break可以用return
			case 5: System.out.println("星期五");
				return;
			case 6: System.out.println("星期六");
				break;
			case 7: System.out.println("星期天");
				return;

		}


	}
}