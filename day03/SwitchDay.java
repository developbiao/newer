/*
需求：用户输入年、月、日输入出该年的第几用Switch实现天
程序运行示例1:
请输入年(YYYY):1985
请输入月:(MM|MM):3
请输入日：(DD|D):1
1985年3月1号是1985年的第60天
*/

import java.util.Scanner;
public class SwitchDay{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年（yyyy）:");
		int year = scan.nextInt();
		System.out.println("请输入月(MM|M):");
		int month = scan.nextInt();
		System.out.println("请输入日(DD|D)：");
		int day = scan.nextInt();

		int sum = 0;
		sum += day;

		switch(month -1){ //switch的应的场景1
			case 11: sum += 30;
			case 10: sum += 31;
			case 9: sum += 30;
			case 8: sum += 31;
			case 7: sum += 31;
			case 6: sum += 30;
			case 5: sum += 31;
			case 4: sum += 30;
			case 3: sum += 31;
			case 2: sum += 27;
			case 1: sum += 31;

		}

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			if(month > 1){
				sum ++;
			}
		}

		System.out.println(year + "年" + month + "月" + day + "日是" + year +"年的第" + sum + "天");
		System.out.println("距离高考还有" + (158 - sum) + "天");   //一年的158天是高考

	}
}