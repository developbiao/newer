/*
    流程控制语句之switch-case
     语法：
         switch(表达式){
              case 值1:
		代码块1
		break;
              case 值2:
		代码块2
		break;
              case 值n:
		代码块n
		break;
              [default:
		代码块]
         }
         表达式能出现的数据类型：char int short byte long boolean?
*/
import java.util.Scanner;
public class SwitchCaseStruct {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入1-7之间的整数:");
        int day = sc.nextInt();
        switch(day){
	case 1:
		System.out.println("星期一");
		break;
	case 2:
		System.out.println("星期二");
		break;

	case 3:
		System.out.println("星期三");
		break;

	case 4:
		System.out.println("星期四");
		break;

	case 5:
		System.out.println("星期五");
		break;

	case 6:
		System.out.println("星期六");
		break;

	case 7:
		System.out.println("星期天");
		break;
            default:
	            System.out.println("回您自己的星球去!");
        }
        System.out.println("程序执行完毕!");
  }
}







